# Prueba Técnica Aldeamo - Ingeniero de Desarrollo
En este repositorio se creó una simple aplicación web para exponer un servicio REST usando el framework de `SpringBoot` con `Java 11` usando un base de datos `MYSQL` de acuerdo al problema a resolver en la prueba técnica.

## Despliegue

### Producción
La Aplicación se encuentra desplegada en Heroku en la url: [https://aldeamopablotest.herokuapp.com](https://aldeamopablotest.herokuapp.com), 
* Hay una especificación OpenAPI, usando una interfaz de usuario de Swagger.

### Local
En caso de querer desplegar la aplicacion en un entorno local, este debe contar con `Java 11` , la base de datos esta desplegada en AWS 
```xml
spring.datasource.url=jdbc:mysql://database-1.c6gsc5cni4xv.us-west-2.rds.amazonaws.com:3306/aldeamo_test
spring.datasource.username=aldeamouser
spring.datasource.password=password
```


## Consumo de la API

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

* **Controllers**: 
* **Helpers** : 
* **Models** :
* **Repositories**: 
