package com.example.demo.service;

import com.example.demo.model.Person;
import com.example.demo.repo.PersonRepo;
import com.example.demo.rest.dto.BonusDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MenageServiceImpl implements MenageService {
    private final PersonRepo personRepo;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.REPEATABLE_READ)
    public Person accrualPoints(BonusDTO bonusDTO) {
        Person person = personRepo.getReferenceById(bonusDTO.getId());
        long points = person.getPoints();
        person.setPoints(points + bonusDTO.getPoints());
        return personRepo.save(person);
    }

    @Override
//    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
    public BonusDTO getPoints(long personId) {
        System.out.println(personRepo.findAll());
        Person person = personRepo.getReferenceById(personId);
        return new BonusDTO()
                .setId(personId)
                .setPoints(person.getPoints());
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.REPEATABLE_READ)
    public Person debitingPoints(BonusDTO bonusDTO) {
        Person person = personRepo.getReferenceById(bonusDTO.getId());
        long points = person.getPoints();
        person.setPoints(points - bonusDTO.getPoints());
        return personRepo.save(person);
    }
}
