# PatronesFinal

# Patrones de Diseño y Principios SOLID en Java

Este repositorio contiene ejemplos sencillos en **Java** sobre algunos **patrones de diseño** y el **principio SOLID**, realizados con un enfoque académico y pensados para que sean fáciles de entender por estudiantes universitarios.

El objetivo principal de este proyecto es mostrar cómo se aplican estos conceptos en código real, usando ejemplos simples y con pocas clases, pero suficientes para comprender la idea general de cada patrón.

---

## Contenido del repositorio

El proyecto está dividido en tres partes principales:

- Patrón **Prototype**
- Patrón **Singleton**
- Ejemplo práctico del **principio SOLID**

Cada sección cuenta con varias clases para representar mejor el funcionamiento de cada concepto.

---

## 1. Patrón Prototype

El patrón **Prototype** permite crear nuevos objetos a partir de la clonación de objetos existentes, sin que el código dependa directamente de sus clases concretas.

En este ejemplo se simula la clonación de diferentes tipos de objetos como documentos e imágenes.

### Clases utilizadas

- `Prototype`: Interfaz que define el método `clonar()`.
- `Documento`: Implementa la interfaz `Prototype` y representa un documento.
- `Imagen`: Implementa la interfaz `Prototype` y representa una imagen.
- `GestorPrototipos`: Administra y almacena los prototipos disponibles.
- `MainPrototype`: Clase principal para ejecutar y probar el patrón.

### ¿Qué se demuestra?

- Se pueden copiar objetos sin usar `new` directamente.
- El código cliente no depende de la clase concreta del objeto.
- Se reduce el acoplamiento entre clases.

---

## 2. Patrón Singleton

El patrón **Singleton** asegura que una clase tenga **una sola instancia** durante toda la ejecución del programa y proporciona un punto de acceso global a dicha instancia.

En este ejemplo se simula una conexión a base de datos que es compartida por diferentes clases del sistema.

### Clases utilizadas

- `ConexionBD`: Clase Singleton que maneja la conexión.
- `Usuario`: Usa la conexión Singleton.
- `Administrador`: Accede a la misma instancia para verificar el sistema.
- `Servicio`: También utiliza la conexión compartida.
- `MainSingleton`: Clase principal para probar el patrón.

### ¿Qué se demuestra?

- El constructor es privado.
- Todas las clases utilizan la misma instancia.
- Se controla el acceso a un recurso compartido.

---

## 3. Principio SOLID

El principio **SOLID** es un conjunto de cinco principios que ayudan a crear software más limpio, mantenible y escalable.  
En este proyecto se aplican principalmente los principios:

- **S**: Responsabilidad Única  
- **O**: Abierto/Cerrado  
- **I**: Segregación de Interfaces  
- **D**: Inversión de Dependencias  

Se utiliza un ejemplo de un sistema de pagos.

### Clases utilizadas

- `MetodoPago`: Interfaz que define el comportamiento del pago.
- `PagoTarjeta`: Implementación del pago con tarjeta.
- `PagoEfectivo`: Implementación del pago en efectivo.
- `PagoTransferencia`: Implementación del pago por transferencia.
- `ProcesadorPago`: Procesa el pago usando una abstracción.
- `MainSOLID`: Clase principal para ejecutar el ejemplo.

### ¿Qué se demuestra?

- Cada clase tiene una responsabilidad clara.
- Se pueden agregar nuevos métodos de pago sin modificar el código existente.
- Las clases dependen de interfaces y no de implementaciones concretas.

---

## Tecnologías utilizadas

- Lenguaje: **Java**
- Paradigma: **Programación Orientada a Objetos**
- IDE recomendado: NetBeans

---


## Autor

Proyecto realizado como práctica académica para la materia Diseño E Implementacion De Software Con Patrones hecho por Zenón Regalado Vicente de Jesús

---
