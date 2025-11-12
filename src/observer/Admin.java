package observer;

public class Admin implements Observer {
    public void update(String message) {
        System.out.println("Admin Alert: " + message);
    }
}
