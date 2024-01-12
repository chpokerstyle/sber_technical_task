package com.example.demo.rest.controller;

import com.example.demo.rest.dto.BonusDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

public interface MenageController<T> {

    ResponseEntity<T> accrualPoints(BonusDTO bonusDTO);

    ResponseEntity<? extends T> getPoints(Long personId);

    ResponseEntity<T> debitingPoints(BonusDTO bonusDTO);
}
