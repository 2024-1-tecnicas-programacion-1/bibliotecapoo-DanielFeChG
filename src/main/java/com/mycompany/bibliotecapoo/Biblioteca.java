package com.mycompany.bibliotecapoo;
import java.util.LinkedList;

public class Biblioteca {
    private LinkedList<Libro> libros;
    public boolean bibliotecaVacia = true;
 
    
    public Biblioteca(){
        this.libros = new LinkedList<>();
    }
    public void registrarLibro(Libro libroNuevo) { //Complejidad temporal: O(1) Tiempo constante
        libros.add(libroNuevo);
        bibliotecaVacia = false;
    }
    public void buscarLibro(String palabraBusqueda){ //Complejidad temporal: O(N) Tiempo lineal
        for(int i=0; i<libros.size();i++){
            Libro libroEnRevision = libros.get(i);
            if (libroEnRevision.getTitulo().equals(palabraBusqueda)){
                System.out.println("Se encontro la siguiente coincidendia:");
                System.out.println(libroEnRevision.mostrarInformación());
            }
            else{
                System.out.println("No se han encontrado coincidencias.");
            }
        }
    }
    public void mostrarLibros(){ //Complejidad temporal: O(N) Tiempo lineal
        for (Libro libro : libros){
            System.out.println("- "+libro.mostrarInformación());
        }
    }
    public void mostrarLibrosNoLeidos(){ //Complejidad temporal: O(N) Tiempo lineal
        for (Libro libro : libros){
            if (libro.getLeido()== false){
                System.out.println(libro.mostrarInformación());
            }
        }
    }
    public void marcarLibroLeido(String tituloMarcar){ //Complejidad temporal: O(N) Tiempo lineal
          for(int i=0; i<libros.size();i++){
            Libro libroAMarcar = libros.get(i);
            if (libroAMarcar.getTitulo().equals(tituloMarcar)){
                libroAMarcar.marcarLeido();
                System.out.println("El libro " + libroAMarcar.getTitulo() + " ha sido marcado como -Leido-");
            }
            else{
                System.out.println("No se ha encontrado el libro.");
            }
        }
    }
}
