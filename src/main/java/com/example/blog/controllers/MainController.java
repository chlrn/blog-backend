package com.example.blog.controllers;

import com.example.blog.models.Post;
import com.example.blog.models.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @Autowired
    private PostRepository postRepository;

    @GetMapping("/")
    public String home(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("title", "Текст главной страницы");
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "home";
    }

}
