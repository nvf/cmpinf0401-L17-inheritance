public class Main {
    public static void main(String[] args) {
        Person yoda = new Person("Yoda", 864);
        Student student = new Student("Anakin", 14, "Jedi Studies", "Podracing");
        UndergradStudent newStudent = new UndergradStudent("Cookie Monster", 50, "Cookies", "Chocolate", 2);
        GraduateStudent gradStudent = new GraduateStudent("Obi-Wan", 38, "Lightsaber Combat", "Diplomacy", "Qui-Gon");

        System.out.println("** Inherited getter **");
        // getName() is defined in Person -> available to Student (subclass of Person), too
        System.out.println("student.getName() -> " + student.getName());

        System.out.println();
        System.out.println("** yoda.login() (Person) **");
        yoda.login(); // Person login

        System.out.println();
        System.out.println("** student.login() (Student extends Person) **");
        student.login();

        System.out.println();
        System.out.println("** newStudent.login() (UndergradStudent extends Student) **");
        newStudent.login(); // Each subclass calls super.login() first: Person.login -> Student.login -> UndergradStudent.login

        System.out.println();
        System.out.println("** gradStudent.login() (GraduateStudent extends Student) **");
        gradStudent.login();
    }
}
