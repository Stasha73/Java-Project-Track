package com.CoderGirlTrack.JavaProject.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Post {

    private int id;
    @NotNull
    @Size(min = 6, max = 15)
    private String profileName;
    @NotNull
    @Size(min = 6, max = 10)
    private String travelDate;
    @NotNull
    private String location;
    @NotNull
    private String activity;
    private int rating;
    @NotNull
    private String userPost;


    public Post(){}

    public Post(int id, String profileName,  String travelDate, String location,
                String activity, int rating, String userPost){

        this.id = id;
        this.profileName = profileName;
        this.travelDate = travelDate;
        this.location = location;
        this.activity = activity;
        this.rating = rating;
        this.userPost = userPost;
    }
    public Post (String profileName, String travelDate, String location, String activity,
                 int rating, String userPost)
    {
        this.profileName = profileName;
        this.travelDate = travelDate;
        this.location = location;
        this.activity = activity;
        this.rating = rating;
        this.userPost = userPost;

   }
    public int getId(){
        return id;
   }

    public void setId(int id){
        this.id = id;
    }

    public String getProfileName(){ return profileName;}

    public void setProfileName(String profileName){this.profileName = profileName;}

    public String getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getActivity() { return activity;}

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public int getRating() {
        return rating;
    }

    public String getUserPost() {
        return userPost;
    }

    public void setUserPost(String userPost) {
        this.userPost = userPost;
    }

}
