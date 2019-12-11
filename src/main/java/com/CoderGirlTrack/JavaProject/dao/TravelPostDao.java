package com.CoderGirlTrack.JavaProject.dao;

import com.CoderGirlTrack.JavaProject.models.TravelPost;
import com.CoderGirlTrack.JavaProject.models.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class TravelPostDao {
    @Autowired
    JdbcTemplate jdbcTemplate;


    public List<UserProfile> getAll() {
        return jdbcTemplate.query("SELECT * from  travel.posts", new UserPostRowMapper());

    }

    public void addPost(TravelPost userPost) {
        System.out.println("Inserting" + userPost);
        jdbcTemplate.update("INSERT INTO travel.posts(id, profileName, firstName, lastName, email,)" +

                        " VALUES (?,?,?,?,?)",

                usePost.getId(), userProfile.getProfileName(), userProfile.getFirstName(), userProfile.getLastName(), userProfile.getEmail());
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