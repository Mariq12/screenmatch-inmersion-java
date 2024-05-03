# <p align="center">Desafío screenmatch de la inmersión java</p>

*Este proyecto esta conformado por 2 partes y 2 Branches*
- **AULA 1: master branch.**
- **AULA 2: aula-2 branch.**

## AULA 1
El código Java proporciona un programa interactivo que muestra información sobre una película, como su título, fecha de lanzamiento, evaluación y sinopsis. Luego, solicita al usuario que ingrese tres calificaciones para la película y calcula la media de estas calificaciones. Finalmente, muestra la media calculada al usuario. 
Además, verifica una condición usando `if` y `else`.

---

## Desafío
    - Calcular la evaluación media de una película con datos obtenidos por los usuarios usando el ciclo while;
    - Subir sus proyectos a GitHub y compartirlos;
    - Crear un README para su repositorio que hable sobre las especificaciones del proyecto y que muestre un gif o video del funcionamiento del programa.
    
---

## Uso de condicionales IF Y ELSE
El programa verifica una condición:

`if`Si la pelicula es creada mayor o igual a 2003 nos muestra el mensaje que: 

        Película Popular en el momento

`else` Caso contrario muestra el mesaje:

        Película Retro que vale la pena ver

---

## Uso del ciclo While

El bucle `while` se usa para solicitar al usuario las calificaciones de una película. Mientras el contador de evaluaciones sea menor que la cantidad total de evaluaciones esperadas, el programa sigue solicitando y sumando las calificaciones ingresadas por el usuario. Una vez que se han ingresado todas las calificaciones, el bucle termina y se calcula la media de las calificaciones ingresadas.

---

## Resultado

<p align="center">
  <img src="https://live.staticflickr.com/65535/53691786675_4c725cfa23.jpg" alt="Paso 5"/>
</p>

## Tecnologías utilizadas durante el curso
* Java

## Tecnologías utilizadas durante el curso
* VsCode
* Maven
* Git

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

