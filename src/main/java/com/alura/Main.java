package com.alura;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n -----Bienvenidos a la inmersión en Java-----");

        // Declaración de variables para la única película
        String nombre = "Harry Potter y la piedra filosofal";
        int fechaDeLanzamiento = 2001;
        double evaluacion = 4.8;
        boolean incluidoEnElPlanBasico = true;
        String sinopsis = "Un niño descubre que es un mago y asiste a una escuela de magia";

        // Mostrar información de la única película
        System.out.println("\nPelícula: " + nombre);
        System.out.println("Fecha de Lanzamiento: " + fechaDeLanzamiento);
        
        // Condición if y else para la fecha de lanzamiento
        if (fechaDeLanzamiento >= 2023) {
            System.out.println("Película Popular en el momento");
        } else {
            System.out.println("Película Retro que vale la pena ver");
        }
        
        // Mostrar otras características de la película
        System.out.println("Evaluación: " + evaluacion);
        System.out.println("Incluida en el Plan Básico: " + incluidoEnElPlanBasico);
        System.out.println("Sinopsis: " + sinopsis);

        // Solicitar las calificaciones de la única película
        System.out.println("\nIngresa la nota que le darías a esta película");
        System.out.println("\nEl número ingresado debe ser de 1 a 5");

        double mediaEvaluacionUsuario = 0;
        int cantidadEvaluaciones = 3;
        int contadorEvaluaciones = 0;

        Scanner teclado = new Scanner(System.in);
        while (contadorEvaluaciones < cantidadEvaluaciones) {
            System.out.print("Nota " + (contadorEvaluaciones + 1) + ": ");
            double notaPelicula = teclado.nextDouble();
            mediaEvaluacionUsuario += notaPelicula;
            contadorEvaluaciones++;
        }

        teclado.close(); // Cerrar el Scanner

        // Calcular y mostrar la media de las calificaciones
        double mediaEvaluacion = mediaEvaluacionUsuario / cantidadEvaluaciones;
        String mediaFormateada = String.format("%.2f", mediaEvaluacion);
        System.out.println("\nLa media de la evaluación de " + nombre +
                " calculada por el usuario es: " + mediaFormateada);
        System.out.println();
    }
}