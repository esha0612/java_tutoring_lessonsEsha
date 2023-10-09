import java.util.ArrayList;
import java.util.List;

public class Streaming_Equivalent {
    public static void main (String[] args) {
        List<String> names = new ArrayList<String>() { {
            add("Jai");
            add("Mahesh");
            add("Ajay");
            add("Hemant");
            add("Vishal");
        } };
        
        // Same premise as List_Prog.java, we need to count the names with length <5
        // But this time we will use streams
        System.out.println("Number of names with length <5: " + names.stream().filter(name -> name.length() < 5).count());
    }
}