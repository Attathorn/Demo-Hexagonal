package com.demo.hexagonal.infrastracture.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
public class Result implements Serializable {
    private String gender;
    private Name name;
    private Location location;
    private String email;

    public Result() {
    }
}
