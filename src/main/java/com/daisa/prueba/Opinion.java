package com.daisa.prueba;
import javax.persistence.*;

@Entity
@Table(name = "opiniones")
public class Opinion {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY) //ya que hay un campo autoincremental
    private int id;
    @Column
    private String autor;
    @Column
    private String videojuego;
    @Column
    private float valoracion;
    @Column
    private String comentario;


    public Opinion() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getVideojuego() {
        return videojuego;
    }

    public void setVideojuego(String videojuego) {
        this.videojuego = videojuego;
    }
}
