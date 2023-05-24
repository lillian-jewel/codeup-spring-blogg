package com.codeup.codespringblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String posts() {
        return "Index Page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String postsId() {
        return "View individual post";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String postsGET() {
        return "GET Form for creating a post";
    }

}
