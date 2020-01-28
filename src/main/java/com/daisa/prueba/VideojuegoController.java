package com.daisa.prueba;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VideojuegoController {

    @Autowired
    private VideojuegoRepository repository;

    @RequestMapping("/videojuegos")
    public List<Videojuego> listaVideojuegos() {

        List<Videojuego> listaVideojuegos = repository.findAll();
        return listaVideojuegos;
    }

    @RequestMapping("/videojuegosTipo")
    public List<Videojuego> listaVideojuegosTipo(String tipo) {

        List<Videojuego> listaVideojuegos = repository.findByTipo(tipo);
        return listaVideojuegos;
    }


}
