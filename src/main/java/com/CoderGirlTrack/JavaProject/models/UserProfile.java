package com.CoderGirlTrack.JavaProject.models;

public class UserProfile {
    private int id;
    private String profileName;
    private String firstName;
    private String lastName;
    private String password;
    private String email;


    //data needed to create login profile
    public UserProfile(){}

    public UserProfile(int id, String profileName, String firstName, String lastName, String email) {
        this.id = id;
        this.profileName = profileName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    public UserProfile(String profileName, String firstName, String lastName, String email){
        this.profileName = profileName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

    }
    public int getId(){
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

    public String getPassword() {return password;}

    public void setPassword(String password) { this.password = password; }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;

    }
}
