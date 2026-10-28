import java.util.Objects;

// "extends Object" is implicit: every class without an explicit superclass extends Object
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void login() {
        System.out.println("Person Login");
    }

    @Override
    public String toString() {
        return "Person: name: " + name + ", age: " + age;
    }
}
