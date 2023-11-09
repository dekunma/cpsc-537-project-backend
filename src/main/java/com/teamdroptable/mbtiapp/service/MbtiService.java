package com.teamdroptable.mbtiapp.service;

import com.teamdroptable.mbtiapp.controller.response.PersonCard;
import com.teamdroptable.mbtiapp.controller.response.PersonResponse;
import com.teamdroptable.mbtiapp.enums.ResponseCode;
import com.teamdroptable.mbtiapp.exceptions.ApplicationException;
import com.teamdroptable.mbtiapp.model.MbtiExample;
import com.teamdroptable.mbtiapp.repository.MbtiExampleRepository;
import com.teamdroptable.mbtiapp.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@AllArgsConstructor
public class MbtiService {
    private final MbtiExampleRepository mbtiExampleRepository;
    private final PersonRepository personRepository;

    public List<MbtiExample> getAllExampleMbti() {
        return mbtiExampleRepository.getAllMbtiExamples();
    }

    public PersonResponse getPersonByName(String name) {
        var person = personRepository.getPersonByName(name);
        if (person == null)
            throw new ApplicationException(ResponseCode.NO_PERSON_WITH_SUCH_NAME, HttpStatus.BAD_REQUEST);
        return person;
    }

    public List<PersonCard> getTenRandomPeople() {
        var randomPeople = personRepository.getRandomPeople();
        while (randomPeople.size() < 10) {
            randomPeople.addAll(personRepository.getRandomPeople());
        }

        List<PersonCard> ret = new ArrayList<>();
        for (PersonResponse p : randomPeople)
            ret.add(PersonCard.builder()
                    .name(p.getName())
                    .description(p.getDescription100() == null ? p.getMovie() : p.getDescription100())
                    .build());

        Collections.shuffle(ret);
        return ret;
    }
}
