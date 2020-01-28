package com.daisa.prueba;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VideojuegoRepository extends CrudRepository<Videojuego, Integer> {
    List<Videojuego> findAll();
    List<Videojuego> findByTipo(String tipo);
}
