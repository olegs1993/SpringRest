package ru.java.test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.java.test.Dao.ListWeb;
import ru.java.test.entities.Web;

/**
 * Created by Oleg on 16.01.2017.
 */
@Controller
@RequestMapping(value = "/myservice",headers="Accept=application/json")
public class RestController {
    @Autowired
    @Qualifier("ListWeb")
    ListWeb listWeb;
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Web getMyData() {
      Web web= listWeb.getWeb().get(0);
        return  web;
    }
}
