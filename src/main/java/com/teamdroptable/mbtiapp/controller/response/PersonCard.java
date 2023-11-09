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
public class PersonCard {
    @Id
    private String name;
    private String description;
}
