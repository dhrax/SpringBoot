package com.daisa.prueba;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @RequestMapping("/usuarios")
    public List<Usuario> listaUsuarios() {

        List<Usuario> listaUsuarios = repository.findAll();
        return listaUsuarios;
    }

    @RequestMapping("/usuarioNombre")
    public Usuario usuarioNombre(String nombre) {

        Usuario usuario = repository.findByNombre(nombre);
        return usuario;
    }

    @RequestMapping("/contarPorNombre")
    public Long contarUsuarios(String nombre) {

        Long numUsuarios = repository.countByNombre(nombre);
        return numUsuarios;
    }

}
