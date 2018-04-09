package com.in28minutes.learning.jpa.jpain10steps.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController implements ErrorController{
	
	private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public String error() {
        return "Some error has occured";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}
