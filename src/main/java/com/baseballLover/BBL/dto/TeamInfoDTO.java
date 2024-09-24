package com.baseballLover.BBL.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TeamInfoDTO {

    private String teamName;      // 팀 이름 (10자)
    private String homeCity;      // 연고지 (10자)
    private int championships;    // 우승 횟수 (숫자 2자리)
    private String starPlayer;    // 주력 선수 (20자)
    private String stadiumName;   // 경기장 이름 (15자)

}
