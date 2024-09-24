package com.baseballLover.BBL.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping("/login")
    private String goToLogin(){
        return "login";
    }

    @RequestMapping("/")
    private String goToIndex(){
        return "index";
    }

}
