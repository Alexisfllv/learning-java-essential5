  
# ☕ Stream Básico - Java

## 📁 Carpeta: `StreamBasic01`

---
## 🔹 filter()

Filtra elementos del stream según una condición booleana.

```java

.stream().filter(person -> person.getName().length() >= 5)

```

Ejemplo: mostrar personas con nombres de 5 letras o más.

---
## 🔹 map()

Transforma los elementos del stream. Ejemplo: multiplicar el salario x2.

```java

.stream()

.filter(p -> p.getName().length() >= 5)

.map(p -> new Person(p.getId(), p.getName(), p.getSalary().multiply(new BigDecimal("2"))))

```

---
## 🔹 forEach()

Ejecuta una acción por cada elemento. Ejemplo: imprimir o convertir a mayúsculas.

```java
.stream()
.map(p -> new Person(p.getId(), p.getName().toUpperCase(), p.getSalary()))
.forEach(System.out::println)
```

---
## 🔹 sorted()

Ordena los elementos del stream.
```java
// Orden natural
.stream().sorted()

// Orden por nombre
.stream().sorted(Comparator.comparing(Person::getName))
```

---
## 🧾 Modelo Person

Usado en todos los ejemplos:

```java
@Data
@AllArgsConstructor
@NoArgsConstructor
class Person {
Long idPerson;
String name;
BigDecimal salary;
}
```

---
