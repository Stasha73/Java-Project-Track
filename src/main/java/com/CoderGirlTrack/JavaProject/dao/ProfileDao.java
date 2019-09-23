package com.CoderGirlTrack.JavaProject.dao;

import com.CoderGirlTrack.JavaProject.models.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;


import javax.sql.DataSource;
import java.util.List;

@Repository

public class ProfileDao {
   @Autowired
   JdbcTemplate jdbcTemplate;

   public List<UserProfile> getAll() {

      return jdbcTemplate.query("select * from travel.users",
              new UserProfileRowMapper());

   }

   public void addUserProfile(UserProfile userProfile) {

      System.out.println("Inserting " + userProfile);

      jdbcTemplate.update(

              "INSERT INTO travel.users(id, profileName, first_name, last_name, email) VALUES (?,?)",

              userProfile.getId(), userProfile.getProfileName(), userProfile.getFirstName(), userProfile.getLastName(),
              userProfile.getEmail());

   }


   public void updateBookmark(int id, UserProfile userProfile) {

      System.out.println("Updating " + userProfile);

      jdbcTemplate.update(

              "UPDATE travel.users SET title=?, address=? where id=?",

              userProfile.getTitle(), bookmark.getWebAddress(), id);

   }


   public UserProfile findById(int id) {

      List<UserProfile> matches = jdbcTemplate.query(

              "select * from travel.users where id = ?",

              new Object[]{id},

              new UserProfileRowMapper());

      if (matches.isEmpty()) {

         return null;

      } else {

         return matches.get(0);

      }


      public List<UserProfile> getAll () {
         return jdbcTemplate.query("select * from  travel.users", new UserProfileRowMapper());

      }
   }
}





