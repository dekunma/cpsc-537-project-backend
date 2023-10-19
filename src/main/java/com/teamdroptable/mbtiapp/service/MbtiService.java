package com.teamdroptable.mbtiapp.service;

import com.teamdroptable.mbtiapp.model.MbtiExample;
import com.teamdroptable.mbtiapp.repository.MbtiExampleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MbtiService {
    private final MbtiExampleRepository mbtiExampleRepository;

    public List<MbtiExample> getAllExampleMbti() {
        return mbtiExampleRepository.getAllMbtiExamples();
    }
}
