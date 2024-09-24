package com.baseballLover.BBL.service;

import com.baseballLover.BBL.entity.TeamInfo;
import com.baseballLover.BBL.repository.TeamInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamInfoService {
    @Autowired
    private TeamInfoRepository teamInfoRepository;

    public List<TeamInfo> getAllTeams(){
        return teamInfoRepository.findAll();
    }
}
