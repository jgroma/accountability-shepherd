package com.jgroma.accountability_shepherd.dao;

import com.jgroma.accountability_shepherd.TestApplicationConfiguration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = TestApplicationConfiguration.class)
class UserDaoImplTest {

    @Autowired
    UserDao dao;

    @Autowired
    JdbcTemplate jdbc;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
}