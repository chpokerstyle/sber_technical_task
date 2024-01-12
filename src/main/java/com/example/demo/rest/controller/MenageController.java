package com.example.demo.rest.controller;

import com.example.demo.rest.dto.BonusDTO;
import org.springframework.http.ResponseEntity;

/**
 * Здесь должен быть сваггер
 * @param <T>
 */

public interface MenageController<T> {

    ResponseEntity<T> accrualPoints(BonusDTO bonusDTO) throws Exception;

    ResponseEntity<? extends T> getPoints(Long personId);

    ResponseEntity<T> debitingPoints(BonusDTO bonusDTO);
}
