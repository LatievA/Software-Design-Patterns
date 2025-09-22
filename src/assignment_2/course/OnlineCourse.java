package assignment_2.course;

public class OnlineCourse implements Course {
    final private String id;
    private String title;
    private String description;
    private String url;

    public OnlineCourse(String id, String title, String description, String url) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.url = url;
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
        System.out.println("Online course '" + title + "' started. Access it at: " + url);
    }

    @Override
    public void finish() {
        System.out.println("Online course '" + title + "' finished.");
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
