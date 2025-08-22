package org.example.weathermon.service;

import java.util.Optional;

import org.example.weathermon.model.User;
import org.example.weathermon.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository){
        this.repository = repository;
    }

    public User createUser(User user){
        return repository.save(user);
    }

    public void deletUser(String userId){
        repository.deleteById(userId);
    }
    
    public Optional<User> getUserbyUserId(String userId){
        return repository.findById(userId);
    }

    public String getAnimeThemebyUserId(String userId){
        return getUserbyUserId(userId)
        .orElseThrow(() -> new RuntimeException("User not found"))
        .getAnimeTheme();
    }
}
