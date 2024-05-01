# <p align="center">Desafío screenmatch de la inmersión java</p>

El código Java proporciona un programa interactivo que muestra información sobre una película, como su título, fecha de lanzamiento, evaluación y sinopsis. Luego, solicita al usuario que ingrese tres calificaciones para la película y calcula la media de estas calificaciones. Finalmente, muestra la media calculada al usuario. 

## Desafío
    - Calcular la evaluación media de una película con datos obtenidos por los usuarios usando el ciclo while;

## Uso de condicionales IF Y ELSE
El programa verifica una condición:

`if`Si la pelicula es creada mayor o igual a 2003 nos muestra el mensaje que: 

        Película Popular en el momento

`else` Caso contrario muestra el mesaje:

        Película Retro que vale la pena ver


## Tecnologías utilizadas durante el curso
* Java

## Tecnologías utilizadas durante el curso
* VsCode
* Maven
* Git

##  JDK JAVA 
**Pasos:**

1. Descargar en el siguiente link la versión jdk-17:

        https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html

2. Instalar JDK



3. Configurar 

    **Pasos:**

    3.1. Ingresar a Editar variables de entorno del sistema desde el buscador de Windows.

        ![Paso 1](https://live.staticflickr.com/65535/53690397931_335ee366a8.jpg)

    3.2. Dar clic en Variables de entorno.

        ![Paso 2](https://live.staticflickr.com/65535/53690611433_df0ed822d6.jpg)

    3.3. Ir a la ruta del JDK 
        - Copiar la ruta del JDK.
            `C:\Program Files\Java\jdk-17`
        - Dar clic en `Editar la variable del sistema`.
        - Agregar el nombre de la variable `JAVA_HOME`
        - Pegar la ruta del JDK.
        - Clic en Aceptar

        ![Paso 3](https://live.staticflickr.com/65535/53689516437_0d5b5c50fb.jpg)
    
    3.4. Ingresar en en el `Path` de **variables del sistema** dando doble clic
        - Dar clic en nuevo.
        - Copiar la ruta del JDK
            `C:\Program Files\Java\jdk-17\bin`
        - Pegar la ruta del JDK.
        - Clic en Aceptar

        ![Paso 4](https://live.staticflickr.com/65535/53690748379_622c125c14.jpg)

### VsCode

   **Pasos:**

1. Descargar VsCode en el siguiente link de acuerdo al sistema operativo:

        https://code.visualstudio.com/

2. Instalar VsCode 

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

### Git

**Pasos:**

1. Descarga el instalador de GIT, en este caso para Windows.
        
        https://git-scm.com/downloads

2. Descargado el instalador, hacer doble clic sobre el ejecutable para que comience el proceso de instalación.
3. Seguir las instrucciones que aparecerán en pantalla. Al igual que cualquier otro programa, aparecerá “Next” (siguiente) en varias ocasiones hasta que aparezca la opción “Finish” (terminar) para completar la instalación.
4. Abrir el símbolo del sistema y escribir los siguientes comandos en la terminal, se debe cambiar `Tu Nombre` y `ejemplo@email.com` por nuestra información:
    
        git config --global user.name "Tu nombre"

        git config --global user.email "ejemplo@email.com"

