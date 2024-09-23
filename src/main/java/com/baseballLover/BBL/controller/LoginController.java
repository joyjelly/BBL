package com.baseballLover.BBL.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping("/")
    private String goToIndex(){
        return "login";
    }
}
