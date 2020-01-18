package com.CoderGirlTrack.JavaProject.dao;

import com.CoderGirlTrack.JavaProject.models.TravelPost;
import com.CoderGirlTrack.JavaProject.models.UserProfile;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserPostRowMapper implements RowMapper<TravelPost> {

    public TravelPost mapRow(ResultSet resultSet, int ignoreThis) throws SQLException {
        //  UserProfile userProfile = new UserProfile();

        //int id, String profileName, String travelDate, String location,
        //                          String activity, int rating, String userPost, String entryDate, String keyword

        int id = resultSet.getInt("id");
        String profileName = resultSet.getString("profileName");
        String travelDate = resultSet.getString("travelDate");
        String location = resultSet.getString("location");
        String activity = resultSet.getString("activity");
        int rating = resultSet.getInt("rating");
        String userPost = resultSet.getString("userPost");
        String entryDate = resultSet.getString("entryDate");
        String keyword = resultSet.getString("keyword");


        return new TravelPost(id, profileName, travelDate, location, activity, rating, userPost, entryDate, keyword);
    }
}

