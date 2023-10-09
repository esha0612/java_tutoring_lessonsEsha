import java.util.ArrayList;
import java.util.List;

public class List_Prog {
    public static void main (String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Jai");
    	names.add("Mahesh");
    	names.add("Ajay");
    	names.add("Hemant");
    	names.add("Vishal");

        // We want to count the names with length <5
        int count = 0;
        for (String name : names) {
            if (name.length() < 5) {
                count++;
            }
        }

        System.out.println("Number of names with length <5: " + count);
    }
}
