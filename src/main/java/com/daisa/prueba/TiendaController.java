package com.daisa.prueba;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TiendaController {

    @Autowired
    private TiendaRepository repository;

    @RequestMapping("/tiendas")
    public List<Tienda> listaTiendas() {

        List<Tienda> listaTiendas = repository.findAll();
        return listaTiendas;
    }

    @RequestMapping("/tiendasNombre")
    public List<Tienda> listaTiendasNombre(String nombre) {

        List<Tienda> listaTiendas = repository.findByNombre(nombre);
        return listaTiendas;
    }

}
