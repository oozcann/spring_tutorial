package com.springtutorial.tutorial.model;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class MyComponent {

    public MyComponent(){
        System.out.println("Component has been created!");
    }


}
