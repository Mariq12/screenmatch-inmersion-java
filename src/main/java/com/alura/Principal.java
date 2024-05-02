package com.alura;

import java.util.Locale;
import java.util.Scanner;

import com.alura.model.Pelicula;
import com.alura.model.Serie;

public class Principal {
    public void muestraElMenu() {
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        try {
            while (opcion != 3) {
                String menu = """
                        \n*** Bienvenido(a) a Screenmatch ***\n
                        1) Registrar nueva película
                        2) Registrar nueva serie
                        3) Salir
                        """;
                System.out.print(menu);
                System.out.print("Elija una opción: ");
                if (teclado.hasNextLine()) { // Verifica si hay una siguiente línea disponible
                    opcion = teclado.nextInt();
                    teclado.nextLine(); // Consumir el salto de línea
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
                            System.out.println("Opción no válida");
                    }
                } else {
                    opcion = 3; // Si no hay más entradas, salimos del bucle
                }
            }
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
        // Crea un nuevo objeto Scanner con el delimitador adecuado
        Scanner doubleScanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Ingrese la evaluación de la película: ");
        double evaluacion = doubleScanner.nextDouble(); // Usa este nuevo Scanner para leer valores decimales
        doubleScanner.nextLine(); // Limpia el buffer del nuevo Scanner
        System.out.print("¿Incluido en el plan básico? (true/false): ");
        boolean incluidoEnElPlanBasico = teclado.nextBoolean();
        teclado.nextLine();
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
        teclado.nextLine(); // Consumir el salto de línea
    
        // Utiliza try-with-resources para garantizar que el Scanner se cierre automáticamente
        try (Scanner doubleScanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.print("Ingrese la evaluación de la serie: ");
            double evaluacion = doubleScanner.nextDouble();
            doubleScanner.nextLine(); // Limpia el buffer del nuevo Scanner
            
            System.out.print("¿Incluido en el plan básico? (true/false): ");
            boolean incluidoEnElPlanBasico = teclado.nextBoolean();
            teclado.nextLine();
            
            System.out.print("Ingrese la sinopsis de la serie: ");
            String sinopsis = teclado.nextLine();
            
            System.out.print("Ingrese el número de temporadas: ");
            int temporadas = teclado.nextInt();
            teclado.nextLine();
            
            System.out.print("Ingrese el número de episodios por temporada: ");
            int episodiosPorTemporada = teclado.nextInt();
            teclado.nextLine(); // Consumir el salto de línea
            
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
}

/*
 * package com.alura;
 * 
 * import java.util.Locale; // Importa la clase Locale
 * import java.util.Scanner;
 * 
 * import com.alura.model.Pelicula;
 * 
 * public class Principal {
 * public void muestraElMenu(){
 * int opcion = 0;
 * Scanner teclado = new Scanner(System.in);
 * try {
 * while (opcion != 3){
 * String menu = """
 * \n*** Bienvenido(a) a Screenmatch ***\n
 * 1) Registrar nueva película
 * 2) Registrar nueva serie
 * 3) Salir
 * """;
 * System.out.print(menu);
 * System.out.print("Elija una opción: ");
 * opcion = teclado.nextInt();
 * teclado.nextLine();
 * switch (opcion){
 * case 1:
 * System.out.print("Ingrese el nombre de la película: ");
 * String nombre = teclado.nextLine();
 * System.out.print("Ingrese el año de lanzamiento de la película: ");
 * int fechaDeLanzamiento = teclado.nextInt();
 * teclado.nextLine();
 * // Crea un nuevo objeto Scanner con el delimitador adecuado
 * Scanner doubleScanner = new Scanner(System.in).useLocale(Locale.US);
 * System.out.print("Ingrese la evaluación de la película: ");
 * double evaluacion = doubleScanner.nextDouble(); // Usa este nuevo Scanner
 * para leer valores decimales
 * doubleScanner.nextLine(); // Limpia el buffer del nuevo Scanner
 * System.out.print("¿Incluido en el plan básico? (true/false): ");
 * boolean incluidoEnElPlanBasico = teclado.nextBoolean();
 * teclado.nextLine();
 * System.out.print("Ingrese la sinopsis de la película: ");
 * String sinopsis = teclado.nextLine();
 * System.out.print("Ingrese la duración en minutos de la película: ");
 * int duracionEnMinutos = teclado.nextInt();
 * teclado.nextLine();
 * Pelicula peliculaUsuario = new Pelicula();
 * peliculaUsuario.setNombre(nombre);
 * peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
 * peliculaUsuario.setEvaluacion(evaluacion);
 * peliculaUsuario.setIncluidoEnElPlanBasico(incluidoEnElPlanBasico);
 * peliculaUsuario.setSinopsis(sinopsis);
 * peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
 * peliculaUsuario.muestraFichaTecnica();
 * break;
 * case 3:
 * System.out.println("Saliendo del programa");
 * break;
 * default:
 * System.out.println("Opción no válida");
 * }
 * }
 * } finally {
 * teclado.close();
 * }
 * }
 * }
 */