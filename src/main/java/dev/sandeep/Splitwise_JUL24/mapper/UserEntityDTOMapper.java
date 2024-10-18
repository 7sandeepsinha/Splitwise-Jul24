package dev.sandeep.Splitwise_JUL24.mapper;

import dev.sandeep.Splitwise_JUL24.dto.UserSignUpDTO;
import dev.sandeep.Splitwise_JUL24.model.User;

public class UserEntityDTOMapper {

    public static User dtoToEntity(UserSignUpDTO userSignUpDTO){
        User user = new User();
        user.setUsername(userSignUpDTO.getUsername());
        user.setPassword(userSignUpDTO.getPassword());
        user.setEmail(userSignUpDTO.getEmail());
        return user;
    }
}
