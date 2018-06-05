package examen;

import java.util.Scanner;

public class Examen {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion = 0;
        int cantidadLibros = 0;//cuantos libros va a ingresar desde el principio
        int libroFavorito;
        System.out.println("BIBLIOTECA PERSONAL");
        System.out.println("Cuantos libros desea ingresar ");
        cantidadLibros = scan.nextInt();
        Libro[] libros = new Libro[cantidadLibros]; //arreglo para ingreso de datos
        Libro[] librosFavoritos = new Libro[1];
        for (int i = 0; i < libros.length; i++) {
            boolean favorito = false;
            System.out.println("Ingrese el titulo del libro " + (i + 1));
            scan.nextLine();
            String titulo = scan.nextLine();
            System.out.println("Ingrese el año de publicacion del libro");
            int anio = scan.nextInt();
            Autor[] autor = new Autor[1];//arreglo para ingreso datos del autor
            for (int j = 0; j < autor.length; j++) {
                System.out.println("Ingrese los datos del autor ");
                System.out.println("nombre del autor :");
                scan.nextLine();
                String nombre = scan.nextLine();
                System.out.println("Ingrese el pais de nacimiento del autor ");
                String pais = scan.nextLine();
                autor[j] = new Autor(nombre, pais);
            }
            System.out.println("Libro ingresado exitosamente ");
            /*System.out.println("presione 1 si desea añadirlo a su lista de favoritos ");
            System.out.println("si no es asi presione 0 y continue");
            libroFavorito = scan.nextInt();
            if (libroFavorito == 1) {
                favorito = true;
                System.out.println("libro ingresado a lista de favoritos");
                librosFavoritos[i] = new Libro(titulo, anio, autor);
            }*/
            

            libros[i] = new Libro(titulo, anio, autor);//arreglo de acumulacion para impresion
            System.out.println();
        }

        do {
            System.out.println("Menu de opciones");
            System.out.println("1._Ingresar nuevo libro a la biblioteca");
            System.out.println("2._Visualizar Lista de libros favoritos");
            System.out.println("3._Libros ingresados");
            System.out.println("4._Salir");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    if (cantidadLibros == 10) {
                        System.out.println("YA ESTA COMPLETA SU LIBRERIA");
                    } else {
                        System.out.println("ingrese el nuevo libro");
                        Libro[] nuevoLibro = new Libro[1];
                        Libro[] nuevoFavorito = new Libro[1];
                        for (int i = 0; i < nuevoLibro.length; i++) {
                            boolean favorito = false;
                            System.out.println("Ingrese el titulo del libro ");
                            scan.nextLine();
                            String titulo = scan.nextLine();
                            System.out.println("Ingrese el año de publicacion del libro");
                            int anio = scan.nextInt();

                            Autor[] autor = new Autor[1];
                            for (int j = 0; j < autor.length; j++) {
                                System.out.println("Ingrese los datos del autor ");
                                System.out.println("nombre del autor :");
                                scan.nextLine();
                                String nombre = scan.nextLine();
                                System.out.println("Ingrese el pais de nacimiento del autor ");
                                String pais = scan.nextLine();
                                autor[j] = new Autor(nombre, pais);
                            }

                            System.out.println("DESEA AÑADIRLO A LA LISTA DE FAVORITOS");
                            System.out.println("presione 1 si desea añadirlo a su lista de favoritos ");
                            System.out.println("si no es asi presione 0 y continue");
                            libroFavorito = scan.nextInt();
                            if (libroFavorito == 1) {
                                favorito = true;
                                System.out.println("libro ingresado a lista de favoritos");
                                nuevoFavorito[i] = new Libro(titulo, anio, autor);
                            }
                            nuevoLibro[i] = new Libro(titulo, anio, autor);
                        }
                        System.out.println("Nuevo libro ingresado exitosamente ");
                        for (int i = 0; i < nuevoLibro.length; i++) {
                            System.out.println("LIBRO " + (i + 1) + " :" + nuevoLibro[i]);
                        }
                        break;
                    }

                case 2:
                    if (cantidadLibros == 0) {
                        System.out.println("no existen libros ingresados");
                    } else {
                        System.out.println("Libros Favoritos");
                        for (int i = 0; i < libros.length; i++) {
                            System.out.println("LIBRO :" + (i + 1) + " :" + librosFavoritos[i]);
                        }
                    }
                    break;
                case 3:
                    if (cantidadLibros == 0) {
                        System.out.println("no existen libros ingresados");
                    } else {
                        System.out.println("CANTIDAD LIBROS");
                        for (int i = 0; i < libros.length; i++) {
                            System.out.println("LIBRO " + (i + 1) + " :" + libros[i]);
                        }

                    }
                    break;

                case 4:
                    System.out.println("Gracias!");
                    break;

                default:
                    System.out.println("Ingrese opcion correcta");

            }
        } while (opcion != 4);
    }
}
