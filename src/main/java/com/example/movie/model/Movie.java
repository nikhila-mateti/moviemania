package com.example.movie.model;

public class Movie {

	private int id;
	private String title;
	private String release_date;
	private String[] genres;
	private String lang;
	private String overview;
	private double popularity;
	private long vote_count;
	private double vote_avg;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRelease_date() {
		return release_date;
	}
	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}
	public String[] getGenres() {
		return genres;
	}
	public void setGenres(String[] genres) {
		this.genres = genres;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public double getPopularity() {
		return popularity;
	}
	public void setPopularity(double popularity) {
		this.popularity = popularity;
	}
	public long getVote_count() {
		return vote_count;
	}
	public void setVote_count(long vote_count) {
		this.vote_count = vote_count;
	}
	public double getVote_avg() {
		return vote_avg;
	}
	public void setVote_avg(double vote_avg) {
		this.vote_avg = vote_avg;
	}
}
