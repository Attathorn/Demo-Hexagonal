package com.demo.hexagonal.domain.service;

import com.demo.hexagonal.application.request.GetUserRequest;
import com.demo.hexagonal.application.response.GetUserResponse;
import com.demo.hexagonal.domain.external.UserExternalApi;
import com.demo.hexagonal.domain.model.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DomainUserService implements UserService {

    private final UserExternalApi userExternalApi;

    @Override
    public GetUserResponse getUser() {
        //get data from api
        var data = userExternalApi.getUser();
        User user = new User(data);
        return GetUserResponse.builder()
                .user(user)
                .build();
    }

    @Override
    public GetUserResponse getUser(GetUserRequest request) {

        var data = userExternalApi.getUser(request.getSeed());
        User user = new User(data);
        return GetUserResponse.builder()
                .user(user)
                .build();
    }
}
