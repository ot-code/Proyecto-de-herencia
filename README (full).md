<h1 align="center">Proyecto de herencia</h1>💱

El proyecto de herencia es una aplicación Java diseñada para demostrar los conceptos fundamentales de la programación orientada a objetos, en particular la **herencia**. ¡Una excelente muestra de cómo aplicar principios POO en un entorno real! 🚀

### Componentes y clases

1. **CuentaBase**
   - **Función:** Es la clase base de la que derivan las demás cuentas.
   - **Características:**
     - Contiene un atributo `montoActual` (de tipo `double`) que almacena el saldo o deuda.
     - Ofrece métodos para depositar (`depositar(double cantidad)`) y obtener el saldo (`getSaldo()`).
   - **Objetivo:** Centralizar operaciones comunes para evitar duplicidad de código y facilitar la herencia.
2. **CuentaAhorro**
   - **Herencia:** Extiende de `CuentaBase`.
   - **Funcionalidad adicional:**
     - Incluye el método `invertir()`, que incrementa el saldo actual en un 10%.
   - **Objetivo:** Simular el comportamiento de una cuenta de ahorros que genera intereses de inversión.
3. **TarjetaCredito**
   - **Herencia:** Extiende de `CuentaBase`.
   - **Características:**
     - Sobrescribe el método `getSaldo()` para mostrar el saldo en forma negativa (representando deuda).
     - Incorpora el método `sumaInteres()`, que aumenta la deuda en un 15% sobre el monto actual.
   - **Objetivo:** Simular el funcionamiento de una tarjeta de crédito donde el saldo representa la deuda del usuario.
4. **TarjetaDebito**
   - **Herencia:** Extiende de `CuentaBase`.
   - **Funcionalidad adicional:**
     - Implementa el método `retirar(double cantidad)` con validaciones para asegurar que la cantidad a retirar sea positiva y que exista suficiente saldo.
   - **Objetivo:** Modelar una tarjeta de débito con operaciones de retiro seguras.
5. **Main**
   - **Propósito:**
     - Funciona como clase ejecutable del proyecto, donde se crean instancias de cada tipo de cuenta y se demuestran sus comportamientos a través de pruebas de operaciones (depósitos, retiros, inversiones y aplicación de intereses).
   - **Objetivo:** Mostrar en la consola el flujo de operaciones y validar el correcto funcionamiento de cada clase.

---

## Herramientas y tecnologías

- **Lenguaje de Programación:**
  - **Java:** Se utilizó Java, aprovechando las características de la programación orientada a objetos, como herencia, encapsulamiento, paso de parámetros y sobreescritura de métodos.
- **Entorno de Desarrollo Integrado (IDE):**
  - **NetBeans:** Se empleó NetBeans para la creación y gestión del proyecto.

---

## Funcionalidad esperada

La aplicación simula el sistema de cuentas de un banco (en este caso, para el banco MexBank que incluye tres tipos de cuentas:

- **Tarjeta de crédito:** Permite aumentar la deuda mediante un depósito y aplicar intereses que incrementan el monto adeudado.
- **Tarjeta de débito:** Permite retirar fondos siempre que haya saldo suficiente, mostrando mensajes claros en caso de errores.
- **Cuenta de ahorro:** Permite invertir el saldo, incrementándolo en un porcentaje definido (10%).

El sistema demuestra cómo, mediante la herencia, se puede aprovechar la reutilización de código y simplificar la implementación de características comunes, adaptando cada subclase a su funcionalidad específica. 💻✨

---

<h2 align="center">Análisis del código</h2>💱

## CuentaBase

1. **Estructura y código**
   - **Paquete:**
     La línea `package Reto4;` indica que esta clase forma parte del paquete llamado *Reto4*.
   - **Declaración de la clase:**
     La clase se declara con `public class CuentaBase { ... }`, lo que significa que es pública y puede ser accedida desde otras clases y paquetes. La elección de la palabra clave `public` permite que la clase sea reutilizada y extendida (heredada) por otras clases, como en el caso de `TarjetaCredito`, `TarjetaDebito` y `CuentaAhorro`.
2. **Legibilidad**
   - La indentación del código es de 4 espacios (o un tabulador), lo cual es una práctica común y recomendada en Java.
   - Esta indentación ayuda a visualizar la estructura jerárquica del código:
     - Las variables y métodos de la clase están indentados dentro de las llaves de la clase.
3. **Variables y modificadores de acceso**
   - **Variable `montoActual`:**
     Se declara como `protected double montoActual;`
     - **`protected`:** Este modificador de acceso permite que la variable sea visible no solo dentro de la propia clase, sino también en sus subclases (clases que heredan de CuentaBase) y en clases del mismo paquete.
     - Esto es útil cuando se quiere que las clases derivadas puedan modificar o acceder al saldo sin tener que recurrir a métodos adicionales, manteniendo a la vez un cierto nivel de encapsulación.
   - **Tipo de dato:**
     Se utiliza `double` para almacenar valores numéricos con decimales, lo que es adecuado para representar montos de dinero.
4. **Constructor**
   - **`public CuentaBase(double apertura) { ... }`**
     - Este es el constructor de la clase, el cual se invoca cuando se crea una instancia de `CuentaBase`.
     - Recibe un parámetro `apertura` que se utiliza para inicializar el atributo `montoActual`.
     - Esto permite establecer un saldo inicial para cualquier cuenta, ya sea al momento de su creación en una cuenta de ahorro, tarjeta de débito o crédito.
5. **Métodos**
   - **`public double getSaldo()`**
     - Este método retorna el valor actual de `montoActual`.
     - Es un ejemplo de un método *getter*, utilizado para acceder al valor de una variable de instancia de manera segura.
     - La simplicidad del método facilita la lectura y el entendimiento, manteniendo el principio de encapsulamiento.
   - **`public void depositar(double cantidad)`**
     - Este método permite aumentar el valor de `montoActual` al agregarle la cantidad indicada.
     - La operación es una suma simple, que modifica el saldo actual depositado en la cuenta.
     - Este método es esencial para simular la operación de depósito en una cuenta bancaria.
6. **Buenas prácticas**
   - **Simplicidad y reutilización:**
     La clase está diseñada para ser una base sobre la cual se pueden construir comportamientos específicos en las subclases. Al centralizar operaciones comunes (como depositar o consultar saldo) en la clase base, se evita la duplicación de código y se facilita el mantenimiento.
   - **Encapsulamiento:**
     Aunque el atributo `montoActual` es `protected`, lo ideal es utilizar métodos (como `getSaldo()` y `depositar()`) para interactuar con este valor, lo que permite controlar cómo se modifica y se accede al saldo. Esto es fundamental para mantener la integridad de los datos en la aplicación.

---

## CuentaAhorro

1. **Herencia y código**
   - **Paquete:**
     La línea `package Reto4;` indica que la clase forma parte del mismo paquete que la clase base, lo cual ayuda a mantener una estructura organizada en el proyecto.
   - **Herencia:**
     La declaración `public class CuentaAhorro extends CuentaBase` indica que **CuentaAhorro** hereda de **CuentaBase**. Esto significa que automáticamente obtiene el atributo `montoActual` y los métodos definidos en **CuentaBase** (como `getSaldo()` y `depositar()`), permitiéndole reutilizar y extender su funcionalidad.
2. **Constructor**
   - **`public CuentaAhorro(double apertura)`**
     Este constructor recibe un valor inicial (apertura) que se utiliza para inicializar el saldo de la cuenta.
     - **Uso de `super(apertura)`:**
       Llama al constructor de la clase base (`CuentaBase`), lo que garantiza que la variable `montoActual` se establezca con el valor inicial.
       - Esto evita duplicar la lógica de inicialización y permite que cualquier cambio en la implementación de la clase base se refleje en todas las subclases.
3. **Método Invertir**
   - **`public void invertir()`**
     Este método implementa la funcionalidad específica de una cuenta de ahorro: aumentar el saldo mediante una inversión.
     - La operación `montoActual += montoActual * 0.10;` incrementa el saldo actual en un 10%.
       - **Fórmula:** Se calcula el 10% del `montoActual` y se suma a éste, simulando así el efecto de una inversión o interés que incrementa el valor de la cuenta.
     - La elección de esta operación es sencilla y directa, mostrando un ejemplo claro de cómo se pueden aplicar cálculos financieros en el contexto de la herencia.
4. **Consideraciones Técnicas**
   - **Modificador de acceso:**
     La clase y sus métodos son declarados como `public`, lo que permite su uso y extensión desde otras partes del proyecto o incluso desde otros proyectos, si fuera necesario.
   - **Variables heredadas:**
     El método `invertir()` opera directamente sobre `montoActual`, el cual es `protected` en la clase base. Esto permite que las subclases modifiquen el saldo sin comprometer el encapsulamiento total, manteniendo un equilibrio entre accesibilidad y seguridad en el diseño.

---

## TarjetaDebito

- **Herencia y organización**
  - **Herencia:**
    La clase `TarjetaDebito` extiende de `CuentaBase`. Esto significa que hereda la variable `montoActual` y los métodos definidos en la clase base (por ejemplo, `getSaldo()` y `depositar()`).
    - La herencia permite reutilizar la lógica común para el manejo del saldo y centrarse en la funcionalidad específica del débito (en este caso, el método de retiro).
  - **Paquet**
    Se encuentra en el paquete `Reto4`, lo que ayuda a organizar el código junto a las demás clases del proyecto.
- **Constructor**
  - **`public TarjetaDebito(double apertura)`**
    El constructor invoca a `super(apertura)` para inicializar el atributo `montoActual` de la clase base con el valor inicial recibido.
    - Esto garantiza que la cuenta tenga un saldo inicial configurado correctamente cuando se crea una instancia de TarjetaDebito.
- **Método `retirar(double cantidad)`**
  Este método implementa la funcionalidad de retirar fondos de la cuenta, aplicando validaciones para asegurar que la operación sea coherente:
  - **Validación de cantidad positiva:**
    ```java
    if (cantidad <= 0) {
        System.out.println("La cantidad a retirar debe ser positiva");
        return false;
    }
    ```
    - Se comprueba que la cantidad a retirar sea mayor que cero.
    - Si no se cumple, se muestra un mensaje y se retorna `false`, indicando que la operación no se realizó.
  - **Validación de saldo suficiente:**
    ```java
    else if (cantidad > montoActual) {
        System.out.println("No hay suficiente saldo para cubrir la retirada");
        return false;
    }
    ```
    - Se verifica que el saldo actual (`montoActual`) sea suficiente para cubrir el retiro solicitado.
    - Si no hay fondos suficientes, se notifica al usuario y se retorna `false`.
  - **Operación de retiro:**
    ```java
    else {
        montoActual -= cantidad;
        return true;
    }

    ```
    - Si ambas validaciones se superan, se descuenta la cantidad solicitada del saldo.
    - Se retorna `true` para indicar que la operación de retiro fue exitosa.
- **Buenas prácticas**
  - **Claridad en el flujo de control:**
    La estructura condicional `if-else` permite una lectura sencilla y clara de los pasos necesarios para realizar un retiro.
    - Cada condición se encarga de una validación específica.
  - **Uso de mensajes informativos:**
    Los mensajes que se imprimen en consola ayudan a comprender por qué una operación falla (por ejemplo, retirar una cantidad no positiva o intentar retirar más fondos de los disponibles).
  - **Retorno de valores booleanos:**
    El método devuelve un valor `boolean` que indica de forma inmediata si la operación fue exitosa (`true`) o no (`false`), lo cual es útil para el control del flujo en la aplicación.
- **Consideraciones técnicas**
  - **Acceso a `montoActual`:**
    El atributo `montoActual` es `protected` en la clase base, lo que permite a `TarjetaDebito` modificarlo directamente sin necesidad de métodos adicionales.
  - **Encapsulamiento:**
    Aunque el acceso directo a `montoActual` se hace posible gracias a su modificador `protected`, el uso de métodos específicos (como `retirar`) ayuda a mantener el control sobre cómo se modifica el saldo, asegurando la integridad de la información.

## TarjetaCrédito

- **Herencia y código**
  - **Herencia:**
    La clase `TarjetaCredito` extiende de `CuentaBase`, lo que significa que hereda el atributo `montoActual` y métodos como `depositar()`. Esto permite reutilizar la estructura básica de una cuenta y luego modificar el comportamiento específico para una tarjeta de crédito.
  - **Paquete:**
    Se encuentra en el paquete `Reto4`, lo que organiza el código junto con las demás clases del proyecto.
- **Constructor**
  - **`public TarjetaCredito(double apertura)`**
    - Invoca el constructor de la clase base mediante `super(apertura)`, inicializando el saldo (o deuda, en este caso) con el valor proporcionado.
    - Esto garantiza una inicialización consistente sin duplicar la lógica ya definida en `CuentaBase`.
- **Método `getSaldo()` Sobrescrito**
  - **`@Override public double getSaldo()`**
    - Este método sobrescribe la implementación de `getSaldo()` heredada de `CuentaBase`.
    - En una tarjeta de crédito, se modela el saldo como una deuda, por lo que se retorna el valor negativo de `montoActual` usando la expresión `montoActual * -1`.
    - Esta modificación es fundamental para diferenciar la tarjeta de crédito de otros tipos de cuenta, ya que en este caso, un saldo "positivo" en la clase base representa una deuda, y se necesita reflejarlo de forma negativa para el usuario.
- **Método `sumaInteres()`**
  - **`public void sumaInteres()`**
    - Este método incrementa la deuda al aplicar un interés del 15% sobre el monto actual.
    - La operación `montoActual -= montoActual * 0.15;` disminuye el valor de `montoActual` (recordemos que éste representa la deuda) en un 15% adicional, simulando la acumulación de intereses.
    - Es importante notar que, al tratarse de una tarjeta de crédito, la lógica de incrementar la deuda se implementa de esta manera.
- **Buenas prácticas**
  - **Sobrescritura:**
    El uso de `@Override` deja claro que se está modificando el comportamiento del método heredado, lo cual es una buena práctica para evitar errores y mejorar la legibilidad.
  - **Consistencia en la herencia:**
    Al reutilizar el atributo `montoActual` y al extender de `CuentaBase`, se mantiene una estructura coherente y modular. Esto facilita la extensión y el mantenimiento del código, ya que cualquier cambio en la lógica base afectará de manera consistente a las subclases.
- **Consideraciones técnicas**
  - **Manejo de deuda:**
    La decisión de retornar el saldo como un valor negativo en `getSaldo()` es intencional para diferenciar la tarjeta de crédito de otros tipos de cuenta, donde un saldo positivo indica fondos disponibles.
  - **Aplicación de Intereses:**
    El método `sumaInteres()` refleja el comportamiento real de una tarjeta de crédito, donde la deuda crece debido a los intereses aplicados. Esta operación es sencilla, pero ejemplifica cómo se pueden modelar reglas de negocio específicas.

## Main

1. **Propósito**
   - La clase **Main** actúa como punto de entrada para el programa, demostrando el funcionamiento de las diferentes cuentas bancarias implementadas (TarjetaDebito, TarjetaCredito y CuentaAhorro).
   - Se ejecutan pruebas para cada tipo de cuenta, mostrando en la consola cómo varían los saldos tras realizar operaciones específicas (retiro, depósito, inversión e intereses).
2. **Estructura del étodo main**
   - **Inicio:**
     Se utiliza `System.out.println()` para imprimir mensajes en la consola, facilitando la comprensión del flujo de ejecución.
     - El uso de tabulaciones (`\t`) y saltos de línea (`\n`) mejora la presentación y organización visual de la salida, haciéndola más legible y amigable para el usuario.
     - Los mensajes indican claramente qué operación se está probando en cada momento.
3. **Pruebas de TarjetaDebito**
   - **Creación de una instancia:**
     ```java
     TarjetaDebito debito = new TarjetaDebito(100);
     ```
     Se crea una cuenta de débito con un saldo inicial de 100.
   - **Operaciones y validaciones:**
     - Se intenta retirar una cantidad mayor que el saldo inicial (150), lo que genera un mensaje de error en el método `retirar()`.
     - Se deposita dinero adicional (`depositar(100)`) para cubrir la falta de fondos y se realiza otro intento de retiro.
     - Finalmente, se muestra el saldo final tras las operaciones de retiro y depósito.
4. **Pruebas de TarjetaCredito**
   - **Creación de una instancia:**
     ```java
     TarjetaCredito credito = new TarjetaCredito(300);
     ```
     Se inicia una tarjeta de crédito con un valor inicial de 300, representado internamente como deuda.
   - **Operaciones y validaciones:**
     - Se muestra la deuda inicial (con signo negativo debido a la sobrescritura del método `getSaldo()`).
     - Se realiza un depósito que, en este contexto, incrementa la deuda (ya que la tarjeta de crédito maneja el saldo de forma invertida).
     - Se aplica el método `sumaInteres()`, que incrementa la deuda en un 15%, y se muestra el saldo final.
5. **Pruebas de CuentaAhorro**
   - **Creación de una instancia:**
     ```java
     CuentaAhorro ahorro = new CuentaAhorro(1000);
     ```
     Se crea una cuenta de ahorro con un saldo inicial de 1000.
   - **Operaciones y validaciones:**
     - Se imprime el saldo inicial.
     - Se ejecuta el método `invertir()`, que aumenta el saldo en un 10%.
     - Se muestra el saldo final tras la operación de inversión.
6. **Buenas prácticas**
   - **Mensajes Informativos:**
     Los mensajes impresos en la consola ofrecen una guía clara sobre lo que está ocurriendo en cada etapa, lo que es muy útil tanto para propósitos de depuración como para demostrar el funcionamiento del programa.
   - **Uso de la Herencia:**
     La clase **Main** aprovecha las implementaciones específicas de cada subclase (TarjetaDebito, TarjetaCredito y CuentaAhorro) que extienden de **CuentaBase**. Esto refuerza el concepto de reutilización de código y la modularidad, ya que cada tipo de cuenta tiene su comportamiento particular.

---

<p align="center">
  <big><strong>✨¡Gracias por visitar este repositorio!✨</strong></big>
</p> 
