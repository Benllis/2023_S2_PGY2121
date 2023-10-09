package com.mycompany.spotify_trucho;

public class Cancion {
    private String titulo, artista;
    private int duracion;
    private boolean favorita, descargada;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isFavorita() {
        return favorita;
    }

    public void setFavorita(boolean favorita) {
        this.favorita = favorita;
    }

    public boolean isDescargada() {
        return descargada;
    }

    public void setDescargada(boolean descargada) {
        this.descargada = descargada;
    }

    public Cancion(String titulo, String artista, int duracion, boolean favorita, boolean descargada) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.favorita = favorita;
        this.descargada = descargada;
    }

    public Cancion() {
    }
}
