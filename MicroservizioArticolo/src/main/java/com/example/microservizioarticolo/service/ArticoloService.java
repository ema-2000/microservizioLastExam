package com.example.microservizioarticolo.service;

import com.example.microservizioarticolo.articoloDto.ArticoloDto;
import com.example.microservizioarticolo.entity.Articolo;

import java.util.List;
import java.util.Optional;

public interface ArticoloService {

    void saveArticolo(Articolo corso);

    List<ArticoloDto> findAll();

    Optional<Articolo> findById(Long id);

    void deleteById(Long id);
}
