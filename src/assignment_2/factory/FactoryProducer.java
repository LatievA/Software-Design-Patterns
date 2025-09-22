package assignment_2.factory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if ("user".equalsIgnoreCase(choice)) {
            return new UserFactory();
        } else if ("course".equalsIgnoreCase(choice)) {
            return new CourseFactory();
        }
        throw new IllegalArgumentException("Unknown factory choice: " + choice);
    }
}
