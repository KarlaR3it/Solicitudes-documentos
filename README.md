# API REST - Solicitudes y Documentos

## Descripción

API RESTful desarrollada con Spring Boot para la gestión de solicitudes y documentos en un portal de empleos. La aplicación permite realizar operaciones CRUD sobre solicitudes de empleo y sus documentos asociados, proporcionando endpoints para crear, consultar, actualizar y eliminar registros.

## Tecnologías

- **Java 17**
- **Spring Boot 3.5.6**
- **Spring Data JPA** - Persistencia de datos
- **MySQL** - Base de datos
- **Lombok** - Reducción de código boilerplate
- **ModelMapper** - Conversión entre entidades y DTOs
- **Maven** - Gestión de dependencias
- **Docker Compose** - Contenedorización de la base de datos

## Arquitectura

El proyecto sigue una arquitectura en capas típica de Spring Boot:
- **Controller**: Manejo de peticiones HTTP
- **Service**: Lógica de negocio
- **Repository**: Acceso a datos
- **Model**: Entidades JPA
- **DTO**: Objetos de transferencia de datos

## Instalación y Ejecución

### Prerrequisitos

- Java 17 o superior
- Maven 3.6+
- Docker y Docker Compose

### Pasos para ejecutar

1. **Clonar el repositorio**
   ```bash
   git clone <url-del-repositorio>
   cd solicitudes
   ```

2. **Iniciar la base de datos**
   ```bash
   docker-compose up -d
   ```

3. **Compilar y ejecutar la aplicación**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

La aplicación estará disponible en `http://localhost:8080`

### Base de datos

- **Puerto**: 3307
- **Base de datos**: portal_empleos
- **Usuario**: empleos_user
- **Contraseña**: segura456

## Endpoints principales

- **Solicitudes**: `/api/solicitudes`
- **Documentos**: `/api/documentos`

La aplicación genera automáticamente las tablas en la base de datos al iniciar.


