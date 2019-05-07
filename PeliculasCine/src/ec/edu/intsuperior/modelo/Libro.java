/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author Wilson
 */
public class Libro {
    int id,tiempoLectura;
    String titulo,editorial,autores,isbn,fechaEdicion;
    boolean lectura;

    public Libro() {
        this.id = id;
        this.tiempoLectura = tiempoLectura;
        this.titulo = titulo;
        this.editorial = editorial;
        this.autores = autores;
        this.isbn = isbn;
        this.fechaEdicion = fechaEdicion;
        this.lectura = lectura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTiempoLectura() {
        return tiempoLectura;
    }

    public void setTiempoLectura(int tiempoLectura) {
        this.tiempoLectura = tiempoLectura;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getFechaEdicion() {
        return fechaEdicion;
    }

    public void setFechaEdicion(String fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

    public boolean isLectura() {
        return lectura;
    }

    public void setLectura(boolean lectura) {
        this.lectura = lectura;
    }
    
}
