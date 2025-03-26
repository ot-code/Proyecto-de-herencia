<h1 align="center">Proyecto de herencia</h1>💱

## Diagrama UML

<div align="center">
  <img src="https://github.com/user-attachments/assets/3929e070-e1cf-41f3-bdab-200b6159bd6b" alt="Conversor de divisas por defecto" width="700" height="600" />
</div>

---

Este proyecto es una aplicación **Java** que demuestra los conceptos fundamentales de la **Programación Orientada a Objetos (POO)**, especialmente la **herencia**. A través de distintas clases (cuentas bancarias), se ilustra cómo reutilizar código y aplicar comportamientos específicos en cada subclase. 

---

## Características

- Se centralizan métodos comunes en la clase base (`CuentaBase`), y cada subclase añade o modifica comportamientos.
- Tarjeta de débito, tarjeta de crédito y cuenta de ahorro comparten la estructura de una cuenta, pero cada una maneja operaciones distintas (retiro, intereses, etc.).
- Se demuestra el uso de métodos *getter*, validaciones y modificadores de acceso (`protected`, `public`) para mantener un diseño limpio.
- Cada clase se encarga de un rol específico, con métodos y constructores claros para simular operaciones bancarias.

---

## Clases y funcionalidad

### 1. `CuentaBase`

- **Propósito:** Clase padre que contiene el atributo `montoActual` y métodos comunes:
    - `depositar(double cantidad)`: Aumenta el saldo.
    - `getSaldo()`: Retorna el saldo.
- **Modificador `protected`:** Permite que las subclases accedan directamente al saldo.
- **Ventaja:** Evita la duplicación de código en las subclases.

---

### 2. `CuentaAhorro` *(extends `CuentaBase`)*

- **Método clave:** `invertir()`, que incrementa el saldo en un 10%.
- **Uso típico:** Simula la generación de intereses en una cuenta de ahorro.

---

### 3. `TarjetaDebito` *(extends `CuentaBase`)*

- **Método principal:** `retirar(double cantidad)` con validaciones:
    - Cantidad debe ser positiva.
    - Debe existir saldo suficiente.
- **Retorno booleano:** Indica si el retiro fue exitoso o no.

---

### 4. `TarjetaCredito` *(extends `CuentaBase`)*

- **Sobrescritura de método:** `getSaldo()` para representar la deuda como valor negativo.
- **Método clave:** `sumaInteres()`, que aumenta la deuda en un 15%.
- **Objetivo:** Reflejar el comportamiento de una tarjeta de crédito donde el saldo representa la cantidad adeudada.

---

### 5. `Main`

- **Punto de entrada:** Crea instancias de cada clase (débito, crédito, ahorro).
- **Demostración de operaciones:**
    - Depósitos y retiros.
    - Aplicación de intereses.
    - Visualización de saldos en consola.
- **Uso:** Validar que cada subclase se comporte según lo esperado.

---

## ¿Cómo ejecutar la aplicación?

1. **Clonar el repositorio:**
    
    ```bash
    git clone https://github.com/tu-usuario/Proyecto-de-herencia.git
    ```
    
2. **Abrir en NetBeans (o IDE de preferencia):**
    - Selecciona *File > Open Project* y busca la carpeta clonada.
3. **Ejecutar la clase `Main`:**
    - Pulsa el botón “Run” o ejecuta la clase `Main` para ver la salida en la consola.

---

## Tecnologías

- **Java:** Lenguaje principal, aprovechando herencia, encapsulación y polimorfismo.
- **NetBeans:** IDE para compilar y gestionar el proyecto.

---

##

<p align="center">
  <big><strong>¡Gracias por visitar este repositorio!✨</strong></big>
</p> 
