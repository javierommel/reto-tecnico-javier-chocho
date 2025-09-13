# Devsu Reto Técnico Javier Chocho

Aplicación diseñada para gestionar clientes, cuentas y movimientos, desarrollada como parte de un challenge técnico. Esta solución aplica las mejores prácticas en arquitectura, desarrollo, pruebas y despliegue.

## Tecnologías Utilizadas

### Backend
- Java 17
- Spring Boot 3.4
- Spring Data JPA
- PostgreSQL
- JUnit 5 + Mockito

### DevOps
- Docker
- Docker Compose

---

## Estructura del Proyecto

### Backend

```
ms-clientes-personas/src/main/java/com/javierchocho/ms_clientes_personas
  /config
  /controller
  /dto
  /entity
  /exception
  /mapper
  /repository
  /service

ms-cuentas-movimientos/src/main/java/com/javierchocho/ms_cuentas_movimientos
  /config
  /controller
  /dto
  /entity
  /exception
  /mapper
  /repository
  /service

```
# Instalación

### Requisitos

- Docker + Docker Compose

### Variables de Entorno

Ver `.env.example` para los valores requeridos en backend.

---

## Instrucciones para Despliegue 
**Consideraciones Despliegue

```bash
# 1. Clona el repositorio
git clone https://github.com/javierommel/reto-tecnico-javier-chocho.git
cd reto-tecnico-javier-chocho

# 2. Configura tus variables de entorno en el archivo .env con los valores de tus configuraciones
cp env.example .env

# 3. Levanta los servicios
docker-compose up --build
```

## Instrucciones para Despliegue local
**Consideraciones Despliegue
```bash
# 1. Clona el repositorio
git clone https://github.com/javierommel/reto-tecnico-javier-chocho.git
cd reto-tecnico-javier-chocho

# 2. Compilar microservicio ms-clientes-personas
cd ms-clientes-personas
mvn clean package -DskipTests

# 3. Compilar microservicio ms-cuentas.movimientos
cd ms-cuentas-movimientos
mvn clean package

# 4. Configura tus variables de entorno en el archivo .env con los valores de tus configuraciones
cp env.example .env

# 5. Desplegar solución completa
docker compose -f docker-compose-build.yml up --build

```
## Consideraciones Test (Pruebas Unitarias y de Integración)

    Seguir los siguientes pasos para realizar las pruebas Unitarias y de Integración

```bash
    - cd ms-clientes-personas
    - mvn test
```
    (Se tiene una prueba para el repositorio y la prueba de Integración para una petición completa como prueba de Integración. )

## Consideraciones Pruebas Aplicación

    Se tiene un archivo prueba_tecnica.postman_collection.json que se debe abrir con Postman
    Dentro de Postman ejecutar en el siguiente orden para cumplir con los casos de uso.
    - create cliente 1
    - create cliente 2
    - create cliente 3
    - create cuenta 1
    - create cuenta 2
    - create cuenta 3
    - create cuenta 4
    - create cuenta 5
    - create movimiento 1
    - create movimiento 2
    - create movimiento 3
    - create movimiento 4
    - reportemovimientos

    Para realizar otras pruebas tomar en cuenta el campo clientId cuando se crea un cliente que es nuestro identificador para los clientes.

## Autor

Javier Chocho - Fullstack Developer

---

## Licencia

MIT


   



