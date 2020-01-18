package com.CoderGirlTrack.JavaProject.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

    public class TravelPost {

        private int id;
        @NotNull
        @Size(min = 6, max = 15)
        private String profileName;
        @NotNull
        private String travelDate;
        @NotNull
        private String location;
        @NotNull
        private String activity;
        private int rating;
        @NotNull
        private String userPost;
        @NotNull
        private String entryDate;
        @NotNull
        private String keyword;


        public TravelPost(){}

        public TravelPost(int id, String profileName, String travelDate, String location,
                          String activity, int rating, String userPost, String entryDate, String keyword){

            this.id = id;
            this.profileName = profileName;
            this.travelDate = travelDate;
            this.location = location;
            this.activity = activity;
            this.rating = rating;
            this.userPost = userPost;
            this.entryDate = entryDate;
            this.keyword = keyword;
        }
        public TravelPost (String profileName, String travelDate, String location,
                           String activity, int rating, String userPost, String entryDate, String keyword){

            this.profileName = profileName;
            this.travelDate = travelDate;
            this.location = location;
            this.activity = activity;
            this.rating = rating;
            this.userPost = userPost;
            this.entryDate = entryDate;
            this.keyword = keyword;

        }
        //getters & setters are used for retrieving and updating the value of a variable
        //getter returns the value of the attribute
        //setter method takes a parameter & assigns it to the attribute
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

        public String getEntryDate(){ return entryDate;}

        public void setEntryDate(String entryDate) { this.entryDate = entryDate;}

        public String getKeyword(){ return keyword;}

        public void setKeyword(String keyword) { this.keyword = keyword;
        }
    }


