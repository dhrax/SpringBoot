package com.daisa.prueba;

import javax.persistence.*;

    @Entity
    @Table(name = "videojuegos")
    public class Videojuego {

        @Id
        @GeneratedValue //para insertar hay que añadir (strategy = GenerationType.IDENTITY) ya que hay un campo autoincremental
        private int id;
        @Column
        private String nombre;
        @Column
        private String descripcion;
        @Column
        private String tipo;
        @Column //(name = "puntuacion") si tenemos espacios, hay que decirle que nombre tiene en la BBDD, ya que puede diferir (sobre todo si tiene espacios)
        private int puntuacion;

        // Constructor
        public Videojuego(){}


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

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public int getPuntuacion() {
            return puntuacion;
        }

        public void setPuntuacion(int puntuacion) {
            this.puntuacion = puntuacion;
        }
    }
