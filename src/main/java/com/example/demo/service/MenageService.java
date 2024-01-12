package com.example.demo.service;

import com.example.demo.model.Person;
import com.example.demo.rest.dto.BonusDTO;

public interface MenageService {

    Person accrualPoints(BonusDTO bonusDTO) throws Exception;

    BonusDTO getPoints(long personId);

    Person debitingPoints(BonusDTO bonusDTO);
}
