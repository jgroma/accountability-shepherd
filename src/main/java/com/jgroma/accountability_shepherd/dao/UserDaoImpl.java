package com.jgroma.accountability_shepherd.dao;

import com.jgroma.accountability_shepherd.dao.mapper.UserMapper;
import com.jgroma.accountability_shepherd.dto.User;
import com.jgroma.accountability_shepherd.service.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Connection;
import java.sql.PreparedStatement;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    JdbcTemplate jdbc;

    @Transactional
    @Override
    public User createUser(User newUser) throws ValidationException {
        final String CREATE_USER="INSERT INTO User (Username, Email, Password) " +
                "VALUES (?,?,?);";
        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();

        try {
            jdbc.update((Connection connection) -> {
                PreparedStatement statement = connection.prepareStatement(CREATE_USER,
                        PreparedStatement.RETURN_GENERATED_KEYS);

                statement.setString(1, newUser.getUsername());
                statement.setString(2, newUser.getEmail());
                statement.setString(3, newUser.getPassword());
                return statement;
            }, keyHolder);

            newUser.setId(keyHolder.getKey().intValue());
            return newUser;

        } catch (DataIntegrityViolationException ex) {
            throw new ValidationException("This email is already registered.", ex);
        }
    }

    @Override
    public User getUser(String email) throws ValidationException {
        final String GET_USER = "SELECT * FROM User WHERE Email=?;";
        try {
            return jdbc.queryForObject(GET_USER, new UserMapper());
        } catch (EmptyResultDataAccessException ex) {
            throw new ValidationException("This email is not registered.");
        }
    }

    @Transactional
    @Override
    public void deleteUser(String email) throws ValidationException {
        User user = getUser(email);

        if (user==null) {
            throw new ValidationException("This user does not exist.");
        }

        //delete user sheep first
        final String DELETE_USER_SHEEP = "DELETE FROM Sheep WHERE UserId=?;";
        jdbc.update(DELETE_USER_SHEEP, user.getId());

        final String DELETE_USER = "DELETE FROM User WHERE Email=?;";
        jdbc.update(DELETE_USER, user.getEmail());
    }

}
