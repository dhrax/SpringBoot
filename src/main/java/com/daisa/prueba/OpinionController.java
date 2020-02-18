package com.daisa.prueba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class OpinionController {

    @Autowired
    private OpinionRepository repository;

    @RequestMapping("/opiniones")
    public List<Opinion> listaOpiniones() {

        List<Opinion> listaOpiniones = repository.findAll();
        return listaOpiniones;
    }

    @RequestMapping("/opinionesVideojuego")
    public List<Opinion> listaOpinionesVideojuego(String videojuego) {

        List<Opinion> listaOpiniones = repository.findByVideojuego(videojuego);
        return listaOpiniones;
    }

    @RequestMapping("/add_opinion")
    public void addOpinion( String autor, String videojuego,
                               float valoracion,
                            String comentario) {

        Opinion opinion = new Opinion();
        opinion.setAutor(autor);
        opinion.setVideojuego(videojuego);
        opinion.setValoracion(valoracion);
        opinion.setComentario(comentario);

        repository.save(opinion);
    }
}
