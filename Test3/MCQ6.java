import java.util.ArrayList;
import java.util.List;

public class MCQ6 {
    public static void main(String[] args) {
        int[] array = {6,9,8};  
        List<Integer> list = new ArrayList<>();  
        list.add(array[0]);  
        list.add(array[2]);  
        list.set(1, array[1]);  
        list.remove(0);  
        System.out.println(list);
    }
}

// The output will be:
// 1. [9] --> Correct
// 2. [8]
// 3. [6, 8]
// 4. Something like [Ljava.lang.String;@160bc7c0