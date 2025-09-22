package assignment_2.factory;

import assignment_2.user.*;
import assignment_2.course.*;

public class UserFactory implements AbstractFactory {

    @Override
    public User createUser(String type, String id, String name, String email) {
        if ("student".equalsIgnoreCase(type)) {
            return new Student(id, name, email);
        } else if ("teacher".equalsIgnoreCase(type)) {
            return new Teacher(id, name, email);
        }
        throw new IllegalArgumentException("Unknown user type: " + type);
    }

    @Override
    public Course createCourse(String type, String id, String title, String description) {
        return null;
    }
}
