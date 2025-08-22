package org.example.weathermon.repository;

import java.util.Optional;

import org.example.weathermon.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String>{
    // I don't need any special get functions, cause I only need to search by ID
}
