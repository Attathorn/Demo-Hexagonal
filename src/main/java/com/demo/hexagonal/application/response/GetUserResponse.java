package com.demo.hexagonal.application.response;

import com.demo.hexagonal.domain.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class GetUserResponse {
    private User user;
}
