package com.example.movie.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document(collection = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    @Id
    private String userId;
    private ArrayList<MovieIndividual> movies;


}
