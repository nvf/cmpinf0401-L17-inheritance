public class UndergradStudent extends Student {
    private int classYear; // 1 = freshman ... 4 = senior

    public UndergradStudent(String name, int age, String major, String minor, int classYear) {
        super(name, age, major, minor); // calls Student(name, age, major, minor)
        this.classYear = classYear;
    }

    public int getClassYear() {
        return classYear;
    }

    @Override
    public void login() {
        super.login(); // runs Student's login
        // name is private in Person -> we need to use the inherited getter
        System.out.println("Undergrad, " + getName() + " (year " + classYear + ")");
    }

    @Override
    public String toString() {
        return super.toString() + ", class year: " + classYear;
    }
}
