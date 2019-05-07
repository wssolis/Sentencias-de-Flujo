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
public class Pelicula {
    int id,duracion,tiempoVista;
    String titulo,genero,creador;
    boolean vista;
    public Pelicula(){
        this.id=id;
        this.duracion=duracion;
        this.tiempoVista=tiempoVista;
        this.titulo=titulo;
        this.genero=genero;
        this.creador=creador;
        this.vista=vista;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getTiempoVista() {
        return tiempoVista;
    }

    public void setTiempoVista(int tiempoVista) {
        this.tiempoVista = tiempoVista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public boolean isVista() {
        return vista;
    }

    public void setVista(boolean vista) {
        this.vista = vista;
    }
}
