package assignment_2.user;

public class Teacher implements User {
    private final String id;
    private String name;
    private String email;

    public Teacher(String id, String name, String email) {
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
        System.out.println("Teacher " + name + " logged in.");
    }

    @Override
    public void logout() {
        System.out.println("Teacher " + name + " logged out.");
    }

    public void createCourse(String courseName) {
        System.out.println("Teacher " + name + " created course: " + courseName);
    }
}
