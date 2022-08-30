package com.dh.catalogo.controller;

import com.dh.catalogo.dto.MovieDTO;
import com.dh.catalogo.service.CatalogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class CatalogoController {

    @Autowired
    private CatalogoService service;

    @GetMapping("/movies/{genre}")
    private ResponseEntity<List<MovieDTO>> pesquisarPorGenre(@PathVariable String genre) {
        return ResponseEntity.ok(service.pesquisarMovie(genre));
    }

}
