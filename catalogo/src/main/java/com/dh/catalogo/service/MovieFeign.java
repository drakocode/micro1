package com.dh.catalogo.service;


import com.dh.catalogo.dto.MovieDTO;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="CARROS-SERVICE")
public interface MovieFeign {

    @GetMapping("/carro/proprietario/{idProprietario}")
    ResponseEntity<List<MovieDTO>> pesquisarMovie(@PathVariable Long idMovie);
}
