package com.alura;

import java.util.Scanner;

import com.alura.model.Pelicula;

public class Principal {
    public void muestraElMenu(){
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        try {
            while (opcion != 3){
                
                String menu = """
                        \n*** Bienvenido(a) a Screenmatch ***\n
                        1) Registrar nueva pelicula
                        2) Registrar nueva serie
                        3) Salir
                        """;
                System.out.print(menu);
                System.out.print("Elija una opción: ");
                opcion = teclado.nextInt();
                teclado.nextLine();
                switch (opcion){
                    case 1:
                        System.out.print("Ingrese el nombre de la película: ");
                        String nombre = teclado.nextLine();
                        System.out.print("Ingrese el año de lanzamiento de la película: ");
                        int fechaDeLanzamiento = teclado.nextInt();
                        teclado.nextLine();
                        System.out.print("Ingrese la duración en minutos de la película: ");
                        int duracionEnMinutos = teclado.nextInt();
                        teclado.nextLine();
                        Pelicula peliculaUsuario = new Pelicula();
                        peliculaUsuario.setNombre(nombre);
                        peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                        peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
                        peliculaUsuario.muestraFichaTecnica();
                        break;
                    case 3:
                        System.out.println("Saliendo del programa");
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
            }
        } finally {
            teclado.close();
        }
    }
}