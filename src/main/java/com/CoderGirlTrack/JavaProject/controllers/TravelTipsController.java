package com.CoderGirlTrack.JavaProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//maps to travel tips screen
    @Controller

    @RequestMapping("/travel_tips")

    public class TravelTipsController {
        @RequestMapping(value = "")
        public String Travel(Model model) {

            model.addAttribute("");

            return "travel_tips";
        }

        }


