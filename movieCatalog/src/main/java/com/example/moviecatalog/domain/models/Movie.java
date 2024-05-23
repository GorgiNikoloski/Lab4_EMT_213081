package com.example.moviecatalog.domain.models;


import com.example.moviecatalog.domain.valueobjects.Rating;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;

@Entity
@Table(name = "movie")
public class Movie extends AbstractEntity<MovieId> {

    private String movieName;

    private String movieDescription;

    private Rating rating;

    public Movie() {
    }

    public Movie(String movieName, String movieDescription, Rating rating) {
        this.movieName = movieName;
        this.movieDescription = movieDescription;
        this.rating = rating;
    }

    // money,

}
