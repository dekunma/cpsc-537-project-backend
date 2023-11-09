package com.teamdroptable.mbtiapp.controller;

import com.teamdroptable.mbtiapp.common.CommonResponseWrapper;
import com.teamdroptable.mbtiapp.controller.response.PersonResponse;
import com.teamdroptable.mbtiapp.model.MbtiExample;
import com.teamdroptable.mbtiapp.service.MbtiService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
@AllArgsConstructor
@CommonResponseWrapper
public class MbtiController {
    private final MbtiService mbtiService;

    @GetMapping("/examples")
    public List<MbtiExample> getAllExampleMbti() {
        return mbtiService.getAllExampleMbti();
    }

    @GetMapping("/person/{name}")
    public PersonResponse getPersonByName(@PathVariable String name) {
        return mbtiService.getPersonByName(name);
    }

    @GetMapping("/people/random-ten")
    public List<PersonResponse> getTenRandomPeople() {
        return mbtiService.getTenRandomPeople();
    }
}
