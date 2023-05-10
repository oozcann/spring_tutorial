package com.springtutorial.tutorial.model;

import com.springtutorial.tutorial.service.Reader;
import org.springframework.stereotype.Component;

@Component
public class ExcelFileReader implements Reader {
    @Override
    public String readFile() {
        return "EXCEL File Reader";
    }
}
