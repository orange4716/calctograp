package com.rionsoft.calctograp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String getIndex(){
        return "index";
    }
    @RequestMapping("/test/msg")
    public String getParam(){
        System.out.println("thisisisisissi");
        return "index";
    }

}
