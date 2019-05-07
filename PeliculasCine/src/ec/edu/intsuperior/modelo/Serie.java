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
public class Serie {
    int id,duracion,sesion;
    String titulo,genero,creador;
    short anio;
    boolean vista;
    double capitulo;

    public Serie() {
        this.id = id;
        this.duracion = duracion;
        this.sesion = sesion;
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.anio = anio;
        this.vista = vista;
        this.capitulo = capitulo;
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

    public int getSesion() {
        return sesion;
    }

    public void setSesion(int sesion) {
        this.sesion = sesion;
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

    public short getAño() {
        return anio;
    }

    public void setAño(short año) {
        this.anio = año;
    }

    public boolean isVista() {
        return vista;
    }

    public void setVista(boolean vista) {
        this.vista = vista;
    }

    public double getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(double capitulo) {
        this.capitulo = capitulo;
    }
    
}

