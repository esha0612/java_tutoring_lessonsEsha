/* We want to make a row of bricks that is goal inches long. We have small bricks (1 inch each) and big bricks (5 inches each). You are to write two methods

canMakeBricks(small, big, goal) that returns true if we have enough small and big bricks to reach the goal length, false otherwise. Example,
     canMakeBricks(3, 1, 8) --> true
     canMakeBricks(3, 1, 9) --> false
     canMakeBricks(3, 2, 10) --> true
numberOfSmallBricksNeeded(small, big, goal) that calculates the number of small bricks needed to reach the goal, assuming we always use big bricks before small bricks. It returns -1 if it can't be done. Example,
     numberOfSmallBricksNeeded(4, 1, 9) --> 4
     numberOfSmallBricksNeeded(4, 1, 10) --> -1
     numberOfSmallBricksNeeded(4, 1, 7) --> 2
 
The main is provided to test various scenarios.

Here are some sample runs:

 Can make 9 inches with 4 small brick(s) and 1 big brick(s)? true
 Number of small bricks needed 4
  
 Can make 9 inches with 3 small brick(s) and 1 big brick(s)? false
 Number of small bricks needed -1
 
 Can make 8 inches with 3 small brick(s) and 1 big brick(s)? true
 Number of small bricks needed 3
 
 Can make 10 inches with 3 small brick(s) and 2 big brick(s)? true
 Number of small bricks needed 0

 */
 public class HW1 {
     public static boolean canMakeBricks(int small, int big, int goal) {
        // small = 1, big = 5
        if (goal > (small + big * 5)) {
            return false;
        }
        if (small >= goal % 5) {
            return true;
        }
        return false;
     }

     public static int numberOfSmallBricksNeeded(int small, int big, int goal){
         if (canMakeBricks(small, big, goal)) {
             if (goal/5 <= big) {
                 return goal % 5;
             } else {
                 return goal - big * 5;
             }
         }
         return -1;
     }
     public static void main(String[] args){
         int s=3;
         int b=2;
         int g=10;       
     }
 }