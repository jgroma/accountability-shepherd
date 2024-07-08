package com.jgroma.accountability_shepherd.dao;

import com.jgroma.accountability_shepherd.dto.User;
import com.jgroma.accountability_shepherd.service.ValidationException;

public interface UserDao {
    User createUser(User newUser) throws ValidationException;
    User getUser(String email) throws ValidationException;
    void deleteUser(String email) throws ValidationException;
}
