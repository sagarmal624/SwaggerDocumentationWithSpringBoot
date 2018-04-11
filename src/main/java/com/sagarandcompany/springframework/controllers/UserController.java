package com.sagarandcompany.springframework.controllers;

import com.sagarandcompany.springframework.domain.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Api(value = "onlinestore", description = "Users in Online Store")

public class UserController {
    @ApiOperation(value = "Search a User with an ID", response = User.class)
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET, produces = "application/json")
    public User getUser(@PathVariable Integer id) {
        User user = new User();
        user.setId(id);
        user.setDescription("Hello sagar");
        user.setVersion(2);
        return user;

    }
}
