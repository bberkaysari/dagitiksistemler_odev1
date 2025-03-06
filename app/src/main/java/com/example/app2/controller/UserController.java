package com.example.app2.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app2.model.User;
import com.example.app2.repository.UserRepository;

@RestController
@RequestMapping("/dagitik")
public class UserController {

    private final String instanceId = UUID.randomUUID().toString();

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/mesaj")
    public String getInstanceId() {
        return "Berkay Sarı - 02210224042: " + instanceId;
    }
}