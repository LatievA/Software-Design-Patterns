package assignment_2.factory;

import assignment_2.user.User;
import assignment_2.course.Course;

public interface AbstractFactory {
    User createUser(String type, String id, String name, String email);
    Course createCourse(String type, String id, String title, String description);
}