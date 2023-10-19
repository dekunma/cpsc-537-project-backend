package com.teamdroptable.mbtiapp.repository;

import com.teamdroptable.mbtiapp.model.MbtiExample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MbtiExampleRepository extends JpaRepository<MbtiExample, Integer> {
    @Query(value = "select * from mbti_example;", nativeQuery = true)
    List<MbtiExample> getAllMbtiExamples();
}
