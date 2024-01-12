package com.example.demo.rest.dto;

import com.example.demo.model.Person;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class BonusDTO extends Person {
    @NotNull
    private Long id;
    @NotNull
    private Long points;

}
