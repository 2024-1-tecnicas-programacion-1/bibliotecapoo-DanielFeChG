package com.mycompany.bibliotecapoo;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) { // Complejidad temporal: O(N) Tiempo lineal
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la biblioteca de Daniel\n---------------------------------------");
        Biblioteca miBiblioteca = new Biblioteca();
        int option = 0;
        int librosRegistrados = 0;
        int librosLeidos = 0;
        while (option!=6){
            System.out.println("Que desea hacer?:\n1)Registrar un libro\n2)Ver todos los libros disponibles\n3)Buscar un libro\n4)Marcar libros leidos\n5)Ver todos los libros NO leidos\n6)Salir");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Indique el annio de publicacion del libro: ");
                    int annioPublicacion = sc.nextInt();
                    System.out.println("Escriba el titulo del libro (en letras minusculas): ");
                    sc.nextLine();
                    String titulo = sc.nextLine();
                    System.out.println("Escriba el nombre del autor del libro: ");
                    String autor = sc.nextLine();
                    System.out.println("Indique el genero del libro: ");
                    String genero = sc.nextLine();
                    boolean leido = false;
                    Libro nuevoLibro = new Libro(annioPublicacion,titulo,autor,genero,leido);
                    miBiblioteca.registrarLibro(nuevoLibro);
                    System.out.println("El libro se ha registrado exitosamente.");
                    librosRegistrados += 1;
                    System.out.println("Continuar ->");
                    sc.nextLine();
                    break;
                case 2:
                    if (miBiblioteca.bibliotecaVacia==true){
                        System.out.println("No hay ningun libro disponible.");
                    }
                    else{
                        System.out.println("Estos son los libros disponibles:");
                        miBiblioteca.mostrarLibros();
                    }
                    System.out.println("Continuar ->");
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case 3:
                    if(miBiblioteca.bibliotecaVacia==true){
                        System.out.println("No hay ningun libro disponible.");
                        sc.nextLine();
                    }
                    else{
                        System.out.println("Escriba el nombre del libro que desea encontrar (en letras minusculas):");
                        sc.nextLine();
                        String tituloBuscar = sc.nextLine();
                        miBiblioteca.buscarLibro(tituloBuscar);
                    }
                    System.out.println("Continuar ->");
                    sc.nextLine();
                    break;
                case 4:
                    if(miBiblioteca.bibliotecaVacia==true){
                        System.out.println("No hay ningun libro disponible.");
                        sc.nextLine();
                    }
                    else{
                        System.out.println("Ingrese el titulo del libro que desea marcar como -Leido- (en letras minusculas):");
                        sc.nextLine();
                        String tituloMarcar = sc.nextLine();
                        miBiblioteca.marcarLibroLeido(tituloMarcar);
                        librosLeidos += 1;
                    }
                    System.out.println("Continuar ->");
                    sc.nextLine();
                    break;
                case 5:
                    if(librosLeidos<librosRegistrados){
                        System.out.println("Estos son los libros que no has leido:");
                        miBiblioteca.mostrarLibrosNoLeidos();
                    }
                    else{
                        System.out.println("No hay ningun libro sin leer.");
                    }
                    System.out.println("Continuar ->");
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("opcion invalida, intente de nuevo... Continuar->");
                    sc.nextLine();
                    sc.nextLine();
            }
        }
    }
}
