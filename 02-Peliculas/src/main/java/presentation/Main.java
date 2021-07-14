package presentation;

import services.MovieCatalog;
import services.MovieCatalogImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var option = -1;
        var input = new Scanner(System.in);
        MovieCatalog catalog = new MovieCatalogImpl();

        while (option != 0){
            System.out.println("Elige una opción:\n" +
                    "1. Iniciar catálogo de películas.\n" +
                    "2. Agregar película.\n" +
                    "3. Listar películas.\n" +
                    "4. Buscar película.\n" +
                    "0. Salir.");

            option = Integer.parseInt(input.nextLine());

            switch (option){
                case 1:
                    catalog.startMovieCatalog();
                    break;
                case 2:
                    System.out.println("Introduce el nombre de la película");
                    var movieName = input.nextLine();
                    catalog.addMovie(movieName);
                    break;
                case 3:
                    catalog.listMovies();
                    break;
                case 4:
                    System.out.println("Introduce una película a buscar");
                    var search = input.nextLine();
                    catalog.searchMovie(search);
                    break;
                case 0:
                    System.out.println("Hasta Pronto!");
                    break;
                default:
                    System.out.println("Opción no reconocida");
                    break;
            }
        }

    }

}
