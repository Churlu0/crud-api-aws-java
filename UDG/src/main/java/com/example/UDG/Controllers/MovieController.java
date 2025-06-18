package com.example.UDG.Controllers;

import com.example.UDG.Models.MovieModel;
import com.example.UDG.Services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/movie")
public class MovieController {
@Autowired
MovieService movieService;

//get
    @GetMapping()
    public ArrayList<MovieModel> findAllMovies(){
        return movieService.findAllMovies();
    }



    //post
    @PostMapping()
    public MovieModel saveMovie(@RequestBody MovieModel movie){
return movieService.saveMovie(movie);
    }

    //editar
    @PutMapping()
    public MovieModel updateMovie(@RequestBody MovieModel movie){
        return movieService.saveMovie(movie);
    }
    //buscar por titulo
    @GetMapping(path = "/find-by-title")
    public ArrayList<MovieModel> findByTitle(@RequestParam("title") String title){
        return movieService.findByTitle(title);
    }

    //buscar por director
    @GetMapping(path = "/find-by-director")
    public ArrayList<MovieModel> findByDirector(@RequestParam("director") String director){
        return movieService.findByDirector(director);
}

//Delete
@DeleteMapping(path = "/{id}")
public String deleteMovie(@PathVariable("id") Long id) {
    boolean deleted = movieService.deleteMovie(id);
    return deleted ? "Película eliminada" : "No se encontró película con ese ID";
}

}
