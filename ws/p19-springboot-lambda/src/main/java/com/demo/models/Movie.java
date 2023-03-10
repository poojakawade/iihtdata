package com.demo.models;

public class Movie {

    private String title;
    private String director;
    private double rating;

    
    
    public Movie() {
    }

    public Movie(String title, String director, double rating) {
        this.title = title;
        this.director = director;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie [director=" + director + ", rating=" + rating + ", title=" + title + "]";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    
}
