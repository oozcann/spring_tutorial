package com.springtutorial.tutorial.controller;

import com.springtutorial.tutorial.model.MyComponent;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LazyController {
    private MyComponent myComponent;

    public LazyController (MyComponent myComponent){
        this.myComponent = myComponent;
    }

}
