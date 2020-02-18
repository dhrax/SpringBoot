package com.daisa.prueba;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TiendaRepository extends CrudRepository<Tienda, Integer> {
    List<Tienda> findAll();
    List<Tienda> findByNombre(String nombre);
}
