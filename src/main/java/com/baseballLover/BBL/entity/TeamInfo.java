package com.baseballLover.BBL.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "team_info")  // team_info 테이블과 매핑
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamInfo {

    @Id  // team_name을 기본키로 설정
    @Column(name = "team_name", length = 30, nullable = false)
    private String teamName;      // 팀 이름 (10자)

    @Column(name = "home_city", length = 30, nullable = false)
    private String homeCity;      // 연고지 (10자)

    @Column(name = "championships", nullable = false)
    private int championships;     // 우승 횟수 (숫자 2자리)

    @Column(name = "star_player", length = 60, nullable = false)
    private String starPlayer;     // 주력 선수 (20자)

    @Column(name = "stadium_name", length = 45, nullable = false)
    private String stadiumName;    // 경기장 이름 (15자)
}
