package com.dh.movies.repository;

import com.dh.movies.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    Optional<Movie> findById(Long id);

    Optional<Movie> findByName(String name);

    Optional<Movie> findByGenre(String genre);
}
