package com.CoderGirlTrack.JavaProject.dao;

import com.CoderGirlTrack.JavaProject.models.UserProfile;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserProfileRowMapper implements RowMapper<UserProfile> {

    public UserProfile mapRow(ResultSet resultSet, int ignoreThis) throws SQLException {
      //  UserProfile userProfile = new UserProfile();

        int id = resultSet.getInt("id");
        String profileName = resultSet.getString("profileName");
        String firstName = resultSet.getString("firstName");
        String lastName = resultSet.getString("lastName");
        String email = resultSet.getString("email");

        return new UserProfile(id, profileName, firstName, lastName, email );
    }
}
