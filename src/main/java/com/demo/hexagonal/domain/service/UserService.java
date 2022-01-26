package com.demo.hexagonal.domain.service;

import com.demo.hexagonal.application.request.GetUserRequest;
import com.demo.hexagonal.application.response.GetUserResponse;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public GetUserResponse getUser();
    public GetUserResponse getUser(GetUserRequest request);
}
