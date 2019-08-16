package com.CoderGirlTrack.JavaProject.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping(value = "")


public class HelloController {

    @GetMapping(value = "")
    public String loadWelcomePage(Model model){
        return "index";
    }




    }


