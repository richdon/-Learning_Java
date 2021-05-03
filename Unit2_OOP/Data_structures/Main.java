package Unit2_OOP.Data_structures;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();

        emp1.name = "Jeff";
        emp1.age = 32;
        emp1.jobTitle = "Construction Worker";

        emp2.name = "Rich";
        emp2.age = 29;
        emp2.jobTitle = "Developer";

        emp3.name = "Cindy";
        emp3.age = 45;
        emp3.jobTitle = "Chef";

        bar(emp2);
        foo(emp2);
        bar(emp2);

    }

    static void bar (Employee emp){
        System.out.println(emp.name + " is " + emp.age + " years old and is a " + emp.jobTitle);

    }

    static void foo (Employee emp){
        emp.name = "David";
        emp.age = 45;
        emp.jobTitle = "Senior Engineer";
    }

}
