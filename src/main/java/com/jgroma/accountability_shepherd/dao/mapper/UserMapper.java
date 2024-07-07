package com.jgroma.accountability_shepherd.dao.mapper;

import com.jgroma.accountability_shepherd.dto.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        return null;
    }
}
