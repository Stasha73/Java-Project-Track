package com.CoderGirlTrack.JavaProject.controllers;

import com.CoderGirlTrack.JavaProject.models.Post;
import com.CoderGirlTrack.JavaProject.models.UserProfile;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
/*

   @SpringBootApplication
    @Controller
    @RequestMapping("/userPost")

//Root path: /userPost
    public class PostController {
/*
       @GetMapping("")
       public String displayPostPage(Model model) {
           model.addAttribute("userPost",
                   new Post());
           return "posts";
       }

       @PostMapping("")
       public String processPostPage(@ModelAttribute @Valid Post post, Errors errors, Model model) {
           if (errors.hasErrors()) {
               model.addAttribute("post",
                       new Post());
               return "posts";
           } else {
               return "return_results";
           }


       }

       @GetMapping("")
       public String index(Model model) {
           return displayPostPage(model);
       }
   }
*/


