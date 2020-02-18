package com.daisa.prueba;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
    List<Usuario> findAll();
    List<Usuario> findByNombre(String nombre);
}
