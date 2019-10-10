package com.CoderGirlTrack.JavaProject.dao;

import com.CoderGirlTrack.JavaProject.models.UserProfile;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserProfileRowMapper implements RowMapper<UserProfile> {

    public UserProfile mapRow(ResultSet resultSet, int ignoreThis) throws SQLException {
      //  UserProfile userprofile = new UserProfile();

        int id = resultSet.getInt("id");
        String profileName = resultSet.getString("profile_name");
        String firstName = resultSet.getString("first_name");
        String lastName = resultSet.getString("last_name");
        String email = resultSet.getString("email");

        return new UserProfile(id, profileName, firstName, lastName, email );
    }
}
