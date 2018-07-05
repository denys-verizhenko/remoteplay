package rp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rp.dto.UserDTO;
import rp.models.User;
import rp.services.api.UserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    ConversionService conversionService;

    @GetMapping("/users")
    public List<UserDTO> getUsers() {
        List<User> users = userService.getUsers();
        return users.stream().map(user -> conversionService.convert(user, UserDTO.class)).collect(Collectors.toList());
    }
}
