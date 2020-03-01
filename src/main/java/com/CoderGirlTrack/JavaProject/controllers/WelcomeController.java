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
    @RequestMapping(value = "/", method = GET)
    public String HomePage(Model model) {
        return "about.html";
    }


    //provides list of  profiles stored in database
    //Root path: viewUser
    @RequestMapping(value = "/viewUser", method = GET)
    public String viewUserProfile(Model model) {
        List<UserProfile> userProfiles = profileDao.getAll();
        model.addAttribute(("userProfiles"),  userProfiles);
        model.addAttribute("count", userProfiles.size());

        return "profilePage.html";

    }
    @RequestMapping(value = "/new")
    public String loadNewUserPage(){
        return "profilePageNew.html";
    }


    @RequestMapping(value = "/addUser", method = POST)
    public String addNewUser(Model model, @RequestParam String profileName,
                             @RequestParam String firstName,
                             @RequestParam String lastName,
                             @RequestParam String email) {
        model.addAttribute("profileName", profileName);
        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);
        model.addAttribute("email", email);
        System.out.println("Saved it..." + profileName + "" + firstName + "" + lastName + "" + email);


        profileDao.addUser(new UserProfile(-1, profileName, firstName, lastName, email));

        return confirmSavedUser(model);
    }

    @RequestMapping(value = "/addUser", method = GET)
    public String confirmSavedUser(Model model){
        List<UserProfile> userProfiles = profileDao.getAll();
        model.addAttribute("userProfiles", userProfiles);
        model.addAttribute("count", userProfiles.size());

        return "user_results.html";

}
/*displays object data into form  for the given id.
The @PathVariable puts URL data into variable
 */
    @RequestMapping(value="/edit/{id}", method=GET)
    public String viewUser(Model model, @PathVariable int id) {
        UserProfile userProfile = profileDao.findById(id);
        model.addAttribute("userProfile",  userProfile);

        return "profilePageEdit.html";
    }

    //allows you to edit user profile and redirect back to the profile page
    @RequestMapping(value="/edit/{id}", method=POST)
    public String editUser(@ModelAttribute  UserProfile userProfile, @PathVariable int id) {
        profileDao.updateUser(id, userProfile);
        return "redirect:/viewUser";

    }

    @RequestMapping(value = "/deleteUser/{id}", method = GET)
    public String confirmDeletedUser(Model model, @PathVariable int id) {
        UserProfile userProfile = profileDao.findById(id);
        model.addAttribute("userProfile", userProfile);
                return "profilePageDelete";
    }

    @RequestMapping(value="/deleteUser/{id}", method=POST)
    public String deleteUser(@ModelAttribute UserProfile userProfile, @PathVariable int id) {
        profileDao.deleteUser( id, userProfile);
        return "redirect:/viewUser";


    }

    @RequestMapping(value="/tips", method=GET)
    public String displayTravelTipsPage(Model model){
        return "travel_tips.html";
    }

    @RequestMapping(value="/contact", method=GET)
    public String displayContactPage(){
        return "contact.html";
    }

    @RequestMapping(value="/search", method=GET)
    public String  displaySearchPage(){
        return "searchPage.html";
    }
}








