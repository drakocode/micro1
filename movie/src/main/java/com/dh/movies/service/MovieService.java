package com.dh.movies.service;

import com.dh.movies.dto.MovieDTO;
import com.dh.movies.entity.Movie;

import java.util.List;

public interface MovieService {

    MovieDTO salvar(MovieDTO dto);
    Movie pesquisarPorGenre(String genre);

}
