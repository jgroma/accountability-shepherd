package com.jgroma.accountability_shepherd.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SheepDaoImpl implements SheepDao {

    @Autowired
    JdbcTemplate jdbc;
}
