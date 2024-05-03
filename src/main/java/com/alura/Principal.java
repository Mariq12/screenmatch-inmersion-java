package com.alura;

import java.util.Scanner;
import com.alura.model.Pelicula;
import com.alura.model.Serie;
import com.alura.model.Titulo; // Importamos la clase Titulo

public class Principal {
    private Scanner teclado;

    public Principal() {
        teclado = new Scanner(System.in);
    }

    public void muestraElMenu() {
        try {
            int opcion;
            do {
                String menu = """
                        \n*** Bienvenido(a) a Screenmatch ***\n
                        1) Registrar nueva película
                        2) Registrar nueva serie
                        3) Salir
                        """;
                System.out.print(menu);
                System.out.print("Elija una opción: ");
                opcion = teclado.nextInt();
                teclado.nextLine(); // Limpiar el buffer
                
                switch (opcion) {
                    case 1:
                        registrarContenido(new Pelicula());
                        break;
                    case 2:
                        registrarContenido(new Serie());
                        break;
                    case 3:
                        System.out.println("Saliendo del programa");
                        break;
                    default:
                        System.out.println("Por favor, ingrese una opción válida.");
                }
            } while (opcion != 3);
        } finally {
            teclado.close();
        }
    }

    private void registrarContenido(Titulo contenido) {
        System.out.printf("Ingrese el nombre del título: ");
        String nombre = teclado.nextLine();
        
        int fechaDeLanzamiento;
        while (true) {
            try {
                System.out.print("Ingrese el año de lanzamiento: ");
                fechaDeLanzamiento = Integer.parseInt(teclado.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un año válido.");
            }
        }
        
        double evaluacion;
        while (true) {
            try {
                System.out.print("Ingrese la evaluación: ");
                evaluacion = Double.parseDouble(teclado.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese una evaluación válida.");
            }
        }
        
        boolean incluidoEnElPlanBasico;
        while (true) {
            System.out.print("¿Incluido en el plan básico? (true/false): ");
            String incluido = teclado.nextLine();
            if (incluido.equalsIgnoreCase("true") || incluido.equalsIgnoreCase("false")) {
                incluidoEnElPlanBasico = Boolean.parseBoolean(incluido);
                break;
            } else {
                System.out.println("Por favor, ingrese 'true' o 'false'.");
            }
        }
        
        System.out.print("Ingrese la sinopsis: ");
        String sinopsis = teclado.nextLine();
        
        contenido.setNombre(nombre);
        contenido.setFechaDeLanzamiento(fechaDeLanzamiento);
        contenido.setEvaluacion(evaluacion);
        contenido.setIncluidoEnElPlanBasico(incluidoEnElPlanBasico);
        contenido.setSinopsis(sinopsis);
        if (contenido instanceof Pelicula) {
            Pelicula pelicula = (Pelicula) contenido;
            System.out.print("Ingrese la duración en minutos: ");
            int duracionEnMinutos = teclado.nextInt();
            teclado.nextLine();
            pelicula.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
        } else if (contenido instanceof Serie) {
            Serie serie = (Serie) contenido;
            System.out.print("Ingrese el número de temporadas: ");
            int temporadas = teclado.nextInt();
            teclado.nextLine();
            serie.setTemporadas(temporadas);
            System.out.print("Ingrese el número de episodios por temporada: ");
            int episodiosPorTemporada = teclado.nextInt();
            teclado.nextLine();
            serie.setEpisodiosPorTemporada(episodiosPorTemporada);
            System.out.print("Ingrese la duración en minutos por episodio: ");
            int duracionEnMinutosPorEpisodio = teclado.nextInt();
            teclado.nextLine();
            serie.setDuracionEnMinutosPorEpisodio(duracionEnMinutosPorEpisodio);
        }
        
        contenido.muestraFichaTecnica();
    }
    
}