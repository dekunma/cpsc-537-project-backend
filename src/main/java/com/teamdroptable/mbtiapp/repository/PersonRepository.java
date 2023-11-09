package com.teamdroptable.mbtiapp.repository;

import com.teamdroptable.mbtiapp.controller.response.PersonResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonRepository extends JpaRepository<PersonResponse, Integer> {
    @Query(value = "select p.name, " +
            "p.code, " +
            "md.label, " +
            "md.description as description, " +
            "md.first_function, " +
            "md.second_function, " +
            "md.third_function, " +
            "md.fourth_function, " +
            "mm.movie, " +
            "m1.description as description100," +
            "m1.total_votes," +
            "m1.first_letter_votes_percentage," +
            "m1.second_letter_votes_percentage," +
            "m1.third_letter_votes_percentage," +
            "m1.fourth_letter_votes_percentage " +
            "from person p " +
            "left join mbti_details md on p.code = md.code " +
            "left join mbti_movie mm on p.name = mm.name " +
            "left join mbti_100 m1 on p.name = m1.name " +
            "where p.name = ?1", nativeQuery = true)
    PersonResponse getPersonByName(String name);

    // https://stackoverflow.com/questions/249301/simple-random-samples-from-a-mysql-sql-database
    @Query(value = "select p.name, " +
            "p.code, " +
            "md.label, " +
            "md.description as description, " +
            "md.first_function, " +
            "md.second_function, " +
            "md.third_function, " +
            "md.fourth_function, " +
            "mm.movie, " +
            "m1.description as description100," +
            "m1.total_votes," +
            "m1.first_letter_votes_percentage," +
            "m1.second_letter_votes_percentage," +
            "m1.third_letter_votes_percentage," +
            "m1.fourth_letter_votes_percentage " +
            "from person p " +
            "left join mbti_details md on p.code = md.code " +
            "left join mbti_movie mm on p.name = mm.name " +
            "left join mbti_100 m1 on p.name = m1.name " +
            "where rand() <= 0.001", nativeQuery = true)
    List<PersonResponse> getRandomPeople();
}
