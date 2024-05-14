package com.example.movie.service;

import com.example.movie.model.Movie;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {
	public List<Movie> readCsvFile() {
        List<Movie> movies = new ArrayList<>();

        try (InputStream inputStream = getClass().getResourceAsStream("/movie_dataset.csv");
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            // Skip the header row
            reader.readLine();

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = parseCsvLine(line);
                if (parts.length == 9) { // Assuming there are 9 fields in each row
                    Movie movie = new Movie();
                    movie.setId(Integer.parseInt(parts[0]));
                    movie.setTitle(parts[1]);
                    movie.setRelease_date(parts[2]);
                    movie.setGenres(parseGenres(parts[3]));
                    movie.setLang(parts[4]);
                    movie.setOverview(parts[5]);
                    movie.setPopularity(Double.parseDouble(parts[6]));
                    movie.setVote_count(Long.parseLong(parts[7]));
                    movie.setVote_avg(Double.parseDouble(parts[8]));
                    movies.add(movie);
                } else {
                    // Handle the case where line doesn't have nine parts
                    System.err.println("Invalid line format: " + line);
                }
            }
        } catch (Exception e) {
            // Handle any other exceptions
            e.printStackTrace();
        }

        return movies;
    }

	private String[] parseCsvLine(String line) {
	    List<String> parts = new ArrayList<>();
	    StringBuilder currentPart = new StringBuilder();
	    boolean inQuotes = false;

	    for (char c : line.toCharArray()) {
	        if (c == '"') {
	            inQuotes = !inQuotes;
	        } else if (c == '\n' && inQuotes) {
	            currentPart.append("\\n"); // Replace newline characters within quotes with "\n"
	        } else if (c == ',' && !inQuotes) {
	            parts.add(currentPart.toString());
	            currentPart.setLength(0); // Reset the StringBuilder
	        } else {
	            currentPart.append(c);
	        }
	    }

	    parts.add(currentPart.toString()); 
	    return parts.toArray(new String[0]);
	}


    private String[] parseGenres(String genres) {
        
        return genres.split(",");
    }
}
