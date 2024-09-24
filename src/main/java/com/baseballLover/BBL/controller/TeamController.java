package com.baseballLover.BBL.controller;


import com.baseballLover.BBL.entity.TeamInfo;
import com.baseballLover.BBL.service.TeamInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TeamController {
    @Autowired
    private TeamInfoService teamInfoService;

    @GetMapping("/team")
    private String teamMain(Model model){
        List<TeamInfo> teamInfos = teamInfoService.getAllTeams();
        model.addAttribute("teams",teamInfos);

        return "team";
    }
}
