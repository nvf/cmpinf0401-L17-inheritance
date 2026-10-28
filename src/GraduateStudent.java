public class GraduateStudent extends Student {
    private String advisor;

    public GraduateStudent(String name, int age, String major, String minor, String advisor) {
        super(name, age, major, minor); // calls Student(name, age, major, minor)
        this.advisor = advisor;
    }

    public String getAdvisor() {
        return advisor;
    }

    @Override
    public void login() {
        super.login(); 
        System.out.println("Graduate - advisor: " + advisor);
    }

    @Override
    public String toString() {
        return super.toString() + ", advisor: " + advisor;
    }
}
