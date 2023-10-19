package com.teamdroptable.mbtiapp.controller;

import com.teamdroptable.mbtiapp.model.MbtiExample;
import com.teamdroptable.mbtiapp.service.MbtiService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
@AllArgsConstructor
public class MbtiController {
    private final MbtiService mbtiService;

    @GetMapping("/examples")
    public List<MbtiExample> getAllExampleMbti() {
        return mbtiService.getAllExampleMbti();
    }
}
