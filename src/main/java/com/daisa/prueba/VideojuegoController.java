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

    @RequestMapping("/videojuegosGenero")
    public List<Videojuego> listaVideojuegosGenero(String genero) {

        List<Videojuego> listaVideojuegos = repository.findByGenero(genero);
        return listaVideojuegos;
    }
    @RequestMapping("/videojuegosNombre")
    public List<Videojuego> listaVideojuegosNombre(String nombre) {

        List<Videojuego> listaVideojuegos = repository.findByNombre(nombre);
        return listaVideojuegos;
    }

    @RequestMapping("/videojuegosPlataforma")
    public List<Videojuego> listaVideojuegosPlataformas(boolean pc, boolean xbox, boolean playStation, boolean sw) {

        List<Videojuego> listaVideojuegos = repository.findByPcAndXboxAndPlayStationAndSw(pc, xbox, playStation, sw);
        return listaVideojuegos;
    }

    @RequestMapping("/videojuegosDesarrolladora")
    public List<Videojuego> listaVideojuegosDesarrolladora(String desarrolladora) {

        List<Videojuego> listaVideojuegos = repository.findByDesarrolladora(desarrolladora);
        return listaVideojuegos;
    }

    @RequestMapping("/videojuegosTienda")
    public List<Videojuego> listaVideojuegosTienda(String tienda) {

        List<Videojuego> listaVideojuegos = repository.findByTienda(tienda);
        return listaVideojuegos;
    }

    @RequestMapping("/add_videojuego")
    public void addVideojuego( String nombre,
                             byte[] imagen,
                             String desarrolladora,
                             String genero,
                             String anhoSalida,
                             boolean pc,
                             boolean xbox,
                             boolean playStation,
                             boolean sw,
                             float valoracion,
                             String tienda,
                             boolean favorito) {

        Videojuego videojuego = new Videojuego();
        videojuego.setNombre(nombre);
        videojuego.setImagen(imagen);
        videojuego.setDesarrolladora(desarrolladora);
        videojuego.setGenero(genero);
        videojuego.setAnhoSalida(anhoSalida);
        videojuego.setPc(pc);
        videojuego.setXbox(xbox);
        videojuego.setPlayStation(playStation);
        videojuego.setSw(sw);
        videojuego.setValoracion(valoracion);
        videojuego.setTienda(tienda);
        videojuego.setFavorito(favorito);

        repository.save(videojuego);
    }
}
