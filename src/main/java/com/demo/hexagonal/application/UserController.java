package com.demo.hexagonal.application;

import com.demo.hexagonal.application.request.GetUserRequest;
import com.demo.hexagonal.application.response.GetUserResponse;
import com.demo.hexagonal.domain.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {

    @Autowired
    private final UserService userService;

    @GetMapping("/")
    public GetUserResponse getRanDomUser(){
        return userService.getUser();
    }

    @GetMapping("/{seed}")
    public GetUserResponse getUser(@PathVariable("seed") String seed){
        return userService.getUser(GetUserRequest.builder()
                .seed(seed)
                .build());
    }
}
