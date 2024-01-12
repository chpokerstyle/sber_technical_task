package com.example.demo.rest.controller;

import com.example.demo.model.Person;
import com.example.demo.rest.dto.BonusDTO;
import com.example.demo.service.MenageService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/manage")
@RequiredArgsConstructor
public class MenageControllerImpl<T> implements MenageController<Person> {
    private final MenageService menageService;

    @Override
    @PostMapping("/accrual")
    public ResponseEntity<Person> accrualPoints(@Valid @RequestBody BonusDTO bonusDTO) {
        return new ResponseEntity<>(menageService.accrualPoints(bonusDTO), HttpStatus.OK);
    }

    @Override
    @GetMapping("/{personId}")
    public ResponseEntity<BonusDTO> getPoints(@PathVariable Long personId) {
        if(personId == null) return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(menageService.getPoints(personId), HttpStatus.OK);
    }

    @Override
    @PostMapping("/debit")
    public ResponseEntity<Person> debitingPoints(@Valid @RequestBody BonusDTO bonusDTO) {
        return new ResponseEntity<>(menageService.debitingPoints(bonusDTO), HttpStatus.OK);
    }
}
