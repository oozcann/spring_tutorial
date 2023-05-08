package com.springtutorial.tutorial.controller;

import com.springtutorial.tutorial.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "users")
public class UserController {


    @PostMapping(path = "save")
    public User saveUser (@RequestBody User user) {
        System.out.println("User saved successfully");
        return user;
    }

    @GetMapping(path = "header")
    public String getHeader(@RequestHeader("User-Agent") String header){
        return header;
    }



}
