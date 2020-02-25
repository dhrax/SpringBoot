package com.daisa.prueba;

import javax.persistence.*;

@Entity
@Table(name = "tiendas")
public class Tienda {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY) //ya que hay un campo autoincremental
    private int id;
    @Column
    private String nombre;
    @Column
    private float latitud;
    @Column
    private float longitud;
    @Column
    private long telefono;

    // Constructor
    public Tienda(){}
    // Getters y Setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getLatitud() {
        return latitud;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
}
