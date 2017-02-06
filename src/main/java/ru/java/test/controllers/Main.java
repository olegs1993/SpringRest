package ru.java.test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Oleg on 16.01.2017.
 */
@Controller
@RequestMapping("/")
public class Main {
    @RequestMapping(method = RequestMethod.GET)
    public String main(){
        return "index";
    }
}
