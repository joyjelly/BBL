package com.baseballLover.BBL.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
    @GetMapping("/board")
    private String boardMain(){


        return "board";
    }
}
