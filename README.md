# serenity-cucumber-gradle-screenplay
Un proyecto donde se ejemplifica el uso del patrón serenity 
[screenplay](http://thucydides.info/docs/serenity-staging/#_serenity_and_the_screenplay_pattern) con cucumber y gradle.

Las pruebas de este ejemplo se corren contra la página web de [Swaglabs](https://www.saucedemo.com/).

El proyecto cuenta con el manejo automatico de los webdrivers, por lo que no es necesario tener descargados dentro del
proyecto los diferentes navegadores.

## Detalles generales de la implementación

Los tests usan tareas (tasks), interacciones (interactions), preguntas (questions), elementos de páginas (user_interface)
definidas en `co.com.example.screenplay`.

La estructura completa del proyecto es la siguiente:

````
+ model
    Clases que usan el patrón object builder o relcionadas con el modelo de dominio
+ tasks
    Clases que representan tareas que realiza el actor a nivel de proceso de negocio
+ interacion
    Clases que representan las interacciones directas con la interfaz de usuario
+ user_interface
    Page Objects y Page Elements. Mapean los objetos de la interfaz de usuario
+ questions
    Objectos usados para consultar acerca del estado de la aplicación
    
````

## Requerimientos

Para correr el proyecto se necesita Java JDK 1.8 y Gradle preferiblemente versiones superiores a 7.0.

## Para correr el proyecto

clean test aggregate es el comando que correrá los tests y generará el reporte en la carpeta /target/site/serenity/
 
## Class ParameterType - stepDefinitions

Dentro del package stepdefinitions se encuentra la clase ParameterType, la cual nos permite seguir manejando los datos 
definidos en los features como modelos.