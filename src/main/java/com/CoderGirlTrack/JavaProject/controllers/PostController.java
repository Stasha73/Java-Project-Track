package com.CoderGirlTrack.JavaProject.controllers;

import com.CoderGirlTrack.JavaProject.dao.TravelPostDao;
import com.CoderGirlTrack.JavaProject.models.TravelPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller


public class PostController {
    @Autowired

    private TravelPostDao travelPostDao;

    //displays user post page
    @RequestMapping(value = "/userPosts", method = GET)
    public String displayPostPage(Model model) {
        model.addAttribute("TravelPost", new TravelPost());

        return "posts.html";

    }

    @RequestMapping(value = "/userPost, method = POST")
    public String processPostPage(@ModelAttribute @Valid TravelPost travelPost, Errors errors, Model model) {

        if (errors.hasErrors()) {

            model.addAttribute("travelPost",

                    new TravelPost());

            return "posts.html";

        } else {

            return "post_results.html";

        }
    }
}













