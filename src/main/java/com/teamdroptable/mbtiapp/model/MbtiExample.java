package com.teamdroptable.mbtiapp.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "mbti_example")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class MbtiExample {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type;
    private String comments;
}
