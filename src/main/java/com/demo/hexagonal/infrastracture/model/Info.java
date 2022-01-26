package com.demo.hexagonal.infrastracture.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
public class Info implements Serializable {
    public Info() {
    }

    private String seed;
}
