Proyecto: Veterinaria - Herencia y Polimorfismo en Java


Estructura de clases
Mascota (abstracta): define comportamiento común como hacerSonido() (abstracto) y descansar().
Perro, Gato, Conejo, Tortuga: extienden Mascota e implementan hacerSonido().
Conejo: además implementa las interfaces AtencionEspecial y Vacunable.
AtencionEspecial y Vacunable: interfaces para comportamientos adicionales.

Objetivos demostrados
 Uso de instanceof para aplicar acciones condicionales.
Aplicación del principio de sustitución con listas de tipo base (Mascota).
Separación de responsabilidades y flexibilidad gracias a las interfaces.

¿Por qué usar interfaces?
Interfaces permiten agregar comportamientos (como atención o vacunación) sin modificar la jerarquía de clases. Esto evita una herencia innecesariamente profunda y promueve la composición sobre herencia.
