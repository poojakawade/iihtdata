package com.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String author;
    private double rating;
    
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
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    @Override
    public String toString() {
        return "Movie [author=" + author + ", id=" + id + ", rating=" + rating + ", title=" + title + "]";
    }
    public Movie() {
    }
    public Movie(String title, String author, double rating) {
        this.title = title;
        this.author = author;
        this.rating = rating;
    }
    public Movie(int id, String title, String author, double rating) {
        this(title, author, rating);
        this.id = id;
    }

}
