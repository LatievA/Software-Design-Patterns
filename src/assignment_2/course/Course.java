package assignment_2.course;

public interface Course {
    String getId();

    String getTitle();
    void setTitle(String title);

    String getDescription();
    void setDescription(String description);

    void start();
    void finish();
}
