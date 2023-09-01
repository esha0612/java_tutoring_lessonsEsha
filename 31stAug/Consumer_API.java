import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Consumer;

// We have to print the prime factors for each number in the list

public class Consumer_API {

  private static HashSet<Integer> primeFactors(int n) {
    HashSet<Integer> factors = new HashSet<Integer>();
    for (int i = 2; i <= n; i++) {
      while (n % i == 0) {
        factors.add(i);
        n /= i;
      }
    }
    return factors;
  }

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>() { 
      { 
        add(2); 
        add(3); 
        add(4); 
        add(5); 
        add(6); 
        add(7); 
        add(8); 
        add(9); 
        add(10); 
      } 
    };
    Consumer<Integer> method = (n) -> { System.out.println(primeFactors(n).toString()); };
    numbers.forEach( method );
  }
}
