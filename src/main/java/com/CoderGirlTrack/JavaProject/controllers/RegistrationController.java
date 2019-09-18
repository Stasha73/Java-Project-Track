package com.CoderGirlTrack.JavaProject.controllers;


import com.CoderGirlTrack.JavaProject.models.UserProfile;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication

@Controller
@RequestMapping("")
//Root path: /welcome

public class RegistrationController {

    @GetMapping("/register")
    public String displayUserProfile(Model model) {
        model.addAttribute("userProfile",
                new UserProfile());

        return "index";
    }

    @PostMapping("/register")
    public String processUserProfile(@ModelAttribute UserProfile  userProfile ) {
    return "user_results";


    }
    @GetMapping("")
    public String index (Model model){
        return displayUserProfile(model);
    }
}
