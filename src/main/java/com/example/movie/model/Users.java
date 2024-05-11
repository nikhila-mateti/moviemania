package com.example.movie.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document(collection = "users")
public class Users {
	
    @Id
    private String userId;
    private ArrayList<MovieIndividual> movies;
    
	public Users() {
		super();
	}

	public Users(String userId, ArrayList<MovieIndividual> movies) {
		super();
		this.userId = userId;
		this.movies = movies;
	}

	public ArrayList<MovieIndividual> getMovies() {
		return movies;
	}

	public void setMovies(ArrayList<MovieIndividual> movies) {
		this.movies = movies;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", movies=" + movies + "]";
	}

	
}
