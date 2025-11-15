package observer;

public class Customer implements Observer {
    public static String name;
    public Customer(String name) { Customer.name = name; }

    public void update(String message) {
        System.out.println(name + " received update: " + message);
    }
}