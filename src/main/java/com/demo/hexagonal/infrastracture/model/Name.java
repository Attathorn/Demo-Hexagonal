package com.demo.hexagonal.infrastracture.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
public class Name implements Serializable {
    public Name() {}

    private String title;
    private String first;
    private String last;


}
