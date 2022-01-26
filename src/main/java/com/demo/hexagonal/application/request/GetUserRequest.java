package com.demo.hexagonal.application.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class GetUserRequest {
    private String seed;
}
