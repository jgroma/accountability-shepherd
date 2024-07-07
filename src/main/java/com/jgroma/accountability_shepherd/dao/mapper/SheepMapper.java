package com.jgroma.accountability_shepherd.dao.mapper;

import com.jgroma.accountability_shepherd.dto.Sheep;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SheepMapper implements RowMapper<Sheep> {
    @Override
    public Sheep mapRow(ResultSet rs, int rowNum) throws SQLException {
        return null;
    }
}
