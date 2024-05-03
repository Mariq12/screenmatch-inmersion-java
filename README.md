# <p align="center">Desafío screenmatch de la inmersión java</p>

## AULA 2

El código Java proporciona un programa El código implementa un programa de gestión de contenido audiovisual donde los usuarios pueden registrar películas y series, calcular la duración total de una maratón de películas y series, y visualizar información detallada de los títulos registrados. Utiliza la entrada del usuario para recopilar datos sobre los títulos y maneja las operaciones de forma modular y segura.

---
## Técnicas empleadas
- Polimorfismo.
- Manejo de excepciones para garantizar un funcionamiento adecuado.

---

## Desafío
- Conseguir que los usuarios puedan agregar series a través del teclado;
- Crear una calculadora de tiempo que te indique cuantos minutos necesitarás para hacer una maratón de tus películas favoritas el fin de semana y agregar una opción en el menú que me permita acceder a dicha función.
    
---

## Descripción del código de la clase Principal
¡Por supuesto! Aquí tienes una explicación del código, junto con la identificación de algunas partes clave:

1. **Paquetes e importaciones:**
   - Se importan clases y paquetes necesarios para el funcionamiento del programa, como `Scanner`, `ArrayList`, `Pelicula`, `Serie`, y `Titulo`.

2. **Clase Principal:**
   - Esta clase controla la lógica principal del programa.
   - Contiene un objeto `Scanner` llamado `teclado` para recibir la entrada del usuario.

3. **Método muestraElMenu():**
   - Presenta un menú al usuario y maneja la lógica de selección de opciones.
   - Utiliza un bucle `do-while` para permitir al usuario seleccionar opciones hasta que elija salir.
   - Utiliza un bloque `try-finally` para garantizar que el objeto `Scanner` se cierre correctamente al salir.

          public void muestraElMenu() {
              try {
                  // Código dentro del bloque try
                  int opcion;
                  do {
                      // ...
                  } while (opcion != 4);
              } finally {
                  // Código dentro del bloque finally
                  teclado.close();
              }
          }

4. **Método registrarContenido(Titulo contenido):**
   - Registra una nueva película o serie ingresada por el usuario.
   - Solicita al usuario ingresar detalles como nombre, año de lanzamiento, evaluación, etc.
   - Utiliza la herencia y el polimorfismo para manejar tanto películas como series dentro del mismo método.

          private void registrarContenido(Titulo contenido) {
              // Código del método
          }

5. **Método calcularMaraton():**
   - Permite al usuario calcular el tiempo total de una maratón de películas y/o series.
   - Utiliza un bucle `while` para permitir al usuario agregar títulos a la maratón hasta que decida terminar.
   - Calcula el tiempo total de películas y series agregadas a la maratón.
   - Muestra la ficha técnica de la maratón y el tiempo total.

          private void calcularMaraton() {
            // Código del método
          }
6. **Formtao de texto**
El código utiliza el formato de texto en bloque (`"""`) para crear menús y mensajes multilínea, lo que mejora la legibilidad del código y la presentación de la interfaz de usuario.

7. **Polimorfismo**
Se emplea eficazmente al utilizar el tipo base `Titulo` para manejar tanto películas como series dentro del mismo método `registrarContenido()`, lo que permite un código más limpio y modular.

8. **Manejo de excepciones**
El código sigue prácticas de programación defensiva al validar las entradas del usuario y manejar excepciones como `NumberFormatException` para garantizar una ejecución sin problemas.

---

## Resultado

### Prueba 1
Se registra las peliculas

<p align="center">
  <img src="https://live.staticflickr.com/65535/53695037017_12232e9231.jpg" alt="Paso 1"/>
</p>

### Prueba 2
Se registra las series

<p align="center">
  <img src="https://live.staticflickr.com/65535/53696276399_95e94769fc.jpg" alt="Paso 2"/>
</p>

### Prueba 3
Se calcula el maraton de peliculas y series.

Dar clic en reproducir

<p align="center">
  <img src="https://github.com/Mariq12/screenmatch-inmersion-java/assets/101030215/fd632d48-ba52-4443-aaef-007b58360e71" alt="vid-a2-1">
</p>

[Ver video en YouTube](https://www.youtube.com/watch?v=NjJEssxTMow)

### EJEMPLO COMPLETO

<p align="center">
  <img src="https://github.com/Mariq12/screenmatch-inmersion-java/assets/101030215/b66bc36b-ef9a-4d81-aea9-6d413e7d06d7" alt="vid-a2-2">
</p>

[Ver video en YouTube](https://youtu.be/KROXtK0zE5c)

## Tecnologías utilizadas durante el curso
* Java

## Tecnologías utilizadas durante el curso
* VsCode
* Maven
* Git
* GitHub
---

<h2 align="center">
Instrucciones de prueba
</h2>
Para probar el proyecto se lo puede clonar o crear un proyecto directo en GitHub y copiar el código.

A continuación, se realiza una breve descripción de los pasos a realizar para probar el proyecto.

---

## Configuración

### JDK JAVA 
**Pasos:**

1. Descargar en el siguiente link la versión jdk-17:

        https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html

2. Instalar JDK

3. Configurar 

    **Pasos:**

    3.1. Ingresar a Editar variables de entorno del sistema desde el buscador de Windows.

<p align="center">
  <img src="https://live.staticflickr.com/65535/53690397931_335ee366a8.jpg" alt="Paso 1"/>
</p>

    3.2. Dar clic en Variables de entorno.

<p align="center">
  <img src="https://live.staticflickr.com/65535/53690611433_df0ed822d6.jpg" alt="Paso 2"/>
</p>

    3.3. Ir a la ruta del JDK 
        - Copiar la ruta del JDK.
            `C:\Program Files\Java\jdk-17`
        - Dar clic en `Editar la variable del sistema`.
        - Agregar el nombre de la variable `JAVA_HOME`
        - Pegar la ruta del JDK.
        - Clic en Aceptar

<p align="center">
  <img src="https://live.staticflickr.com/65535/53689516437_0d5b5c50fb.jpg" alt="Paso 3"/>
</p>
    
    3.4. Ingresar en en el `Path` de **variables del sistema** dando doble clic
        - Dar clic en nuevo.
        - Copiar la ruta del JDK
            `C:\Program Files\Java\jdk-17\bin`
        - Pegar la ruta del JDK.
        - Clic en Aceptar

<p align="center">
  <img src="https://live.staticflickr.com/65535/53690748379_622c125c14.jpg" alt="Paso 4"/>
</p>

---

### Maven

**Pasos:**

1. Descargar en el siguiente link la versión apache-maven-3.9.6-bin.zip:

        https://maven.apache.org/download.cgi

2.  Descomprimir y copiar la carpeta en disco C
        
3.  Ingresar en el `Path` de **variables del sistema** dando doble clic
    **Pasos:**
    - Dar clic en nuevo.
    - Copiar la ruta del JDK
        `C:\Program Files\Java\jdk-17\bin`
    - Pegar la ruta del JDK.
    - Clic en Aceptar

---

### VsCode

   **Pasos:**

1. Descargar VsCode en el siguiente link de acuerdo al sistema operativo:

        https://code.visualstudio.com/

2. Instalar VsCode
Una vez descargado lo ejecutamos y dar clic en `Siguiente`.
3. Instalar desde VsCode la extensión:

       Extension Pack for Java

<p align="center">
  <img src="https://live.staticflickr.com/65535/53692023848_2db0cf163e.jpg" alt="Paso 7"/>
</p>

---

        IntelliCode

<p align="center">
  <img src="https://live.staticflickr.com/65535/53692023858_90b54879ca.jpg" alt="Paso 8"/>
</p>

4. Crear un proyecto Java con Maven
**Pasos:**

        4.1. Crear un proyecto Java con Maven.
        4.2. Ingresar a VsCode y dar clic en:
                Explorador de archivos 
        4.3. Dar clic en:
                Create Java Proyect

<p align="center">
  <img src="https://live.staticflickr.com/65535/53692446720_b2ac1cd9ec.jpg" alt="Paso 9"/>
</p>

        4.4. Dar clic en Maven create from archetype:

<p align="center">
  <img src="https://live.staticflickr.com/65535/53692356664_003d5f1df6.jpg" alt="Paso 10"/>
</p>

        4.5. Dar clic en No Archetype...:

<p align="center">
  <img src="https://live.staticflickr.com/65535/53692005331_db675b8d95.jpg" alt="Paso 11"/>
</p>

        4.6. Agregar un grupo:

<p align="center">
  <img src="https://live.staticflickr.com/65535/53692218178_02b583fdd0.jpg" alt="Paso 12"/>
</p>
En este caso el grupo es 
        
        com.alura

<p align="center">
  <img src="https://live.staticflickr.com/65535/53691123792_2da2a0fe5b.jpg" alt="Paso 13"/>
</p>

        4.7. Agregar el nombre del proyecto:

<p align="center">
  <img src="https://live.staticflickr.com/65535/53692005271_0866f79579.jpg" alt="Paso 14"/>
</p>

El nombre puede ser descriptivo como por ejemplo: 

        screenmatch-inmersion-java

<p align="center">
  <img src="https://live.staticflickr.com/65535/53691123757_1451b4b2b1.jpg" alt="Paso 15"/>
</p>

Pero en este caso el nombre del proyecto es:

        screenmatch-inmersion-java-v2

        4.8. Dar enter para crear el proyecto
        4.9. Guardar el proyecto
En este caso cree un archivo en Disco D con el nombre:
        PROYECTO-INMERSION-JAVA
        4.10. Seleccionar la carpeta PROYECTO-INMERSION-JAVA

<p align="center">
  <img src="https://live.staticflickr.com/65535/53692446690_e0d30c55c7.jpg" alt="Paso 16"/>
</p>

### Opción 2 (Alternativa):
**Para crear un proyecto Java con Maven:**

        - Ingresar a VsCode y dar clic en:
                Explorador de archivos 

        - Dar clic en:
                MAVEN

        -Dar clic en:
                + (New Project)

<p align="center">
<p align="center">
  <img src="https://live.staticflickr.com/65535/53692516710_b36b8562b5.jpg" alt="Paso 21"/>
</p>
        
        4.9. Dar clic en No Archetype...:

Ver el paso 4.5 para continuuar.

5. Abrir la carpeta creada

        5.1. Dar clic en:
        Abrir carpeta

<p align="center">
  <img src="https://live.staticflickr.com/65535/53692218118_7810ab02db.jpg" alt="Paso 17"/>
</p>

        5.2. Seleccionar la carpeta creada
        screenmatch-inmersion-java
        5.3. Dar clic en:
        Seleccionar carpeta

<p align="center">
  <img src="https://live.staticflickr.com/65535/53692446665_7d9978d2bf.jpg" alt="Paso 18"/>
</p>

        5.4. Dar clic en:
        Sí, confío en los autores

<p align="center">
  <img src="https://live.staticflickr.com/65535/53692218123_1031bcfa68.jpg" alt="Paso 19"/>
</p>

        5.5. Proyecto con Java y Maven listo para ser usado

<p align="center">
  <img src="https://live.staticflickr.com/65535/53692005231_dd5205a140.jpg" alt="Paso 20"/>
</p>

---

### Git

**Pasos:**

1. Descarga el instalador de GIT, en este caso para Windows.
        
        https://git-scm.com/downloads

2. Descargado el instalador, hacer doble clic sobre el ejecutable para que comience el proceso de instalación.
3. Seguir las instrucciones que aparecerán en pantalla. Al igual que cualquier otro programa, aparecerá “Next” (siguiente) en varias ocasiones hasta que aparezca la opción “Finish” (terminar) para completar la instalación.
4. Abrir el símbolo del sistema y escribir los siguientes comandos en la terminal, se debe cambiar `Tu Nombre` y `ejemplo@email.com` por nuestra información:
    
        git config --global user.name "Tu nombre"

        git config --global user.email "ejemplo@email.com"
---
### GitHub

**Crear proyecto en GitHub**

Para crear un proyecto en GitHub se realizan los siguientes pasos:

1. **Crear un repositorio en GitHub**: Iniciar sesión en GitHub, haz clic en "New", completa los detalles y crea un repositorio.

2. **Configurar Git**: Ver paso anterior Git.

3. **Inicializar un repositorio local**: Abrir la terminal, navega hasta tu proyecto y ejecuta `git init`.

4. **Agregar archivos**: Usar `git add .` para agregar todos los archivos o `git add <nombre_del_archivo>` para archivos específicos.

5. **Confirmar cambios**: Hacer un commit con `git commit -m "Mensaje descriptivo"`.

6. **Conectar repositorio remoto**: Copia la URL del repositorio en GitHub y ejecuta `git remote add origin <URL_del_repositorio>`.

7. **Subir cambios**: Usa `git push -u origin master` para subir los cambios al repositorio remoto en GitHub.

El proyecto proyecto en GitHub.

---

**Clonar el proyecto de GitHub**

Para clonar este proyecto en GitHub y poderlo probar se realizan los siguientes pasos:

1. **Obtener la URL del repositorio:** En repositorio en GitHub:

        Hacer clic en el botón verde "Code". 
        Copia la URL que se muestra.

<p align="center"><img src="https://live.staticflickr.com/65535/53692583549_d3482bcae5.jpg" alt="Paso 22"/>
</p>

2. **Abrir la terminal o línea de comandos:** desde la computadora.
3. **Navegar a la ubicación deseada:** Utilizar el comando cd para navegar a la ubicación en la computadora donde se desea clonar el repositorio.
4. **Clonar el repositorio:** Utilizar el comando 

        git clone 
        
5. Agregar la URL que copiada anteriormente seguido de `git clone`. Por ejemplo:

        git clone URL_DEL_REPOSITORIO

6. **Se da enter al comando**

        git clone https://github.com/Mariq12/screenmatch-inmersion-java-v2.git

7. **Esperar a que se complete la clonación:** Git descargará todos los archivos del repositorio a tu computadora.
8. **Ejecutar el proyecto:** en la computadora.

---

## Referencias
        Alura Latam (s.f.) Desarrollo de aplicaciones en Java con VsCode.https://www.aluracursos.com/blog/desarrollando-aplicaciones-java-code
        Data Code (16 de mayo de 2022) Java - Configurar Visual Studio Code y Maven. https://www.youtube.com/watch?v=3mWGDArNYss&t=2s
