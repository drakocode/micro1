package com.dh.catalogo.service.impl;

import com.dh.catalogo.dto.MovieDTO;
import com.dh.catalogo.service.CatalogoService;
import com.dh.catalogo.service.MovieFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogoServiceImpl implements CatalogoService {

    @Autowired
    private MovieFeign movieFeign;

    @Override
    public List<MovieDTO> pesquisarMovie(String genre) {
        return movieFeign.pesquisarMovie(genre).getBody();
    }
}
