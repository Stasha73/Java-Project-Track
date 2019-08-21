package com.CoderGirlTrack.JavaProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller

//Establishes a base path:/login for every method in this controller

public class LoginController {

            @RequestMapping (value = "user", method=RequestMethod.GET)
        public String displayUserProfile (Model model){
                return "loginPage";
        }
        @RequestMapping (value = "user", method=RequestMethod.POST)
        public String processUserProfile (Model model){
//use Model to pass data to the view(template)

                return "loginPage";

        }


        }


