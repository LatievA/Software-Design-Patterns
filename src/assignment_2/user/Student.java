package assignment_2.user;

public class Student implements User {
    private final String id;
    private String name;
    private String email;

    public Student(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void login() {
        System.out.println("Student " + name + " logged in.");
    }

    @Override
    public void logout() {
        System.out.println("Student " + name + " logged out.");
    }

    public void enrollInCourse(String courseName) {
        System.out.println("Student " + name + " enrolled in: " + courseName);
    }
}
