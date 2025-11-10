## Requisitos
- [Java 17 ó superior](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Gradle 8.3 ó superior](https://gradle.org/install/)
- [Git](https://git-scm.com/downloads)

Para trabajar sobre el proyecto, se debe clonar el repositorio mediante el siguiente comando y trabajar sobre la rama
git clone https://github.com/kane04642/AhorroDigital.git
***master***:
```console
```

## Forma de ejecutar el proyecto
    ## Limpiar reportes
        .\gradlew clean
    ## Ejecutar feature por nombre de feature
        .\gradlew test --tests com.bcs.simulador.runners.LoginRunner
    ## Generar reporte de serenity BDD
        .\gradlew aggregate  // se valida en la carpeta target/site/serenity/index.html
