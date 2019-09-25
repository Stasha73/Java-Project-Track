package com.CoderGirlTrack.JavaProject.dao;

import com.CoderGirlTrack.JavaProject.models.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
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

            jdbcTemplate.queryForObject("SELECT email FROM travel.users WHERE profileName = ?",

                    new Object[]{userProfile.getProfileName()}, String.class);

        } catch (EmptyResultDataAccessException ex) {


            System.out.println("Inserting " + userProfile);

            jdbcTemplate.update("INSERT INTO travel.users(profilename, firstname, lastname, password, email,)" +

                            " VALUES (?,?,?,?,?)",

                    userProfile.getProfileName(), userProfile.getFirstName(), userProfile.getLastName(), userProfile.getPassword(), userProfile.getEmail());
        }
    }
}