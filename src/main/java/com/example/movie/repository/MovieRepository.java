package com.example.movie.repository;

import com.example.movie.model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<Users, String> {

}
