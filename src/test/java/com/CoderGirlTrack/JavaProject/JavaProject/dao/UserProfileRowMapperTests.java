package com.CoderGirlTrack.JavaProject.JavaProject.dao;
import com.CoderGirlTrack.JavaProject.dao.UserProfileRowMapper;
import com.CoderGirlTrack.JavaProject.models.UserProfile;
import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserProfileRowMapperTests {
    @Test
    public void mapTheUserProfile() throws SQLException {

        /* This is some code that simulates what happens when Java runs
           SQL code using JDBC. It's meant to simulate a database call
           that produces this:

           ID  	PROFILE NAME  FIRST NAME  LAST NAME  EMAIL
           1    STASHA        STACIE      RAY        STASHARAY@YAHOO.COM
        */
        ResultSet rs = mock(ResultSet.class);
        when(rs.getInt("id")).thenReturn(1);
        when(rs.getString("profile_Name")).thenReturn("Stasha");
        when(rs.getString("first_name")).thenReturn("Stacie");
        when(rs.getString("last_name")).thenReturn("Ray");
        when(rs.getString("email")).thenReturn("stasharay@yahoo.com");

        //This is the call to the Row Mapper
        UserProfile mapped = new UserProfileRowMapper().mapRow(rs, 0);

        //Here, we check the result to see if it worked!
        Assert.assertEquals("id", mapped.getId());
        Assert.assertEquals("profile_Name", mapped.getProfileName());
        Assert.assertEquals("first_Name", mapped.getFirstName());
        Assert.assertEquals("last_Name", mapped.getLastName());
        Assert.assertEquals("email", mapped.getEmail());
    }
}
