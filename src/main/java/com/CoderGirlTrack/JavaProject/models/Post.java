package com.CoderGirlTrack.JavaProject.models;

public class Post {
    private int id;
    private String userPost;
    private String travelDate;
    private String location;
    private String destination;
    private int rating;

    public Post(){}
    public Post(int id, String userPost, String travelDate, String location, String destination, int rating){
       this.id = id;
        this.userPost = userPost;
        this.travelDate = travelDate;
        this.location = location;
        this.destination = destination;
        this.rating = rating;
    }

    public Post (String userPost, String travelDate, String location, String destination, int rating){
        this.userPost = userPost;
        this.travelDate = travelDate;
        this.location = location;
        this.destination = destination;
        this.rating = rating;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
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
}
