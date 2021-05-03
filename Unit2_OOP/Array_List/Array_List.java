package Unit2_OOP.Array_List;
import java.util.ArrayList;
public class Array_List {
    public static void main(String[] args) {

        // string array  size 5 null values
        String [] sa = new String[5];

        // ArrayList does not require prefixed size
        ArrayList<String> sal = new ArrayList<String>();

        sal.add("element 1");
        sal.add("element 2");
        
        System.out.println(sal.get(0));

        System.out.println(sal.contains("element 2"));
        System.out.println(sal);
        sal.set(1 , "new element replacement");
        System.out.println(sal);
        System.out.println(sal.size());
        sal.remove(1);
        System.out.println(sal);
        System.out.println(sal.size());
        sal.clear();
        System.out.println(sal.size());

    }
}
