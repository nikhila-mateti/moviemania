package com.example.movie.service;

import com.example.movie.model.Users;
import com.example.movie.repository.MovieRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    //CRUD
    public Users addUsers(Users user){
        user.setUserId(UUID.randomUUID().toString().split("-")[0]);
        return movieRepository.save(user);
    }
}
