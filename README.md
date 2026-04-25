# Taller práctico MVC + DAO + Service (Postgres/MySQL)

Este proyecto implementa un sistema académico utilizando el patrón **MVC (Modelo–Vista–Controlador)** junto con **DAO (Data Access Object)** y **Service**.  
El objetivo es aplicar buenas prácticas de arquitectura en Java y conectar la aplicación con una base de datos relacional (Postgres o MySQL).

## Tecnologías utilizadas
-  **Java 21 (LTS)** 
- **Maven** para la gestión de dependencias  
- **PostgreSQL / MySQL** como motor de base de datos  
- **JDBC** para la conexión con la base de datos  
- **Visual Studio Code** como entorno de desarrollo  
- **Git/GitHub** para control de versiones y trabajo colaborativo  

## Estructura del proyecto
El proyecto sigue una organización por paquetes:

- `modelo/` → Clases que representan las entidades (Materia, Docente, Estudiante, Grupo, InscripcionCurso).  
- `dao/` → Clases DAO que realizan operaciones CRUD sobre la base de datos.  
- `servicios/` → Lógica de negocio y coordinación entre DAO y Controladores.  
- `controlador/` → Controladores que gestionan la interacción entre la vista y los servicios.  
- `vista/` → Interfaces de usuario (consola o gráficas).  
- `config/` → Clase **ConexionPostgresDatabase.java** que gestiona la conexión a la base de datos leyendo parámetros desde un archivo `config.properties`.

## Conexión a la base de datos
La configuración de la conexión se encuentra en la carpeta `config/`, dentro de la clase `ConexionPostgresDatabase.java`.  
Allí se define la URL, usuario y contraseña de Postgres/MySQL.

## Entidades del sistema
Materia: id_materia, nombre_materia, creditos

Docente: id_docente, nombre, especialidad

Estudiante: id_estudiante, nombre, apellido, email

Grupo: id_grupo, id_materia, id_docente, aula, horario

Inscripcion_Curso: id_inscripcion, id_estudiante, id_grupo, nota_final, estado


## Integrantes:

MICHELLE DAYANNA DUQUE MARIN

ANA YISETH SOLARTE RUIZ 

GISELA ANDRADE MURILLO

GRUPO: 411