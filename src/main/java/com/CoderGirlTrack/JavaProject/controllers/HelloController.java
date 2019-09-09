package com.CoderGirlTrack.JavaProject.controllers;


import com.CoderGirlTrack.JavaProject.controllers.models.UserProfile;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication

@Controller
@RequestMapping("")
//Root path: /welcome

public class HelloController {

    @GetMapping("/login")
    public String displayUserProfile(Model model) {
        model.addAttribute("userProfile",
                new UserProfile());

        return "index";
    }

    @PostMapping("/login")
    public String processUserProfile(@ModelAttribute UserProfile  userProfile ) {
    return "result";


    }
}
