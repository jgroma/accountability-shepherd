package com.jgroma.accountability_shepherd.service;

import com.jgroma.accountability_shepherd.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
}
