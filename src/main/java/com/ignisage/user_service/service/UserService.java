package com.ignisage.user_service.service;

import com.ignisage.user_service.model.User;
import com.ignisage.user_service.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(User user) {
        user.setRegisterDate(LocalDateTime.now());
        return userRepository.save(user);
    }

    public List<User> getUsers() {
        return  userRepository.findAll();
    }

    public Optional<User> getUser(UUID id) {
        return userRepository.findById(id);
    }
}
