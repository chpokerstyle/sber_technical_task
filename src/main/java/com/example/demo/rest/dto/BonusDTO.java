package com.example.demo.rest.dto;

import com.example.demo.model.Person;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class BonusDTO extends Person {

    @NotNull
    private Long id;

    @NotNull
    @Min(1)
    private Long points;

}
