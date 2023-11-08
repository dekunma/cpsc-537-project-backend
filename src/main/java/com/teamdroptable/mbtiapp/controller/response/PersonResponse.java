package com.teamdroptable.mbtiapp.controller.response;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class PersonResponse {
    @Id
    private String name;
    private String code;
    private String label;
    private String description;
    private String firstFunction;
    private String secondFunction;
    private String thirdFunction;
    private String fourthFunction;
    private String movie;
    private String description100;
    private Integer totalVotes;
    private String firstLetterVotesPercentage;
    private String secondLetterVotesPercentage;
    private String thirdLetterVotesPercentage;
    private String fourthLetterVotesPercentage;
}
