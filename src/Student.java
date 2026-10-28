public class Student extends Person {
    // name and age are private in Person -> Student cannot access them directly
    // this.name would not compile
    // --> Use getName()/getAge() instead
    private String major;
    private String minor;

    public Student(String name, int age, String major, String minor) {
        super(name, age); // calls Person(name, age)
        this.major = major;
        this.minor = minor;
    }

    public String getMajor() {
        return major;
    }

    public String getMinor() {
        return minor;
    }

    @Override
    public void login() {
        super.login(); // First execute the super class' login functionality
        System.out.println("Student - login addition"); // add on to that functionality
    }

    @Override
    public String toString() {
        return super.toString() + ", major: " + this.major + ", minor: " + this.minor;
    }
}
