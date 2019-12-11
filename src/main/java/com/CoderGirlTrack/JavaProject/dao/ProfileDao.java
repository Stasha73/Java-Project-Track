package com.CoderGirlTrack.JavaProject.dao;

import com.CoderGirlTrack.JavaProject.models.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import javax.sql.DataSource;

@Repository

public class ProfileDao {
    @Autowired
    JdbcTemplate jdbcTemplate;


    public List<UserProfile> getAll() {
        return jdbcTemplate.query("SELECT * from  travel.users", new UserProfileRowMapper());

    }

    public void addUser(UserProfile userProfile) {
        System.out.println("Inserting" + userProfile);
        jdbcTemplate.update("INSERT INTO travel.users(id, profileName, firstName, lastName, email,)" +

                        " VALUES (?,?,?,?,?)",

                userProfile.getId(), userProfile.getProfileName(), userProfile.getFirstName(), userProfile.getLastName(), userProfile.getEmail());
    }

    public void updateUser(int id, UserProfile userProfile) {
        System.out.println("Updating" + userProfile);
        jdbcTemplate.update("UPDATE travel.users SET profileName=?, firstName=?, lastName=?, email=? where id=?" +
                userProfile.getProfileName(), userProfile.getFirstName(), userProfile.getLastName(), id, userProfile.getEmail());


    }

    public UserProfile findById(int id) {
        List<UserProfile> matches = jdbcTemplate.query("SELECT * from travel.users where id= ?",
                new Object[]{id},
                new UserProfileRowMapper());
        if (matches.isEmpty()) {
            return null;
        }
        else {
            return matches.get(0);
        }
    }
}



      /*  try {
checks to see if there's a duplicate user
            jdbcTemplate.queryForObject("SELECT email FROM travel.users WHERE profileName = ?",

                    new Object[]{userProfile.getProfileName()}, String.class);

        } catch (EmptyResultDataAccessException ex) {


            System.out.println("Inserting " + userProfile);


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

*/

