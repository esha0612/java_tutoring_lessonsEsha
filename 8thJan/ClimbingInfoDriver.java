import java.util.List;
import java.util.ArrayList;
/**
 * Last Name:
 * First Name:
 * Student ID:
 * Period: 
 *
 * A mountain climbing club maintains a record of the climbs that its members have made. Information about a
 * climb includes the name of the mountain peak and the amount of time it took to reach the top. The information is
 * contained in the ClimbInfo class as declared below. 
 */
class ClimbInfo
{
  private String name;
  private int time;

  /** 
   * Creates a ClimbInfo object with name peakName and time climbTime.
   * @param peakName the name of the mountain peak
   * @param climbTime the number of minutes taken to complete the climb 
   */
  public ClimbInfo(String peakName, int climbTime)
  {
    name = peakName;
    time = climbTime;
  }

  /** 
   * Returns the name of the mountain peak
   * @return the name of the mountain peak 
   */
  public String getName()
  {
    return name;
  }

  /** 
   * Returns the number of minutes taken to complete the climb
   * @return the number of minutes taken to complete the climb 
   */
  public int getTime()
  {
    return time;
  }
  /**
   * Returns the climbing information as a string
   * @return information as a string
   */
  public String toString()
  {
    return "Peak name: " + name + " time: " + time;
  }
}
        
/**
 * Last Name:
 * First Name:
 * Student ID:
 * Period: 
 *
 * The ClimbingClub class maintains a list of the climbs made by members of the club. The declaration of the
 * ClimbingClub class is shown below. You will write two different implementations of the addClimb
 * method. You will also answer two questions about an implementation of the distinctPeakNames method. 
 * 
 * 1. Write the method addClimb that stores the ClimbInfo objects in the order they were added. 
 *    This implementation of addClimb should create a new ClimbInfo object with the given name and time. 
 *    It appends a reference to that object to the end of climbList. For example, consider the 
 *    following code segment.
 *    
 *    ClimbingClub hikerClub = new ClimbingClub();
 *    hikerClub.addClimb("Monadnock", 274);
 *    hikerClub.addClimb("Whiteface", 301);
 *    hikerClub.addClimb("Algonquin", 225);
 *    hikerClub.addClimb("Monadnock", 344);
 *    
 * 	  When the code segment has completed executing, the instance variable climbList would contain the
 *    following entries. 
 *    
 *    Peak Name		"Monadnock"		"Whiteface"		"Algonquin"		"Monadnock"
 *    Climb Time		274				301				225				344
 *    
 * 2. Write the method addClimbInOrder that stores the elements of climbList in alphabetical order 
 *    by name (as determined by the compareTo method of the String class). This implementation of 
 *    addClimbInOrder should create a new ClimbInfo object with the given name
 *    and time and then insert the object into the appropriate position in climbList. Entries that have the
 *    same name will be grouped together and must be in the order in which they are added to the list. 
 *    For example, consider the following code segment.
 *    
 *    ClimbingClub hikerClub = new ClimbingClub();
 *    hikerClub.addClimb("Monadnock", 274);
 *    hikerClub.addClimb("Whiteface", 301);
 *    hikerClub.addClimb("Algonquin", 225);
 *    hikerClub.addClimb("Monadnock", 344);
 *    
 *    When the code segment has completed execution, the instance variable climbList would contain the
 *    following entries in either of the orders shown below. 
 *    
 *    Peak Name		"Algonquin"		"Monadnock"		"Monadnock"		"Whiteface"
 *    Climb Time		225				     274				   344				   301
 *    
 *    You may assume that climbList is in alphabetical order by name when the method is called. When the
 *    method has completed execution, climbList should still be in alphabetical order by name. 
 *    
 * 3. Write the ClimbingClub method distinctPeakNames is intended to return the number of different
 *    names in climbList. Assume that list of climbs has names in alphabetical order.
 *    For example, after the following code segment has completed execution, the value
 *    of the variable numNames would be 3.
 *    
 *	  ClimbingClub hikerClub = new ClimbingClub();
 *	  hikerClub.addClimb("Monadnock", 274);
 *	  hikerClub.addClimb("Whiteface", 301);
 *    hikerClub.addClimb("Algonquin", 225);
 *    hikerClub.addClimb("Monadnock", 344);
 *    int numNames = hikerClub.distinctPeakNames(); 
 */
class ClimbingClub
{
   /** The list of climbs completed by members of the club.
    *  Guaranteed not to be null. Contains only non-null references.
    */
  private List<ClimbInfo> climbList;

  /** Creates a new ClimbingClub object. */
  public ClimbingClub()
  {
     climbList = new ArrayList<ClimbInfo>();
  }

  /** Adds a new climb with name peakName and time climbTime to the end of the list of climbs
   *
   * @param peakName the name of the mountain peak climbed
   * @param climbTime the number of minutes taken to complete the climb
   * Post-condition: The new entry is at the end of climbList;
   *  				 The order of the remaining entries is unchanged
   */
  public void addClimb(String peakName, int climbTime)
  {
	  //Your code goes here
      climbList.add(new ClimbInfo(peakName, climbTime));
  }
  /** 
   * Adds a new climb with name peakName and time climbTime to the list of climbs.
   * Alphabetical order is determined by the compareTo method of the String class.
   * @param peakName the name of the mountain peak climbed
   * @param climbTime the number of minutes taken to complete the climb
   * Pre-condition: entries in climbList are in alphabetical order by name.
   * Post-condition: entries in climbList are in alphabetical order by name.
   */
   public void addClimbInOrder(String peakName, int climbTime) {
	    //Your code goes here
      // If empty, add to the end
      if (climbList.size() == 0) {
          climbList.add(new ClimbInfo(peakName, climbTime));
          return;
      }
      // If not empty, find the right place to insert
      // If the name is different, insert before the first name that is greater than it
      // If the name is the same as any of the names, compare time instead
      for (int i = 0; i < climbList.size(); i++) {
          ClimbInfo info = climbList.get(i);
          if (info.getName().compareTo(peakName) > 0) {
              climbList.add(i, new ClimbInfo(peakName, climbTime));
              return;
          } else if (info.getName().compareTo(peakName) == 0) {
              if (info.getTime() > climbTime) {
                  climbList.add(i, new ClimbInfo(peakName, climbTime));
                  return;
              } else {
                  climbList.add(i + 1, new ClimbInfo(peakName, climbTime));
                  return;
              }
          }
      }
      climbList.add(new ClimbInfo(peakName, climbTime));
   }
   /**
    * Returns the number of distinct names in the list of climbs
    * @return the number of distinct names in the list of climbs 
    * Pre-condition: entries in climbList are in alphabetical order by name.
    */
   public int distinctPeaks() {
	   //Your code goes here
        ArrayList<String> distinctPeaks = new ArrayList<String>();
        for (ClimbInfo info : climbList) {
            System.out.println(info.getName());
            System.out.println(distinctPeaks.contains(info.getName()));
            if (!distinctPeaks.contains(info.getName())) {
                distinctPeaks.add(info.getName());
            }
        }
        return distinctPeaks.size();
   }
   /**
    * Method returns the climbList information as a string
    * @return climbList as a string
    */
  public String toString()
  {
    String output ="";
    for (ClimbInfo info : climbList)
    {
      output = output + info.toString() + "\n";
    }
    return output;
  }
}
public class ClimbingInfoDriver {
	public static void main(String[] args)
	  {
	    // test a
	    ClimbingClub hikerClub = new ClimbingClub();
	    hikerClub.addClimb("Monadnock", 274);
	    hikerClub.addClimb("Whiteface", 301);
	    hikerClub.addClimb("Algonquin", 225);
	    hikerClub.addClimb("Monadnock", 344);
	    System.out.print(hikerClub);
	    System.out.println("The order printed above should be Monadnock, Whiteface, Algonquin, Monadnock");
	    hikerClub = new ClimbingClub();
	    hikerClub.addClimbInOrder("Monadnock", 274);
      System.out.println(hikerClub);
	    hikerClub.addClimbInOrder("Whiteface", 301);
      System.out.println(hikerClub);
	    hikerClub.addClimbInOrder("Algonquin", 225);
      System.out.println(hikerClub);
	    hikerClub.addClimbInOrder("Monadnock", 344);
	    System.out.print(hikerClub);
	    System.out.println("The order printed above should be Algonquin, Monadnock 274, Monadnock 344, Whiteface");
	    System.out.println("Number of distinct names: " + hikerClub.distinctPeaks());
	  }
}