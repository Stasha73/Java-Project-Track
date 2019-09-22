package com.CoderGirlTrack.JavaProject.controllers;

import com.CoderGirlTrack.JavaProject.models.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//mapping created for login
@Controller
@RequestMapping("/login.html ")

public class LoginController {
    @GetMapping("")
    public String displayLogin(Model model) {
        model.addAttribute("login",
                new Login());


        return "login";
    }
    @PostMapping("/login.html")
    public String processLogin(@ModelAttribute Login login ){
        return "returning_users";
    }
    @GetMapping("/login.html")
    public String index (Model model){
        return displayLogin(model);
    }

}
