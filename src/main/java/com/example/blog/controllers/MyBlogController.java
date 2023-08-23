package com.example.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyBlogController {

    @GetMapping("/my_blog")
    public String blog(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("title", "Блог");
        return "my_blog";
    }
}
