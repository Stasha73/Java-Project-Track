package com.CoderGirlTrack.JavaProject.dao;

import com.CoderGirlTrack.JavaProject.models.UserProfile;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserProfileRowMapper {
            //Rowmapper sets the variable for the DAO
        public UserProfile mapRow(ResultSet resultSet, int ignoreThis) throws SQLException {
            int id;
            String profileName;
            String firstName;
            String lastName;
            String password;
            String email;

            /* Replace these temporary bindings by requesting
             * columns from resultSet
             * */
            id = resultSet.getInt("id");
            profileName = resultSet.getString("profile_name");
            firstName = resultSet.getString("first_name");
            lastName = resultSet.getString("last_name");
            password = resultSet.getString("password");
            email = resultSet.getString("email");

        /*
        Replacement bindings go above
         */

            return new UserProfile(id, profileName, firstName, lastName, password, email);
        }
    }


