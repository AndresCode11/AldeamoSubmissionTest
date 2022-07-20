# Prueba Técnica Aldeamo - Ingeniero de Desarrollo
En este repositorio se creó una simple aplicación web para exponer un servicio REST usando el framework de `SpringBoot` con `Java 11` usando un base de datos `MYSQL` de acuerdo al problema a resolver en la prueba técnica.

## Despliegue

### Producción
La Aplicación se encuentra desplegada en Heroku en la url: [https://aldeamopablotest.herokuapp.com](https://aldeamopablotest.herokuapp.com), 
* Hay una especificación OpenAPI, usando una interfaz de usuario de Swagger.

### Local
En caso de querer desplegar la aplicacion en un entorno local, este debe contar con `Java 11` y tener Maven, adicionalemte tener el puerto **8080** habilitado en caso de tener otro puerto se puede modificar **aplication.properties**, la base de datos esta desplegada en AWS en MYSQL **(usuario de prueba)**

```
spring.datasource.url=jdbc:mysql://database-1.c6gsc5cni4xv.us-west-2.rds.amazonaws.com:3306/aldeamo_test
spring.datasource.username=aldeamouser
spring.datasource.password=password
```
* 1: Clonar el repositorio
* 2: Acceder a el archivo clonado
* 3: Ejecutar el comando mvn `spring-boot:run`


## Consumo de la API [Documentacion de API](https://aldeamopablotest.herokuapp.com/swagger-ui/index.html#)

* Ejemplo usando Curl:
``` 
curl -X 'POST' \
  'https://aldeamopablotest.herokuapp.com/api/v1/input_array/sort' \
  -H 'accept: */*' \
  -H 'Content-Type: application/json' \
  -d '{
  "id": 6,
  "iterations": 10
}'
``` 

## Estructura del proyecto
El proyecto usa por defecto  la estructura de `SpringBoot` , en este caso se muestra la estructura de los archivos que se trabajaron, la funcion de sus carpetas.
``` 
📦src
 ┣ 📂main
 ┃ ┣ 📂java
 ┃ ┃ ┗ 📂com
 ┃ ┃ ┃ ┗ 📂example
 ┃ ┃ ┃ ┃ ┗ 📂demo
 ┃ ┃ ┃ ┃ ┃ ┣ 📂Controllers
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜InputArrayController.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂Helpers
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ArrayOperations.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂Models
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜InputArrayModel.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜InputArrayRequestSort.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂Services
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ArraysService.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂repositories
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ArraysRepository.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜DemoApplication.java
 ┃ ┗ 📂resources
 ┃ ┃ ┣ 📂static
 ┃ ┃ ┣ 📂templates
 ┃ ┃ ┗ 📜application.properties
```

* **Controllers/** : Recibe los eventos de entrada mediante HTTP, Contiene reglas de gestión de eventos.
* **Helpers/** : Clases o Interfaces reutilizables para el proyecto.
* **Models/** :
* **Repositories/**: Enlaza los modelos para realizar consultas.
