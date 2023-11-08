package com.teamdroptable.mbtiapp.model;

import com.teamdroptable.mbtiapp.enums.MbtiFunctions;
import com.teamdroptable.mbtiapp.enums.MbtiTypes;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "mbti_details")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class MbtiDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private MbtiTypes code;
    private String label;
    private String description;
    private MbtiFunctions firstFunction;
    private MbtiFunctions secondFunction;
    private MbtiFunctions thirdFunction;
    private MbtiFunctions FourthFunction;
}
