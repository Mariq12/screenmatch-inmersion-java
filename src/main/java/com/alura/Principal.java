package com.alura;

import java.util.ArrayList;
import java.util.List;
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
                        3) Calculadora de tiempo para una maratón de películas
                        4) Salir
                        """;
                System.out.print(menu);
                System.out.print("Elija una opción: ");
                opcion = teclado.nextInt();
                teclado.nextLine(); // Limpiar el buffer

                switch (opcion) {
                    case 1:
                        System.out.println("\n*** Registro de Nueva Película ***");
                        registrarContenido(new Pelicula());
                        break;
                    case 2:
                        System.out.println("\n*** Registro de Nueva Serie ***");
                        registrarContenido(new Serie());
                        break;
                    case 3:
                    System.out.println("\n*** Calcula el tiempo de una Maratón ***");
                        calcularMaraton();
                        break;
                    case 4:
                        System.out.println("Saliendo del programa");
                        break;
                    default:
                        System.out.println("Por favor, ingrese una opción válida.");
                }
            } while (opcion != 4);
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
                System.out.print("Ingrese la evaluación de 1 a 5: ");
                evaluacion = Double.parseDouble(teclado.nextLine());
                if (evaluacion >= 1 && evaluacion <= 5) {
                    break;
                } else {
                    System.out.println("Por favor, ingrese una evaluación válida entre 1 y 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese una evaluación válida.");
            }
        }

        boolean incluidoEnElPlanBasico;
        while (true) {
            System.out.print("¿Incluido en el plan básico? (Si/No): ");
            String incluido = teclado.nextLine();
            if (incluido.equalsIgnoreCase("Si")) {
                incluidoEnElPlanBasico = true;
                break;
            } else if (incluido.equalsIgnoreCase("No")) {
                incluidoEnElPlanBasico = false;
                break;
            } else {
                System.out.println("Por favor, ingrese 'Si' o 'No'.");
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

    private void calcularMaraton() {
        List<Titulo> maraton = new ArrayList<>();
        double totalMinutosPeliculas = 0;
        double totalMinutosSeries = 0;
        int numeroPeliculas = 0;
        int numeroSeries = 0;
    
        System.out.println("Ingresa 'listo' cuando hayas agregado todas tus películas y series.");
    
        while (true) {
            System.out.print("Ingrese el tipo de título (Pelicula/Serie) (o 'listo' para terminar): ");
            String tipoTitulo = teclado.nextLine();
    
            if (tipoTitulo.equalsIgnoreCase("listo")) {
                break;
            }
    
            // Crear instancia de Titulo (Pelicula o Serie) según el tipo ingresado
            Titulo titulo;
            if (tipoTitulo.equalsIgnoreCase("Pelicula")) {
                titulo = new Pelicula();
                numeroPeliculas++;
                System.out.print("Ingrese el nombre de la película: ");
                String nombre = teclado.nextLine();
                titulo.setNombre(nombre);
    
                System.out.print("Ingrese la duración en minutos: ");
                int duracion = teclado.nextInt();
                teclado.nextLine(); // Limpiar el buffer
                titulo.setTiempoDeDuracionEnMinutos(duracion);
    
                totalMinutosPeliculas += duracion;
            } else if (tipoTitulo.equalsIgnoreCase("Serie")) {
                titulo = new Serie();
                numeroSeries++;
                System.out.print("Ingrese el nombre de la serie: ");
                String nombre = teclado.nextLine();
                titulo.setNombre(nombre);
    
                Serie serie = (Serie) titulo;
    
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
    
                totalMinutosSeries += (temporadas * episodiosPorTemporada * duracionEnMinutosPorEpisodio);
            } else {
                System.out.println("Tipo de título no válido.");
                continue;
            }
    
            // Agregar el título a la lista de maratón
            maraton.add(titulo);
        }
    
        // Mostrar la ficha técnica de la maratón
        System.out.println("\n**** FICHA TÉCNICA DE LA MARATÓN ****\n");
        for (Titulo t : maraton) {
            System.out.println("Nombre del título: " + t.getNombre());
            System.out.println("   Tiempo de duración: " + t.getTiempoDeDuracionEnMinutos() + " minutos");
            if (t instanceof Serie) {
                Serie serie = (Serie) t;
                System.out.println("      " + serie.getTemporadas() + " Temporadas: ");
                System.out.println("      " + serie.getEpisodiosPorTemporada() + " Episodios por temporada: ");
                System.out.println("      " + serie.getDuracionEnMinutosPorEpisodio() + " Duración en minutos por episodio: ");
            }
            System.out.println("");
        }
    
        System.out.println("¡Tu maratón está lista!");
        System.out.println("Total de minutos en películas: " + totalMinutosPeliculas + " minutos");
        System.out.println("Total de minutos en series: " + totalMinutosSeries + " minutos");
        System.out.println("Total general de minutos: " + (totalMinutosPeliculas + totalMinutosSeries) + " minutos");
    }
}




/*package com.alura;

import java.util.ArrayList;
import java.util.List;
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
                        3) Calculadora de tiempo para una maratón de películas
                        4) Salir
                        """;
                System.out.print(menu);
                System.out.print("Elija una opción: ");
                opcion = teclado.nextInt();
                teclado.nextLine(); // Limpiar el buffer

                switch (opcion) {
                    case 1:
                        System.out.println("\n*** Registro de Nueva Película ***");
                        registrarContenido(new Pelicula());
                        break;
                    case 2:
                        System.out.println("\n*** Registro de Nueva Serie ***");
                        registrarContenido(new Serie());
                        break;
                    case 3:
                    System.out.println("\n*** Calcula el tiempo de una Maratón ***");
                        calcularMaraton();
                        break;
                    case 4:
                        System.out.println("Saliendo del programa");
                        break;
                    default:
                        System.out.println("Por favor, ingrese una opción válida.");
                }
            } while (opcion != 4);
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
                System.out.print("Ingrese la evaluación de 1 a 5: ");
                evaluacion = Double.parseDouble(teclado.nextLine());
                if (evaluacion >= 1 && evaluacion <= 5) {
                    break;
                } else {
                    System.out.println("Por favor, ingrese una evaluación válida entre 1 y 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese una evaluación válida.");
            }
        }

        boolean incluidoEnElPlanBasico;
        while (true) {
            System.out.print("¿Incluido en el plan básico? (Si/No): ");
            String incluido = teclado.nextLine();
            if (incluido.equalsIgnoreCase("Si")) {
                incluidoEnElPlanBasico = true;
                break;
            } else if (incluido.equalsIgnoreCase("No")) {
                incluidoEnElPlanBasico = false;
                break;
            } else {
                System.out.println("Por favor, ingrese 'Si' o 'No'.");
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

    private void calcularMaraton() {
        List<Titulo> maraton = new ArrayList<>();
        double totalMinutos = 0;
        int numeroTitulo = 1;
    
        System.out.println("Ingresa 'listo' cuando hayas agregado todas tus películas y series.");
    
        while (true) {
            System.out.print("Ingrese el tipo de título (Pelicula/Serie) (o 'listo' para terminar): ");
            String tipoTitulo = teclado.nextLine();
    
            if (tipoTitulo.equalsIgnoreCase("listo")) {
                break;
            }
    
            // Crear instancia de Titulo (Pelicula o Serie) según el tipo ingresado
            Titulo titulo;
            if (tipoTitulo.equalsIgnoreCase("Pelicula")) {
                titulo = new Pelicula();
            } else if (tipoTitulo.equalsIgnoreCase("Serie")) {
                titulo = new Serie();
            } else {
                System.out.println("Tipo de título no válido.");
                continue;
            }
    
            System.out.print("Ingrese el nombre del título: ");
            String nombre = teclado.nextLine();
    
            System.out.print("Ingrese la duración en minutos: ");
            int duracion = teclado.nextInt();
            teclado.nextLine(); // Limpiar el buffer
    
            totalMinutos += duracion;
    
            // Configurar los atributos comunes a Pelicula y Serie
            titulo.setNombre(nombre);
            titulo.setTiempoDeDuracionEnMinutos(duracion);
    
            // Configurar los atributos específicos de Serie, si es el caso
            if (titulo instanceof Serie) {
                Serie serie = (Serie) titulo;
    
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
    
            // Agregar el título a la lista de maratón
            maraton.add(titulo);
        }
    
        // Mostrar la ficha técnica de la maratón
        System.out.println("\n**** FICHA TÉCNICA DE LA MARATÓN ****\n");
        for (Titulo t : maraton) {
            System.out.println(numeroTitulo + ". Nombre del título: " + t.getNombre());
            System.out.println("   Tiempo de duración: " + t.getTiempoDeDuracionEnMinutos() + " minutos");
            System.out.println("   Incluye:");
            if (t instanceof Serie) {
                Serie serie = (Serie) t;
                System.out.println("      " + serie.getTemporadas() + " Temporadas: ");
                System.out.println("      " + serie.getEpisodiosPorTemporada() + " Episodios por temporada: ");
                System.out.println("      " + serie.getDuracionEnMinutosPorEpisodio() + " Duración en minutos por episodio: ");
            }
            System.out.println("");
            numeroTitulo++;
        }
    
        System.out.println("¡Tu maratón está lista!");
        System.out.printf("Total de minutos necesarios: %.2f minutos\n", totalMinutos);
    }
    

}
*/



/*package com.alura;

import java.util.ArrayList;
import java.util.List;
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
                        3) Calculadora de tiempo para una maratón de películas
                        4) Salir
                        """;
                System.out.print(menu);
                System.out.print("Elija una opción: ");
                opcion = teclado.nextInt();
                teclado.nextLine(); // Limpiar el buffer

                switch (opcion) {
                    case 1:
                        System.out.println("\n*** Registro de Nueva Película ***");
                        registrarContenido(new Pelicula());
                        break;
                    case 2:
                        System.out.println("\n*** Registro de Nueva Serie ***");
                        registrarContenido(new Serie());
                        break;
                    case 3:
                    System.out.println("\n*** Calcula el tiempo de una Maratón ***");
                        calcularMaraton();
                        break;
                    case 4:
                        System.out.println("Saliendo del programa");
                        break;
                    default:
                        System.out.println("Por favor, ingrese una opción válida.");
                }
            } while (opcion != 4);
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
                System.out.print("Ingrese la evaluación de 1 a 5: ");
                evaluacion = Double.parseDouble(teclado.nextLine());
                if (evaluacion >= 1 && evaluacion <= 5) {
                    break;
                } else {
                    System.out.println("Por favor, ingrese una evaluación válida entre 1 y 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese una evaluación válida.");
            }
        }

        boolean incluidoEnElPlanBasico;
        while (true) {
            System.out.print("¿Incluido en el plan básico? (Si/No): ");
            String incluido = teclado.nextLine();
            if (incluido.equalsIgnoreCase("Si")) {
                incluidoEnElPlanBasico = true;
                break;
            } else if (incluido.equalsIgnoreCase("No")) {
                incluidoEnElPlanBasico = false;
                break;
            } else {
                System.out.println("Por favor, ingrese 'Si' o 'No'.");
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

    private void calcularMaraton() {
        List<Titulo> maraton = new ArrayList<>();
        double totalMinutos = 0;
        int numeroPelicula = 1;

        System.out.println("Ingresa 'listo' cuando hayas agregado todas tus películas y series.");

        while (true) {
            System.out.print("Ingrese el nombre del título (o 'listo' para terminar): ");
            String nombre = teclado.nextLine();

            if (nombre.equalsIgnoreCase("listo")) {
                break;
            }
            
            System.out.print("Ingrese la duración en minutos: ");
            int duracion = teclado.nextInt();
            teclado.nextLine(); // Limpiar el buffer

            totalMinutos += duracion;

            // Agregar la película a la lista de maratón
            Titulo pelicula = new Pelicula();
            pelicula.setNombre(nombre);
            pelicula.setTiempoDeDuracionEnMinutos(duracion);
            maraton.add(pelicula);

        }

        System.out.println("\n**** FICHA TÉCNICA DE LA MARATÓN ****\n");
        for (Titulo titulo : maraton) {
            System.out.println(numeroPelicula + ". Nombre del título: " + titulo.getNombre());
            numeroPelicula++;
            System.out.println("Tiempo de duración: " + titulo.getTiempoDeDuracionEnMinutos() + " minutos");
            System.out.println("");
        }
        System.out.println("¡Tu maratón está lista!");
        System.out.printf("Total de minutos necesarios: %.2f minutos\n", totalMinutos);

    }

}
*/







/*package com.alura;

import java.util.ArrayList;
import java.util.List;
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
                        3) Calculadora de tiempo para una maratón de películas
                        4) Salir
                        """;
                System.out.print(menu);
                System.out.print("Elija una opción: ");
                opcion = teclado.nextInt();
                teclado.nextLine(); // Limpiar el buffer

                switch (opcion) {
                    case 1:
                        System.out.println("\n*** Registro de Nueva Película ***");
                        registrarContenido(new Pelicula());
                        break;
                    case 2:
                        System.out.println("\n*** Registro de Nueva Serie ***");
                        registrarContenido(new Serie());
                        break;
                    case 3:
                        calcularMaraton();
                        break;
                    case 4:
                        System.out.println("Saliendo del programa");
                        break;
                    default:
                        System.out.println("Por favor, ingrese una opción válida.");
                }
            } while (opcion != 4);
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
                System.out.print("Ingrese la evaluación de 1 a 5: ");
                evaluacion = Double.parseDouble(teclado.nextLine());
                if (evaluacion >= 1 && evaluacion <= 5) {
                    break;
                } else {
                    System.out.println("Por favor, ingrese una evaluación válida entre 1 y 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese una evaluación válida.");
            }
        }

        boolean incluidoEnElPlanBasico;
        while (true) {
            System.out.print("¿Incluido en el plan básico? (Si/No): ");
            String incluido = teclado.nextLine();
            if (incluido.equalsIgnoreCase("Si")) {
                incluidoEnElPlanBasico = true;
                break;
            } else if (incluido.equalsIgnoreCase("No")) {
                incluidoEnElPlanBasico = false;
                break;
            } else {
                System.out.println("Por favor, ingrese 'Si' o 'No'.");
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

    private void calcularMaraton() {
        List<Titulo> maraton = new ArrayList<>();
        double totalMinutos = 0;

        System.out.println("Vamos a calcular el tiempo necesario para tu maratón de películas:");
        System.out.println("Ingresa 'listo' cuando hayas agregado todas tus películas y series.");

        while (true) {
            System.out.print("Ingrese el nombre del título (o 'listo' para terminar): ");
            String nombreTitulo = teclado.nextLine();

            if (nombreTitulo.equalsIgnoreCase("listo")) {
                break;
            }
            
            System.out.print("Ingrese la duración en minutos: ");
            int duracion = teclado.nextInt();
            teclado.nextLine(); // Limpiar el buffer

            totalMinutos += duracion;
        }

        System.out.println("¡Tu maratón está lista!");
        System.out.printf("Total de minutos necesarios: %.2f\n", totalMinutos);
    }
}*/