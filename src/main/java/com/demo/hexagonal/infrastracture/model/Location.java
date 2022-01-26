package com.demo.hexagonal.infrastracture.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
public class Location implements Serializable {
    public Location() {
    }

    private Street street;
    private String city;
    private String state;
    private String postcode;

}
