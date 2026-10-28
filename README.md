# L17: Inheritance Example

In-class example on inheritance in Java: subclasses, `super(...)` constructor calls, inherited getters, and overriding methods while still running the superclass version with `super.login()`.

## Class diagram

```mermaid
classDiagram
    Object <|-- Person
    Person <|-- Student
    Student <|-- UndergradStudent
    Student <|-- GraduateStudent

    class Person {
        -String name
        -int age
        +getName() String
        +getAge() int
        +login() void
        +toString() String
    }
    class Student {
        -String major
        -String minor
        +getMajor() String
        +getMinor() String
        +login() void
        +toString() String
    }
    class UndergradStudent {
        -int classYear
        +getClassYear() int
        +login() void
        +toString() String
    }
    class GraduateStudent {
        -String advisor
        +getAdvisor() String
        +login() void
        +toString() String
    }
```

Each subclass overrides `login()` and calls `super.login()` first: Logging in as an `UndergradStudent` invokes `Person.login()`, then `Student.login()`, then `UndergradStudent.login()`.

## Run

```sh
javac -d bin src/*.java
java -cp bin Main
```
