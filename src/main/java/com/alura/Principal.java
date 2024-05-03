package com.alura;

import java.util.Scanner;

import com.alura.model.Pelicula;
import com.alura.model.Serie;

public class Principal {
    public void muestraElMenu() {
        Scanner teclado = new Scanner(System.in);
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
                        registrarPelicula(teclado);
                        break;
                    case 2:
                        registrarSerie(teclado);
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
    

    private void registrarPelicula(Scanner teclado) {
        System.out.print("Ingrese el nombre de la película: ");
        String nombre = teclado.nextLine();
        System.out.print("Ingrese el año de lanzamiento de la película: ");
        int fechaDeLanzamiento = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Ingrese la evaluación de la película: ");
        double evaluacion = Double.parseDouble(teclado.nextLine());
        System.out.print("¿Incluido en el plan básico? (true/false): ");
        boolean incluidoEnElPlanBasico = Boolean.parseBoolean(teclado.nextLine());
        System.out.print("Ingrese la sinopsis de la película: ");
        String sinopsis = teclado.nextLine();
        System.out.print("Ingrese la duración en minutos de la película: ");
        int duracionEnMinutos = teclado.nextInt();
        teclado.nextLine();
        Pelicula peliculaUsuario = new Pelicula();
        peliculaUsuario.setNombre(nombre);
        peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
        peliculaUsuario.setEvaluacion(evaluacion);
        peliculaUsuario.setIncluidoEnElPlanBasico(incluidoEnElPlanBasico);
        peliculaUsuario.setSinopsis(sinopsis);
        peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
        peliculaUsuario.muestraFichaTecnica();
    }

    private void registrarSerie(Scanner teclado) {
        System.out.print("Ingrese el nombre de la serie: ");
        String nombre = teclado.nextLine();
        System.out.print("Ingrese el año de lanzamiento de la serie: ");
        int fechaDeLanzamiento = teclado.nextInt();
        teclado.nextLine(); // Limpiar el buffer
    
        System.out.print("Ingrese la evaluación de la serie: ");
        double evaluacion = Double.parseDouble(teclado.nextLine());
        System.out.print("¿Incluido en el plan básico? (true/false): ");
        boolean incluidoEnElPlanBasico = Boolean.parseBoolean(teclado.nextLine());
        System.out.print("Ingrese la sinopsis de la serie: ");
        String sinopsis = teclado.nextLine();
        System.out.print("Ingrese el número de temporadas: ");
        int temporadas = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Ingrese el número de episodios por temporada: ");
        int episodiosPorTemporada = teclado.nextInt();
        teclado.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese la duración en minutos por episodio: ");
        int duracionEnMinutosPorEpisodio = teclado.nextInt();
        teclado.nextLine();
    
        Serie serieUsuario = new Serie();
        serieUsuario.setNombre(nombre);
        serieUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
        serieUsuario.setEvaluacion(evaluacion);
        serieUsuario.setIncluidoEnElPlanBasico(incluidoEnElPlanBasico);
        serieUsuario.setSinopsis(sinopsis);
        serieUsuario.setTemporadas(temporadas);
        serieUsuario.setEpisodiosPorTemporada(episodiosPorTemporada);
        serieUsuario.setDuracionEnMinutosPorEpisodio(duracionEnMinutosPorEpisodio);
        serieUsuario.setTiempoDeDuracionEnMinutos(temporadas * episodiosPorTemporada * duracionEnMinutosPorEpisodio);
    
        // Muestra la ficha técnica después de ingresar los datos
        serieUsuario.muestraFichaTecnica();
    }
}