package com.CoderGirlTrack.JavaProject.dao;

import com.CoderGirlTrack.JavaProject.models.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository


public class ProfileDao {
    @Autowired
    JdbcTemplate jdbcTemplate;


    public List<UserProfile> getAll() {
        return jdbcTemplate.query("SELECT * FROM  travel.users", new UserProfileRowMapper());

    }

    public void addUser(UserProfile userProfile) {
        try {
//checks to see if there's a duplicate user
            jdbcTemplate.queryForObject("SELECT email FROM travel.users WHERE profileName = ?",

                    new Object[]{userProfile.getProfileName()}, String.class);

        } catch (EmptyResultDataAccessException ex) {


            System.out.println("Inserting " + userProfile);

            jdbcTemplate.update("INSERT INTO travel.users(profile_name, first_name, last_name, email,)" +

                            " VALUES (?,?,?,?,?)",

                    userProfile.getProfileName(), userProfile.getFirstName(), userProfile.getLastName(), userProfile.getEmail());
        }


    }
    public void updateUserProfile (int id, UserProfile userProfile ){
        System.out.println( "Updating " + userProfile);
        jdbcTemplate.update("UPDATE INTO travel.users SET profile_name=?, first_name=?, last_name=?, email=?");
        userProfile.getProfileName(), userProfile.getFirstName(), userProfile.getLastName(), userProfile.getEmail(), id)
    }
    public UserProfile findById(int id) {

        List<UserProfile> matches = jdbcTemplate.query("SELECT * FROM travel.users WHERE id=?",

                new Object[] { id },

                new UserProfileRowMapper());

        if(matches.isEmpty()) {

            return null;

        }

        else {

            return matches.get(0);

        }

    }

}