package com.springtutorial.tutorial.controller;

import com.springtutorial.tutorial.model.FirstClass;
import com.springtutorial.tutorial.model.SecondClass;
import com.springtutorial.tutorial.service.Reader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(path = "api")
public class MyController {


    @Autowired
    FirstClass firstClass;
    @Autowired
    SecondClass secondClass;

    @Autowired
    @Qualifier("pdfFileReader")
    Reader reader;

    @GetMapping(path = "/first-class")
    public String getFirstClassName () {
        return firstClass.getName();
    }

    @GetMapping(path = "/second-class")
    public String getSecondClassName () {
        return secondClass.getName();
    }

    @GetMapping(path = "/reader")
    public String getReader () {
        return reader.readFile();
    }


}
