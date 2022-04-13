package mx.com.gm.peliculas.presentacion;

import java.util.Scanner;
import mx.com.gm.peliculas.servicios.*;

public class CatalogoPeliculasPresentacion {

    public static void main(String[] args) {
        var opcion = -1;
        var scanner = new Scanner(System.in);
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();

        while (opcion != 0) {
            System.out.println("Elige una Opcion: \n"
                    + "1.iniciar catalogo de peliculas \n"
                    + "2.Agregar Pelicula \n"
                    + "3.Listar Peliculas \n"
                    + "4.Buscar Pelicula \n"
                    + "0.Salir");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    catalogo.iniciarCatalogoPeliculas();
                    break;

                case 2:
                    System.out.println("nombre de la pelicula a agregaar");
                    var nombre = scanner.nextLine();
                    catalogo.agregarPelicula(nombre);
                    break;
                case 3:
                    catalogo.listarPeliculas();
                    break;
                case 4:
                    System.out.println("pelicula a buscar");
                    var buscar = scanner.nextLine();
                    catalogo.buscarPelicula(buscar);
                    break;
                case 0:
                    System.out.println("gracias por visitarnos");
                    break;
                default:
                    System.out.println("opcion no reconocida");
                    break;

            }
        }
    }

}
