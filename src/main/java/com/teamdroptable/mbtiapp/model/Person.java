package com.teamdroptable.mbtiapp.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "person")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    private String code;
}
