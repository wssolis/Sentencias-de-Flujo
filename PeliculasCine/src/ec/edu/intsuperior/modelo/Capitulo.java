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
public class Capitulo {
    int id,duracion,tiempoVista,numeroSecion;
    String titulo;
    Short anio;
    boolean vista;

    public Capitulo() {
        this.id = id;
        this.duracion = duracion;
        this.tiempoVista = tiempoVista;
        this.numeroSecion = numeroSecion;
        this.titulo = titulo;
        this.anio = anio;
        this.vista = vista;
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

    public int getNumeroSecion() {
        return numeroSecion;
    }

    public void setNumeroSecion(int numeroSecion) {
        this.numeroSecion = numeroSecion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Short getAnio() {
        return anio;
    }

    public void setAnio(Short anio) {
        this.anio = anio;
    }

    public boolean isVista() {
        return vista;
    }

    public void setVista(boolean vista) {
        this.vista = vista;
    }
    
}
