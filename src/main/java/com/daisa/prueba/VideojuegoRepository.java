package com.daisa.prueba;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VideojuegoRepository extends CrudRepository<Videojuego, Integer> {
    List<Videojuego> findAll();
    List<Videojuego> findByGenero(String genero);
    List<Videojuego> findByNombre(String nombre);
    List<Videojuego> findByPcAndXboxAndPlayStationAndSw(boolean pc, boolean xbox, boolean playStation, boolean sw);
    List<Videojuego> findByDesarrolladora(String desarrolladora);
    List<Videojuego> findByTienda(String tienda);
}
