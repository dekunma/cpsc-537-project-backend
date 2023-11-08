package com.teamdroptable.mbtiapp.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "mbti_movie")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class MbtiMovie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    private String description;
    private String totalVotes;
    private String firstLetterVotesPercentage;
    private String secondLetterVotesPercentage;
    private String thirdLetterVotesPercentage;
    private String fourthLetterVotesPercentage;
}
