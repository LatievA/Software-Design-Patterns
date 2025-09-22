package assignment_2.client;

import assignment_2.factory.*;
import assignment_2.user.User;
import assignment_2.course.Course;

class Main {
    static void main(String[] args) {
        AbstractFactory userFactory = FactoryProducer.getFactory("User");
        User studentAbylay = userFactory.createUser("student", "u1", "Abylay", "abilailat@gmail.com");
        User teacherMurat = userFactory.createUser("teacher", "u2", "Murat", "kfdkdkd@gmail.com");

        studentAbylay.login();
        studentAbylay.logout();
        teacherMurat.login();
        teacherMurat.logout();

        AbstractFactory courseFactory = FactoryProducer.getFactory("Course");
        Course onlineMath = courseFactory.createCourse("online", "c1", "Mathematics", "Introduction to Mathematics");
        Course offlineVolleyball = courseFactory.createCourse("offline", "c2", "Volleyball", "Volleyball course");

        onlineMath.start();
        onlineMath.finish();
        offlineVolleyball.start();
        offlineVolleyball.finish();
    }
}
