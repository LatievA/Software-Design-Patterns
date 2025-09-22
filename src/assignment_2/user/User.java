package assignment_2.user;

public interface User {
    String getId();

    String getName();
    void setName(String name);

    String getEmail();
    void setEmail(String email);

    void login();
    void logout();
}
