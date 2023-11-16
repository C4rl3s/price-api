# PriceApi

## Empezando

El propósito de este documento es guiar paso a paso en el arranque de la API del ejercicio de PRICES, exponiendo los end-points necesarios para que el Front pueda realizar las llamadas HTTP pertinentes y nutrirse de datos.

Comencemos!

### Obtener e instalar el JDK de Java.

Descarga el JDK de Java desde https://jdk.java.net/. Escoje el que mejor encaje segun tu máquina, y asegúrate de que es la versión 11 o superior. Cuando finalice la descarga, extraelo en un directorio localizable. 

Para ejecutar los comandos de java desde cualquier ubicación del sistema de ficheros, es necesario configurar variables de entorno: crear una variable de usuario ***JAVA_HOME*** que contenga la ruta del directorio de nuestra JDK y añadirla a la variable de usuario ***PATH***. Esta configuración puede variar dependiendo del sistema operativo.

### Obtener e instalar Apache Maven

Descarga la Apache Maven tool desde https://maven.apache.org/download.cgi. Escoge la versión que necesite tu sistema. Cuando finalice la descarga, extraelo en un directorio localizable. 

Debemos proceder igual que con la JDK: crear una variable de usuario ***M2_HOME*** (que contenga la ruta de Maven) y añadirla a la del ***PATH***.

### Descargar el proyecto

Descarga el código haciendo click en ***Code*** >> ***Download ZIP***

Descomprime el fichero en el directorio que prefieras, por ejemplo: C:\Dev\price-api\``

### Arrancar el proyecto

Primero necesitamos descargar todas las dependencias que tiene nuestro proyecto para funcionar, y compilar el código. Las dependencias las maneja Maven, están definidas en el fichero ***pom.xml*** (Project Object Model). Desde el terminal, nos situamos en el directorio del proyecto y escribimos:
```shell
mvn clean install
```

Este comando descargará e instalará todas las dependencias, ademas de compilar el código del proyecto para poder ejecutarlo. También ejecutará todos los test JUnit que encuentre (a no ser que añadamos ***-DskipTests*** al comando). Si todo ha ido bien, para arrancar el proyecto escribimos el comando:
```shell
mvn spring-boot-run
```
Por defecto los end-points están expuestos en el puerto 8080. Si queremos probar la api, se ha incluido y configurado la herramienta Swagger, que nos proporciona una interfaz Front "auxiliar" con los end-points y toda su documentación. Para acceder, abrir un navegador y entrar en la URL: http://localhost:8080/swagger-ui/

### Ejecutar los tests

Se han implementado los test de integración que se especificaban en el enunciado.

A pesar de que se ejecutan por defecto al lanzar el comando ***mvn clean install***, podemos ejecutarlos aparte mediante el siguiente comando:
```shell
mvn clean test
```
