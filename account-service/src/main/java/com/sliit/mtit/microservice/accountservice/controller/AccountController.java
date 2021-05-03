package com.sliit.mtit.microservice.accountservice.controller;

import com.sliit.mtit.microservice.accountservice.dto.UserRequest;
import com.sliit.mtit.microservice.accountservice.dto.UserResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/users")

public class AccountController {

    @PostMapping(consumes = "application/json",produces = "application/json")
    public @ResponseBody UserResponse createUser(@RequestBody UserRequest userRequest){

        System.out.println("User Details : " + userRequest);

        var userResponse = new UserResponse();
        userResponse.setUserId(UUID.randomUUID().toString());
        userResponse.setMessage("Successfully created the user");
        return userResponse;

    }
}
