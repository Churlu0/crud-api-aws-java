package com.example.UDG.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "movies")
public class MovieModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(nullable = false,unique = true)
    private Long id;
    private String title;
    private String director;
    private String gender;
    private Integer year;
    private Double rating;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}
