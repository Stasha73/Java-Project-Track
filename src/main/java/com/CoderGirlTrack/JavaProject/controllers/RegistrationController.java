package com.CoderGirlTrack.JavaProject.controllers;


import com.CoderGirlTrack.JavaProject.models.UserProfile;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@SpringBootApplication

@Controller
@RequestMapping("")
//Root path: /register

public class RegistrationController {

    @GetMapping("/register")
    public String displayUserProfile(Model model) {
        model.addAttribute("userProfile",
                new UserProfile());
        return "index";
    }

    @PostMapping("/register")
    public String processUserProfile(@ModelAttribute @Valid UserProfile  userProfile, Errors errors, Model model) {
        if (errors.hasErrors()){
            model.addAttribute("userProfile", new UserProfile());

            return "index";

        }

    return "user_results";

    }
    @GetMapping("")
    public String index (Model model){
        return displayUserProfile(model);
    }
//displays the home page

    @RequestMapping(value = "/redirect", method = RequestMethod.GET)
    public String redirect() {
        return "redirect:finalPage";
    }
}


