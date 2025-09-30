Sistema de Exámenes Académicos

Este proyecto implementa un modelo de dominio para gestionar alumnos, profesores, asignaturas y evaluaciones académicas (controles escritos, prácticas, exámenes).
Se aplican los principios de Domain-Driven Design (DDD) y Arquitectura Hexagonal (Ports & Adapters), asegurando un modelo expresivo, consistente y desacoplado de la infraestructura técnica.

Estructura del Proyecto

src/main/java/co/edu/udec/examenesacademicos
│
├── application
│   ├── ports
│   │   ├── in              # Interfaces de casos de uso (input)
│   │   └── out             # Interfaces hacia infraestructura (output)
│   └── services            # Implementación de casos de uso
│
├── domain
│   ├── events              # Eventos de dominio (ej: NotaRegistradaEvent)
│   ├── exceptions          # Excepciones de negocio (ej: NotaInvalidaException)
│   ├── factories           # Creación compleja de entidades/agregados (ej: EvaluacionFactory)
│   ├── model               # Entidades y Agregados (ej: Alumno, Evaluacion)
│   ├── services            # Servicios de dominio (ej: CalculoPromedioService)
│   ├── specifications      # Reglas de negocio reutilizables (ej: NotaAprobatoriaSpecification)
│   └── valueobjects        # Objetos de Valor inmutables (ej: Nota, Fecha, Matricula)
│
└── infrastructure
├── adapters            # Implementaciones de puertos de salida (repositorios, notificaciones)
└── mappers             # Conversión entre entidades de dominio y DTOs/persistencia

Patrones aplicados y justificación
1. Value Objects (Objetos de Valor)

Ejemplos: NumeroMatricula, Nota, DNI, Fecha, NivelDificultad.

Representan conceptos sin identidad propia (ej: una matrícula o una nota).

Son inmutables y encapsulan invariantes de negocio (ej: Nota siempre entre 0 y 10).

Evitan el uso de tipos primitivos “crudos” (String, double), mejorando la expresividad del dominio.

2. Entidades

Ejemplos: Alumno, Profesor, Asignatura, Tema.

Tienen identidad persistente (ej: un alumno se identifica por su número de matrícula).

Mantienen la trazabilidad de su ciclo de vida incluso si cambian sus atributos.

3. Agregados y Agregado Raíz

Ejemplo: RegistroAcademico como agregado raíz de un alumno.

Garantiza la consistencia interna de las evaluaciones y notas.

Define un límite transaccional claro, asegurando que no se registren notas duplicadas para la misma evaluación.

4. Herencia y Polimorfismo

Ejemplo:

Evaluacion (abstracta)

ExamenEscrito y ExamenPractico (implementaciones concretas).

Justificación:

Factoriza comportamiento común (id, fecha, asignatura, temas).

Permite usar polimorfismo: cualquier examen se puede tratar como Evaluacion.

5. Servicios de Dominio

Ejemplo: CalculoPromedioService.

Encapsulan reglas que no pertenecen a una sola entidad (ej: calcular promedio de notas de un grupo).

Mantienen el principio de alta cohesión y permiten reutilización de lógica de negocio.

6. Arquitectura Hexagonal (Ports & Adapters)

application/ports/in: Define los casos de uso que ofrece la aplicación (ej: RegistrarNotaUseCase).

application/ports/out: Define lo que la aplicación necesita de la infraestructura (ej: AlumnoRepository).

infrastructure/adapters: Implementaciones concretas (ej: repositorios con JPA o persistencia en memoria).

Esta separación permite probar el dominio y la aplicación sin depender de frameworks ni base de datos.

Estructura del paquete /domain

El paquete domain representa el núcleo del negocio académico, completamente aislado de frameworks e infraestructura.

- /domain/model

Entidades y Agregados.

Ejemplo: Alumno, Profesor, Asignatura, Tema, RegistroAcademico.

- /domain/valueobjects

Objetos de Valor inmutables.

Ejemplo: NumeroMatricula, Nota, DNI, Fecha, NivelDificultad.

- /domain/services

Servicios de dominio con lógica transversal.

Ejemplo: CalculoPromedioService.
- /domain/factories

Factorías para creación controlada de entidades/agregados.

Ejemplo: EvaluacionFactory

- /domain/specifications

Reglas de negocio expresadas como predicados.

Ejemplo: NotaAprobatoriaSpecification


- /domain/events

Eventos de dominio relevantes.

Ejemplo:

public record NotaRegistradaEvent(NumeroMatricula matricula, String evaluacionId, Nota nota) {}

- /domain/exceptions

Excepciones de negocio que refuerzan invariantes.

Ejemplo: NotaInvalidaException


Beneficios de esta arquitectura

-Separación de responsabilidades: dominio, aplicación e infraestructura.

-Modelo expresivo y consistente, alineado con el negocio académico.

-Alta mantenibilidad: cambios en infraestructura no afectan al dominio.

-Facilidad de pruebas unitarias: el dominio se prueba sin dependencias externas.

-Escalabilidad: agregar nuevos tipos de evaluaciones o reglas es sencillo.

Autores: Gabriela Orozco - Navid Lobato
