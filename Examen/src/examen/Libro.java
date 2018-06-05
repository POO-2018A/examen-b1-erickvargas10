/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author ESFOT
 */
public class Libro {
    
    private String titulo;
    private int anio;
    boolean favorito;
    Autor[] autor;

    public Libro(String titulo, int anio, Autor[] autor) {
        this.titulo = titulo;
        this.anio = anio;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    public Autor[] getAutor() {
        return autor;
    }

    public void setAutor(Autor[] autor) {
        this.autor = autor;
    }

    

    @Override
    public String toString() {
        String stringLibro ="\nTitulo :" + this.titulo + "\nAño de publicación : " + this.anio + "\n";
        for(int i=0; i<this.autor.length; i++){
            stringLibro+= "AUTOR"+this.autor[i];
            System.out.println();
        }
        return stringLibro;
    }
}
