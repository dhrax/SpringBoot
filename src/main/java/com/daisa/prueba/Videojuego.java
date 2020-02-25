package com.daisa.prueba;

import javax.persistence.*;

    @Entity
    @Table(name = "videojuegos")
    public class Videojuego {

        @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY) //ya que hay un campo autoincremental
        private int id;
        @Column
        private byte[] imagen;
        @Column
        private String nombre;
        @Column
        private String desarrolladora;
        @Column
        private String genero;
        @Column (name = "anho_salida") //si tenemos espacios, hay que decirle que nombre tiene en la BBDD, ya que puede diferir (sobre todo si tiene espacios)
        private String anhoSalida;
        @Column
        private boolean pc;
        @Column
        private boolean xbox;
        @Column (name = "play_station")
        private boolean playStation;
        @Column (name = "switch")
        private boolean sw;
        @Column
        private float valoracion;
        @Column
        private String tienda;
        @Column
        private boolean favorito;

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

        public String getDesarrolladora() {
            return desarrolladora;
        }

        public void setDesarrolladora(String desarrolladora) {
            this.desarrolladora = desarrolladora;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public String getAnhoSalida() {
            return anhoSalida;
        }

        public void setAnhoSalida(String anhoSalida) {
            this.anhoSalida = anhoSalida;
        }

        public boolean isPc() {
            return pc;
        }

        public void setPc(boolean pc) {
            this.pc = pc;
        }

        public boolean isXbox() {
            return xbox;
        }

        public void setXbox(boolean xbox) {
            this.xbox = xbox;
        }

        public boolean isPlayStation() {
            return playStation;
        }

        public void setPlayStation(boolean playStation) {
            this.playStation = playStation;
        }

        public boolean isSw() {
            return sw;
        }

        public void setSw(boolean sw) {
            this.sw = sw;
        }

        public float getValoracion() {
            return valoracion;
        }

        public void setValoracion(float valoracion) {
            this.valoracion = valoracion;
        }

        public String getTienda() {
            return tienda;
        }

        public void setTienda(String tienda) {
            this.tienda = tienda;
        }

        public boolean isFavorito() {
            return favorito;
        }

        public void setFavorito(boolean favorito) {
            this.favorito = favorito;
        }


        public byte[] getImagen() {
            return imagen;
        }

        public void setImagen(byte[] imagen) {
            this.imagen = imagen;
        }


    }
