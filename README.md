# <p align="center">Desafío screenmatch de la inmersión java</p>

## AULA 2

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

### VsCode

   **Pasos:**

1. Descargar VsCode en el siguiente link de acuerdo al sistema operativo:

        https://code.visualstudio.com/

2. Instalar VsCode 

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

### Git

**Pasos:**

1. Descarga el instalador de GIT, en este caso para Windows.
        
        https://git-scm.com/downloads

2. Descargado el instalador, hacer doble clic sobre el ejecutable para que comience el proceso de instalación.
3. Seguir las instrucciones que aparecerán en pantalla. Al igual que cualquier otro programa, aparecerá “Next” (siguiente) en varias ocasiones hasta que aparezca la opción “Finish” (terminar) para completar la instalación.
4. Abrir el símbolo del sistema y escribir los siguientes comandos en la terminal, se debe cambiar `Tu Nombre` y `ejemplo@email.com` por nuestra información:
    
        git config --global user.name "Tu nombre"

        git config --global user.email "ejemplo@email.com"

