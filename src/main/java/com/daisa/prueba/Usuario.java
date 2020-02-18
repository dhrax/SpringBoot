package com.daisa.prueba;
import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY) //ya que hay un campo autoincremental
    private int id;
    @Column
    private String usuario;
    @Column
    private String contrasenha;

    // Constructor
    public Usuario(){}


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenha() {
        return contrasenha;
    }

    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
