package Unit2_OOP.Composition;

public class Course {
    private String title;
    private String level;
    private String startDate;

    public Course(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getTitle() {
        return title;
    }

    public String getLevel() {
        return level;
    }

    public String getStartDate() {
        return startDate;
    }
}
