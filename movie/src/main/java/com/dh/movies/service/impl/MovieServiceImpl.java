package com.dh.movies.service.impl;

import com.dh.movies.dto.MovieDTO;
import com.dh.movies.entity.Movie;
import com.dh.movies.repository.MovieRepository;
import com.dh.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository repository;

    @Override
    public MovieDTO salvar(MovieDTO dto) {
        Movie entity = new Movie();
        entity.setName(dto.getName());
        return entityToDTO(repository.save(entity));
    }

    @Override
    public Movie pesquisarPorId(Long id) {
        return null;
    }

    @Override
    public Movie pesquisarPorGenre(String genre) {
        return null;
    }

    @Override
    public Movie pesquisarPorName(String name) {
        return null;
    }

//    @Override
//    public List<MovieDTO> pesquisarPorProprietario(Long idProprietario) {
//        return repository.findByIdProprietario(idProprietario)
//                .stream().map(this::entityToDTO).collect(Collectors.toList());
//    }

    private MovieDTO entityToDTO(Movie entity) {
        return MovieDTO.builder().name(entity.getName()).id(entity.getId()).build();
    }
}
