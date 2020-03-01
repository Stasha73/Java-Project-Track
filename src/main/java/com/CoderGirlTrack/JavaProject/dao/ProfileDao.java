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

    //lists all the profiles stored in SQL
    public List<UserProfile> getAll() {
        return jdbcTemplate.query("SELECT * from  travel.users", new UserProfileRowMapper());

    }

    //method created to add additional profiles
    public void addUser(UserProfile userProfile) {
        System.out.println("Inserting" + userProfile);
        jdbcTemplate.update("INSERT INTO travel.users( profileName, firstName, lastName, email,)" +

                        " VALUES (?,?,?,?)",

                userProfile.getProfileName(), userProfile.getFirstName(), userProfile.getLastName(), userProfile.getEmail());
    }

    //method created to update profiles
    public void updateUser(int id, UserProfile userProfile) {
        System.out.println("Updating" + userProfile);
        jdbcTemplate.update("UPDATE travel.users SET profileName=?, firstName=?, lastName=?, email=? where id=?" ,
                userProfile.getProfileName(), userProfile.getFirstName(), userProfile.getLastName(), userProfile.getEmail(), id);


    }
    //method to delete profile
    public void deleteUser (int id, UserProfile userProfile){
        System.out.println("Deleting" + userProfile);
        jdbcTemplate.update("DELETE FROM travel.users (profileName, firstName, lastName, email,) " +
                "VALUES (?,?,?,?)",
                userProfile.getProfileName(), userProfile.getFirstName(), userProfile.getLastName(), userProfile.getEmail(), id);

    }

    public UserProfile findById(int id) {
        List<UserProfile> matches = jdbcTemplate.query("SELECT * from travel.users where id= ?",
                new Object[]{id},
                new UserProfileRowMapper());
        if (matches.isEmpty()) {
            return null;
        } else {
            return matches.get(0);
        }

    }
}




