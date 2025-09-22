package assignment_2.factory;

import assignment_2.user.*;
import assignment_2.course.*;

public class CourseFactory implements AbstractFactory {

    @Override
    public User createUser(String type, String id, String name, String email) {
        return null;
    }

    @Override
    public Course createCourse(String type, String id, String title, String description) {
        if ("online".equalsIgnoreCase(type)) {
            return new OnlineCourse(id, title, description, "https://astanait.edu.kz");
        } else if ("offline".equalsIgnoreCase(type)) {
            return new OfflineCourse(id, title, description, "C1.3.318");
        }
        throw new IllegalArgumentException("Unknown course type: " + type);
    }
}
