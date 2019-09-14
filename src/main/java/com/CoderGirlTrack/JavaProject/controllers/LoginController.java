package com.CoderGirlTrack.JavaProject.controllers;

import com.CoderGirlTrack.JavaProject.models.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(" ")

public class LoginController {
    @GetMapping("/login")
    public String displayLogin(Model model) {
        model.addAttribute("login",
                new Login());

        return "login";
    }
    @PostMapping(value = "/login")
    public String processLogin(@ModelAttribute Login login ){
        return "loginResult";
    }


}
