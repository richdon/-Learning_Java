package Unit2_OOP.Composition;

public class Main {
    // Composition is a "has - a" relationship
    // Person "has - a" brain
    // Car "has - a" engine
    public static void main(String[] args) {
        Student stu1 = new Student("Rich", "4-14-1992");
        System.out.println(stu1.getName());
        System.out.println(stu1.getDob());
        stu1.checkDorm();
        stu1.setDorm("YES");
        stu1.checkDorm();

        stu1.setCourse(new Course("Computer Science"));
        stu1.getCourse().setLevel("Undergraduate");
        stu1.getCourse().setStartDate("05-10-2021");

        System.out.println(stu1.getName() + " is enrolled in " + stu1.getCourse().getTitle() +
            " at the " + stu1.getCourse().getLevel() + "level. His DoB is " + stu1.getDob() +
                " and the course start date is " + stu1.getCourse().getStartDate());












    }
}
