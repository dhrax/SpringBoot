package com.daisa.prueba;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OpinionRepository extends CrudRepository<Opinion, Integer> {

    List<Opinion> findAll();
    List<Opinion> findByVideojuego(String videojuego);
}
