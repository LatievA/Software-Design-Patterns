package assignment_2.course;

public class OfflineCourse implements Course {
    private final String id;
    private String title;
    private String description;
    private String classroom;

    public OfflineCourse(String id, String title, String description, String classroom) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.classroom = classroom;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void start() {
        System.out.println("Offline course '" + title + "' started in classroom: " + classroom);
    }

    @Override
    public void finish() {
        System.out.println("Offline course '" + title + "' finished.");
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
}
