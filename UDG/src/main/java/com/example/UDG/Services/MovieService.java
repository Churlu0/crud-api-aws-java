package com.example.UDG.Services;

import com.example.UDG.Models.MovieModel;
import com.example.UDG.Repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;


import java.util.ArrayList;

@Service
public class MovieService {
@Autowired
MovieRepository movieRepository;

//obtener todas las peliculas registradas
public ArrayList<MovieModel> findAllMovies(){
    return (ArrayList<MovieModel>) movieRepository.findAll();
}

    //guardar una pelicula

    public MovieModel saveMovie(MovieModel movie){
    return movieRepository.save(movie);
    }

    //buscar por titulo
    public ArrayList<MovieModel> findByTitle(String title){
    return movieRepository.findByTitle(title);
    }

    //buscar por director
    public ArrayList<MovieModel> findByDirector(String director){
        return movieRepository.findByDirector(director);
    }

//Delete
public boolean deleteMovie(Long id) {
    Optional<MovieModel> movie = movieRepository.findById(id);
    if (movie.isPresent()) {
        movieRepository.deleteById(id);
        return true;
    }
    return false;
}

}
