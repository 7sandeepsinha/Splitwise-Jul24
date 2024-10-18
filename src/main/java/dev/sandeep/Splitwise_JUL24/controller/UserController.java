package dev.sandeep.Splitwise_JUL24.controller;

import dev.sandeep.Splitwise_JUL24.dto.UserSignUpDTO;
import dev.sandeep.Splitwise_JUL24.mapper.UserEntityDTOMapper;
import dev.sandeep.Splitwise_JUL24.model.User;
import dev.sandeep.Splitwise_JUL24.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResponseEntity createUser(@RequestBody UserSignUpDTO userSignUpDTO) {
        //TODO : validations here
        User newUser = UserEntityDTOMapper.dtoToEntity(userSignUpDTO);
        newUser = userService.createUser(newUser);
        return ResponseEntity.ok(newUser);
    }

    private void signUpValidations(UserSignUpDTO user) {

    }
}
