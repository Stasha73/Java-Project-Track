package com.CoderGirlTrack.JavaProject.dao;

import com.CoderGirlTrack.JavaProject.models.UserProfile;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserProfileRowMapper implements RowMapper {

    public UserProfile mapRow(ResultSet resultSet, int unused) throws SQLException {

        int id = resultSet.getInt("id");
        String profileName = resultSet.getString("profile_name");
        String firstName = resultSet.getString("first_name");
        String lastName = resultSet.getString("last_name");
        String password = resultSet.getString("password");
        String email = resultSet.getString("email");

        return new UserProfile(id, profileName, firstName, lastName, password, email );
    }
}
