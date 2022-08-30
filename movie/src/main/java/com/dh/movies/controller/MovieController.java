package com.dh.movies;

import com.dh.movies.dto.MovieDTO;
import com.dh.movies.entity.Movie;
import com.dh.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/")
@RestController
public class MovieController {

    @Autowired
    private MovieService service;

    @PostMapping
    private ResponseEntity<MovieDTO> salvar(@RequestBody MovieDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.salvar(dto));
    }

    @GetMapping("/movie/{id}")
    private ResponseEntity<Movie> pesquisarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(service.pesquisarPorId(id));
    }
//
//    @GetMapping("/movie/{name}")
//    private ResponseEntity<Movie> pesquisarPorName(@PathVariable String name) {
//        return ResponseEntity.ok(service.pesquisarPorId(name));
//    }
//
//    @GetMapping("/movie/{genre}")
//    private ResponseEntity<Movie> pesquisarPorGenre(@PathVariable String genre) {
//        return ResponseEntity.ok(service.pesquisarPorId(genre));
//    }

}
