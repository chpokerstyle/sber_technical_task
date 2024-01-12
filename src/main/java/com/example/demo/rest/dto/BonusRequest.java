package com.example.demo.rest.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class BonusRequest {
    @NotNull
    private Long id;
    @NotNull
    private Long points;
}
