package com.springtutorial.tutorial.model;

import com.springtutorial.tutorial.service.Reader;
import org.springframework.stereotype.Component;

@Component
public class PdfFileReader implements Reader {
    @Override
    public String readFile() {
        return "PDF File Reader";
    }
}
