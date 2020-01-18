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


    public List<TravelPost> getAll() {
        return jdbcTemplate.query("SELECT * from  travel.posts", new UserPostRowMapper());

    }

    public void addPost(TravelPost travelPost) {
        System.out.println("Inserting" + travelPost);
        jdbcTemplate.update("INSERT INTO travel.posts(id, profileName, travelDate, location, activity, rating, " +
                        "userPost, entryDate, keyword)  VALUES (?,?,?,?,?)",

                travelPost.getId(), travelPost.getProfileName(),travelPost.getTravelDate(), travelPost.getLocation(), travelPost.getActivity(),
                travelPost.getRating(), travelPost.getUserPost(), travelPost.getEntryDate(), travelPost.getKeyword());
    }

    public void updateUser(int id, TravelPost travelPost) {
        System.out.println("Updating" + travelPost);
        jdbcTemplate.update("UPDATE travel.posts SET profileName=?, travelDate=?, location=?, activity=?, rating=?, userPost=?, " +
                "entryDate=?, keyword=? where id=?" +

                travelPost.getProfileName(), travelPost.getTravelDate(), travelPost.getLocation(), travelPost.getActivity(),
                travelPost.getRating(), travelPost.getUserPost(), travelPost.getEntryDate(), travelPost.getKeyword(), id);


    }

    public TravelPost findById(int id) {
        List<TravelPost> matches = jdbcTemplate.query("SELECT * from travel.posts where id= ?",
                new Object[]{id},
                new UserPostRowMapper());
        if (matches.isEmpty()) {
            return null;
        }
        else {
            return matches.get(0);
        }
    }
}


