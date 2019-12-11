package com.CoderGirlTrack.JavaProject.controllers;


import com.CoderGirlTrack.JavaProject.dao.ProfileDao;
import com.CoderGirlTrack.JavaProject.models.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;


//@SpringBootApplication
    @Controller
 // @RequestMapping("")


    public class WelcomeController {
    @Autowired

    private ProfileDao profileDao;

    //displays home page
    @GetMapping("")
    public String HomePage(Model model) {
        return "about.html";
    }


    //provides list of  profiles stored in database
    //Root path: user
    @RequestMapping(value = "/viewUser", method = GET)
    public String viewUserProfile(Model model) {
        List<UserProfile> userProfile = profileDao.getAll();
        model.addAttribute(("userProfile"), userProfile);
        model.addAttribute("count", userProfile.size());

        return "profilePage.html";

    }
}


  /*  @RequestMapping(value = "/viewUser", method = POST)
    public String AddNewUser(Model model, @RequestParam String profileName,
                                 @RequestParam String firstName,
                                 @RequestParam String lastName,
                                 @RequestParam String email) {
        model.addAttribute("profileName", profileName);
        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);
        model.addAttribute("email", email);
        System.out.println("Saved it..." + profileName + "" + firstName + "" + lastName + "" + email);



        profileDao.addUser(new UserProfile(-1, profileName, firstName, lastName, email));
        return "user_results.html";
    }
}*/






