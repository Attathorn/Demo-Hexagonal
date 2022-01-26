package com.demo.hexagonal.infrastracture.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class GetDataRequest {
    private String seed;
}
