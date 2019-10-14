package com.CoderGirlTrack.JavaProject.controllers;


import com.CoderGirlTrack.JavaProject.models.Post;
import com.CoderGirlTrack.JavaProject.models.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.CoderGirlTrack.JavaProject.dao.ProfileDao;


import javax.validation.Valid;
import java.util.List;

@SpringBootApplication
    @Controller
    @RequestMapping("")
@Component
//Root path: /welcome
    public class WelcomeController {
    @Autowired
    private ProfileDao ProfileDao;

        @GetMapping("/register")
        public String displayUserProfile(Model model ) {
            List<UserProfile> userProfile = ProfileDao.getAll();
            model.addAttribute("userProfile",
                    new UserProfile());

            return "index";
        }
        @PostMapping("/register")
        public String processUserProfile(@ModelAttribute @Valid UserProfile userProfile, Errors errors, Model model ) {
            List<UserProfile> profileList = ProfileDao.getAll();
            if (errors.hasErrors()){
                model.addAttribute("userProfile",
                        new UserProfile());

                return "index";
        }
           else {
                return "user_results";
            }
       }
        @GetMapping("")
        public String index (Model model){

            return displayUserProfile(model);
        }
    @GetMapping("/userPost")
    public String displayPostPage(Model model) {
        model.addAttribute("post",
                new Post());
        return "posts";
    }
    @PostMapping("/userPost")
    public String processPostPage(@ModelAttribute @Valid Post post, Errors errors, Model model) {
            if (errors.hasErrors()){
                model.addAttribute("post", new Post());
            }

        return "post_results";
    }
}