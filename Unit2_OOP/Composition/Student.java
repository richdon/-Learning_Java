package Unit2_OOP.Composition;

public class Student {

    private String name;
    private String dateOfBirth;
    private boolean hasDorm;
    private Course course;

    // constructor
    public Student (String n , String dob) {
        setName(n);
        setDob(dob);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDob(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setDorm(String choice) {
        if (choice.toLowerCase().equals("yes")) {
            hasDorm = true;
        }
        else {
            hasDorm = false;
        }
    }
    public void checkDorm () {
        if (hasDorm) {
            System.out.println(name + " has a dorm");
        }
        else {
            System.out.println(name + " does not have a dorm");
        }
    }
    public String getName(){
        return name;
    }
    public String getDob(){
        return dateOfBirth;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }
}
