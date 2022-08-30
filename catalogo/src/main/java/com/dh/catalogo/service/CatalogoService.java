package com.dh.catalogo.service;

import com.dh.catalogo.dto.MovieDTO;

import java.util.List;

public interface CatalogoService {

    List<MovieDTO> pesquisarMovie(String genre);

}
