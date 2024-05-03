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



// OK
/*package com.alura;

import java.util.Scanner;
import com.alura.model.Pelicula;
import com.alura.model.Serie;

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
                        registrarContenido("película");
                        break;
                    case 2:
                        registrarContenido("serie");
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

    private void registrarContenido(String tipoContenido) {
        System.out.printf("Ingrese el nombre de la %s: ", tipoContenido);
        String nombre = teclado.nextLine();
        
        int fechaDeLanzamiento;
        while (true) {
            try {
                System.out.printf("Ingrese el año de lanzamiento de la %s: ", tipoContenido);
                fechaDeLanzamiento = Integer.parseInt(teclado.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un año válido.");
            }
        }
        
        double evaluacion;
        while (true) {
            try {
                System.out.printf("Ingrese la evaluación de la %s: ", tipoContenido);
                evaluacion = Double.parseDouble(teclado.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese una evaluación válida.");
            }
        }
        
        boolean incluidoEnElPlanBasico;
        while (true) {
            System.out.printf("¿Incluido en el plan básico? (true/false) para la %s: ", tipoContenido);
            String incluido = teclado.nextLine();
            if (incluido.equalsIgnoreCase("true") || incluido.equalsIgnoreCase("false")) {
                incluidoEnElPlanBasico = Boolean.parseBoolean(incluido);
                break;
            } else {
                System.out.println("Por favor, ingrese 'true' o 'false'.");
            }
        }
        
        System.out.printf("Ingrese la sinopsis de la %s: ", tipoContenido);
        String sinopsis = teclado.nextLine();
        
        if (tipoContenido.equals("película")) {
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
        } else if (tipoContenido.equals("serie")) {
            System.out.print("Ingrese el número de temporadas: ");
            int temporadas = teclado.nextInt();
            teclado.nextLine();
            System.out.print("Ingrese el número de episodios por temporada: ");
            int episodiosPorTemporada = teclado.nextInt();
            teclado.nextLine();
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
*/


/*package com.alura;



import java.util.Scanner;

import com.alura.model.Pelicula;

public class Principal {
    public void muestraElMenu(){
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            String menu = """
                    Bienvenido(a) a Screenmatch
                    1) Registrar nueva pelicula
                    2) Registrar nueva serie
                    
                    9) Salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre de la película");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la película");
                    int fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la duración en minutos de la película");
                    int duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();
                    Pelicula peliculaUsuario = new Pelicula();
                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                    peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
                    peliculaUsuario.muestraFichaTecnica();
                    break;
                case 9:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida");
            }


        }
    }
}
*/


/*package com.alura;

import java.util.Scanner;
import com.alura.model.Pelicula;
import com.alura.model.Serie;

public class Principal {
    private static Scanner teclado = new Scanner(System.in);

    private static String nombre, sinopsis;
    private static int fechaDeLanzamiento, duracionEnMinutos, temporadas, episodiosPorTemporada, duracionEnMinutosPorEpisodio;
    private static double evaluacion;
    private static boolean incluidoEnElPlanBasico;

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
                        registrarPelicula();
                        break;
                    case 2:
                        registrarSerie();
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

    private static void registrarPelicula() {
        obtenerDatosComunes();
        Pelicula peliculaUsuario = new Pelicula();
        peliculaUsuario.setNombre(nombre);
        peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
        peliculaUsuario.setEvaluacion(evaluacion);
        peliculaUsuario.setIncluidoEnElPlanBasico(incluidoEnElPlanBasico);
        peliculaUsuario.setSinopsis(sinopsis);
        peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
        peliculaUsuario.muestraFichaTecnica();
    }

    private static void registrarSerie() {
        obtenerDatosComunes();
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
        serieUsuario.muestraFichaTecnica();
    }

    private static void obtenerDatosComunes() {
        System.out.print("Ingrese el nombre: ");
        nombre = teclado.nextLine();
        fechaDeLanzamiento = obtenerEntero("Ingrese el año de lanzamiento: ", "Por favor, ingrese un año válido.");
        evaluacion = obtenerDouble("Ingrese la evaluación: ", "Por favor, ingrese una evaluación válida.");
        incluidoEnElPlanBasico = obtenerBoolean("¿Incluido en el plan básico? (true/false): ", "Por favor, ingrese 'true' o 'false'.");
        System.out.print("Ingrese la sinopsis: ");
        sinopsis = teclado.nextLine();
        duracionEnMinutos = obtenerEntero("Ingrese la duración en minutos: ", "Por favor, ingrese una duración válida.");
    }

    private static int obtenerEntero(String mensaje, String mensajeError) {
        int valor;
        while (true) {
            try {
                System.out.print(mensaje);
                valor = Integer.parseInt(teclado.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println(mensajeError);
            }
        }
        return valor;
    }

    private static double obtenerDouble(String mensaje, String mensajeError) {
        double valor;
        while (true) {
            try {
                System.out.print(mensaje);
                valor = Double.parseDouble(teclado.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println(mensajeError);
            }
        }
        return valor;
    }

    private static boolean obtenerBoolean(String mensaje, String mensajeError) {
        boolean valor;
        while (true) {
            System.out.print(mensaje);
            String entrada = teclado.nextLine();
            if (entrada.equalsIgnoreCase("true") || entrada.equalsIgnoreCase("false")) {
                valor = Boolean.parseBoolean(entrada);
                break;
            } else {
                System.out.println(mensajeError);
            }
        }
        return valor;
    }
}
*/




// OK PERO FALTA HACER Q NO SE REPITAN ATRIBUTOS

/*package com.alura;

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
        
        int fechaDeLanzamiento;
        while (true) {
            try {
                System.out.print("Ingrese el año de lanzamiento de la película: ");
                fechaDeLanzamiento = Integer.parseInt(teclado.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un año válido.");
            }
        }
        
        double evaluacion;
        while (true) {
            try {
                System.out.print("Ingrese la evaluación de la película: ");
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
        
        int fechaDeLanzamiento;
        while (true) {
            try {
                System.out.print("Ingrese el año de lanzamiento de la serie: ");
                fechaDeLanzamiento = Integer.parseInt(teclado.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un año válido.");
            }
        }
        
        double evaluacion;
        while (true) {
            try {
                System.out.print("Ingrese la evaluación de la serie: ");
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
        
        System.out.print("Ingrese la sinopsis de la serie: ");
        String sinopsis = teclado.nextLine();
        System.out.print("Ingrese el número de temporadas: ");
        int temporadas = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Ingrese el número de episodios por temporada: ");
        int episodiosPorTemporada = teclado.nextInt();
        teclado.nextLine();
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
*/