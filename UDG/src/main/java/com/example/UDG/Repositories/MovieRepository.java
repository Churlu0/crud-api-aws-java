package com.example.UDG.Repositories;

import com.example.UDG.Models.MovieModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface MovieRepository extends CrudRepository <MovieModel,Long>{

    //editar

    //buscar por titulo
    public abstract ArrayList<MovieModel> findByTitle(String title);

    //buscar por director
    public abstract ArrayList<MovieModel> findByDirector(String director);


    //eliminar por titulo


}
