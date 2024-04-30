package com.alura;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n -----Bienvenidos a la inmersión en Java-----");

        // Declaración de variables
        String[] nombres = { "Harry Potter y la piedra filosofal"};
        int[] fechasDeLanzamiento = { 2001};
        double[] evaluaciones = { 4.8 };
        boolean[] incluidosEnElPlanBasico = { true };
        String[] sinopsis = {
                "Un niño descubre que es un mago y asiste a una escuela de magia"
        };

        // Ciclo para cada película
        int indicePelicula = 0;
        while (indicePelicula < nombres.length) {
            System.out.println("\nPelícula: " + nombres[indicePelicula]);
            
            // Definición de la fecha de lanzamiento
            int fechaDeLanzamiento = fechasDeLanzamiento[indicePelicula];
            
            // Condición if y else
            if (fechaDeLanzamiento >= 2023) {
                System.out.println("Película Popular en el momento");
            } else {
                System.out.println("Película Retro que vale la pena ver");
            }
            
            // Imprimir otras características de la película
            System.out.println("Fecha de Lanzamiento: " + fechaDeLanzamiento);
            System.out.println("Evaluación: " + evaluaciones[indicePelicula]);
            System.out.println("Incluida en el Plan Básico: " + incluidosEnElPlanBasico[indicePelicula]);
            System.out.println("Sinopsis: " + sinopsis[indicePelicula]);
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

            double mediaEvaluacion = mediaEvaluacionUsuario / cantidadEvaluaciones;
            System.out.println("\n La media de la evaluación de " + nombres[indicePelicula] +
                    " calculada por el usuario es: " + mediaEvaluacion);
            System.out.println();

            indicePelicula++;
        }
    }
}
