package com.jgroma.accountability_shepherd.dao.mapper;

import com.jgroma.accountability_shepherd.dto.Sheep;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SheepMapper implements RowMapper<Sheep> {
    @Override
    public Sheep mapRow(ResultSet rs, int rowNum) throws SQLException {
        Sheep sheep  = new Sheep();
        sheep.setId(rs.getInt("SheepId"));
        sheep.setName(rs.getString("Name"));
        sheep.setPurpose(rs.getString("Purpose"));
        sheep.setPersonality(rs.getString("Personality"));
        sheep.setAge(rs.getInt("Age"));
        sheep.setSkin(rs.getString("Skin"));
        sheep.setFrequencyInDays(rs.getInt("FrequencyInDays"));
        sheep.setStatus(rs.getString("Status"));
        sheep.setHealth(rs.getInt("Health"));
        sheep.setDateCreated(rs.getDate("DateCreated").toLocalDate());
        sheep.setDateLastFed(rs.getDate("DateLastFed").toLocalDate());
        sheep.setUserId(rs.getInt("UserId"));
        return sheep;
    }
}
