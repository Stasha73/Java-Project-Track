package com.CoderGirlTrack.JavaProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//maps to search screen
    @Controller
    @RequestMapping("/search")

    public class SearchController {

        @RequestMapping(value = "")
        public String search(Model model) {
            model.addAttribute("");
            return "search";
        }
    }


