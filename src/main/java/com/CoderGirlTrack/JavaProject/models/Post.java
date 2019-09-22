package com.CoderGirlTrack.JavaProject.models;

public class Post {
    //Static variable that stores how many posts have been created, so that ea post is unique

    private static int postIdCounter = 0;
    private int id;
    private UserProfile profileName;
    private String userPost;
    private String travelDate;
    private String location;
    private String destination;
    private int rating;

    //default constructor
    public Post(){
        postIdCounter++;
        this.id = postIdCounter;
    }

    public Post(int id, String userPost, String travelDate, String location, String destination, int rating){
       //Updates static post counter variable by 1
        postIdCounter++;
        //Sets post id to current post counter value
        this.id = postIdCounter;
        this.profileName = profileName;
        this.userPost = userPost;
        this.travelDate = travelDate;
        this.location = location;
        this.destination = destination;
        this.rating = rating;
    }


    public int getId(){

        return this.id;
    }

    public void setPostIdCounter(int postIdCounter) {
        this.id = id;
    }
    public String getProfileName() {
        return profileName.getProfileName();
    }

    public void setUser(UserProfile profileName) {
    this.profileName = profileName;
    }

    public String getuserPost() {
        return userPost;
    }

    public void setUserPost(String userPost) {
        this.userPost = userPost;
    }

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

    public String getDestination() { return destination;}

    public void setDestination(String destination) { this.destination = destination; }

    public int getRating() {
        return rating;
    }

    public void setEmail(int rating) {
        this.rating = rating;}

    //Method to override the built-in toString method

    //and display a post in a format of our choosing

    public String toStringPost() {

        return "Post number: " + this.id + "\n" +

                this.content + "\n" +

                "Written by: " + profileName.getUserName() + "\n" +
}
