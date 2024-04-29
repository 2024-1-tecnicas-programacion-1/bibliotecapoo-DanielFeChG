package com.mycompany.bibliotecapoo;

public class Libro {
    private int annioPublicacion;
    private String titulo;
    private String autor;
    private String genero;
    private boolean leido;
    
    public Libro(int annioPublicacion, String titulo,String autor, String genero, boolean leido){  //Complejidad temporal: O(1) Tiempo constante
        this.annioPublicacion = annioPublicacion;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.leido = leido;
    }
    public String mostrarInformación(){ // Complejidad temporal: O(1) Tiempo constante
        return ("Titulo: " + titulo + ", Autor: " + autor + ", Annio de publicacion: " + annioPublicacion + ", Genero: " + genero);
    }
    public void marcarLeido(){ // Complejidad temporal: O(1) Tiempo constante
        leido = true;
    }
    public boolean esAntiguo(){ // Complejidad temporal: O(1) Tiempo constante
        return (2024 - annioPublicacion>50);
    }
    public boolean getLeido(){ // Complejidad temporal: O(1) Tiempo constante
        return this.leido;
    }
    public String getTitulo(){
        return this.titulo;
    }
}
