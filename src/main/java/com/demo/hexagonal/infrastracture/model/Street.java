package com.demo.hexagonal.infrastracture.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
public class Street implements Serializable {

    public Street() {
    }

    private Integer number;
    private String name;
}
