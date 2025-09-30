Sistema de Examenes Academicos

Este proyecto implementa un modelo de dominio para gestionar alumnos, profesores, asignaturas y evaluaciones academicas (controles escritos, practicas, examenes).
Se aplican los principios de Domain-Driven Design (DDD) y Arquitectura Hexagonal (Ports & Adapters), asegurando un modelo expresivo, consistente y desacoplado de la infraestructura tecnica.

Estructura del Proyecto
src/main/java/co/edu/udec/examenesacademicos
│
├── application
│   ├── ports
│   │   ├── in              
│   │   └── out             
│   └── services            
│
├── domain
│   ├── events              
│   ├── exceptions          
│   ├── factories           
│   ├── model               
│   ├── services           
│   ├── specifications      
│   └── valueobjects        
│
└── infrastructure
├── adapters            
└── mappers             

Patrones aplicados y justificacion
1. Value Objects 

Ejemplos: NumeroMatricula, Nota, DNI, Fecha, NivelDificultad.

Representan conceptos sin identidad propia (ej: una matrícula o una nota).

Son inmutables y encapsulan invariantes de negocio (ej: Nota siempre entre 0 y 10).

Evitan el uso de tipos primitivos “crudos” (String, double), mejorando la expresividad del dominio.

2. Entidades

Ejemplos: Alumno, Profesor, Asignatura, Tema.

Tienen identidad persistente (ej: un alumno se identifica por su número de matrícula).

Mantienen la trazabilidad de su ciclo de vida incluso si cambian sus atributos.

3. Agregados y Agregado Raiz

Ejemplo: RegistroAcademico como agregado raiz de un alumno.

Garantiza la consistencia interna de las evaluaciones y notas.

Define un limite transaccional claro, asegurando que no se registren notas duplicadas para la misma evaluacion.

4. Herencia y Polimorfismo

Ejemplo:

Evaluacion (abstracta)

ExamenEscrito y ExamenPractico (implementaciones concretas).

Justificación:

Factoriza comportamiento comun (id, fecha, asignatura, temas).

Permite usar polimorfismo: cualquier examen se puede tratar como Evaluacion.

5. Servicios de Dominio

Ejemplo: CalculoPromedioService.

Encapsulan reglas que no pertenecen a una sola entidad (ej: calcular promedio de notas de un grupo).

Mantienen el principio de alta cohesion y permiten reutilizacion de logica de negocio.

6. Arquitectura Hexagonal (Ports & Adapters)

application/ports/in: Define los casos de uso que ofrece la aplicacion (ej: RegistrarNotaUseCase).

application/ports/out: Define lo que la aplicacion necesita de la infraestructura (ej: AlumnoRepository).

infrastructure/adapters: Implementaciones concretas (ej: repositorios con JPA o persistencia en memoria).

Esta separación permite probar el dominio y la aplicación sin depender de frameworks ni base de datos.

Beneficios de esta arquitectura

Separación de responsabilidades: dominio, aplicacion e infraestructura.

Modelo expresivo y consistente, alineado con el negocio academico.

Alta mantenibilidad: cambios en infraestructura (ej: DB) no afectan al dominio.

Facilidad de pruebas unitarias: se puede testear el dominio sin dependencias externas.

Escalabilidad: agregar nuevos tipos de evaluaciones o reglas es sencillo.

Autores: Gabriela Orozco - Navid Lobato