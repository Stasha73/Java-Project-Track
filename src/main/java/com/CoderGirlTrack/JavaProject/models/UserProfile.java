package com.CoderGirlTrack.JavaProject.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserProfile {
    private int id;
    @NotNull
    @Size(min = 6, max = 15)
    private String profileName;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String email;


    //data needed to create login profile

    public UserProfile() {
    }

    public UserProfile(int id, String profileName, String firstName, String lastName, String email) {

        this.id = id;
        this.profileName = profileName;
        this.firstName = firstName;
        this.lastName = lastName;
       // this.password = password;
        this.email = email;
    }

    public UserProfile(String profileName, String firstName, String lastName, String email) {
        this.profileName = profileName;
        this.firstName = firstName;
        this.lastName = lastName;
       //this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

   // public String getPassword() { return password;
    //}

   // public void setPassword(String password) {this.password = password;
   // }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Method to override the built-in toString method
    //and display a post in a format of our choosing
    @Override

    public String toString() {
        return "Username: " + this.profileName + "\n" +
                "First Name: " + this.firstName + "\n" +
                "Last Name: " + this.lastName + "\n" +
                "Email Address: " + this.email + "\n";


    }
}

