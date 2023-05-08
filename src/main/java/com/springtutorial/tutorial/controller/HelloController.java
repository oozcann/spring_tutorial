package com.springtutorial.tutorial.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api")
public class HelloController {

    @GetMapping(path = "/hello")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping(path = "/message/{message}")
    public String getMessage (@PathVariable String message) {
        return "Your message is : " + message;
    }

    @PostMapping(path = "/save")
    public String save () {
        System.out.println("Data saved successfully");
        return "Data kaydedildi.";
    }

    @DeleteMapping(path = "/delete")
    public String delete () {
        System.out.println("Data deleted successfully");
        return "Data Silindi";
    }




}
