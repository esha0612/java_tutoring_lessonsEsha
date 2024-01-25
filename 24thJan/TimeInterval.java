/*
 /*
 * An appointment scheduling system is represented by the following three classes: TimeInterval, Appointment, and DailySchedule. In this question, you will implement one method in the Appointment class and three methods in the DailySchedule class. 
 * A TimeInterval object represents a period of time. The start and end time represent the start hour and end hour. Hours range from 8 (8 am) to 17 (5 pm). The TimeInterval class provides a method to determine if another time interval overlaps with the time interval represented by the current TimeInterval object. An Appointment object contains a time interval for the appointment and a method that determines if there is a time conflict between the current appointment and another appointment. The declarations of the TimeInterval and Appointment classes are shown below.
 */

import java.util.ArrayList;

public class TimeInterval {
	private int start;
	private int end;
	/**
	 * Constructor initializes the start and end time of this interval
	 * @param s - start time
	 * @param e - end time
	 */
	public TimeInterval(int s, int e) {
		start = s;
		end = e;
	}
	/**
	 * Returns true if this time interval overlaps with
	 * another time interval
	 * @param other - another time interval
	 * @return true if this time interval overlaps with
	 * 			other, false otherwise
	 */
	public boolean overlapsWith (TimeInterval other) {
		/** implementation not shown **/
	}
	/**
	 * Returns the start time
	 * @return start time
	 */
	public int getStart() {
		return start;
	}
	/**
	 * Returns the end time
	 * @return end time
	 */
	public int getEnd() {
		return end;
	}
	/**
	 * Returns the interval as a string
	 * @return the interval as a string
	 */
	public String toString() {
		/** implementation not shown **/
	}
}


public class Appointment {
	private TimeInterval interval;
	/**
	 * Initializes the fields
	 * @param intvl - interval
	 */
	public Appointment(TimeInterval intvl) {
		interval = intvl;
	}
	/**
	 * Returns the interval
	 * @return interval
	 */
	public TimeInterval getTime() {
		return interval;
	}
	/**
	 * Returns true if the time interval of this Appointment
	 * overlaps with the time interval of other; otherwise, 
	 * returns false
	 * @param other - another appointment
	 * @return true if the time interval of this Appointment
	 * overlaps with the time interval of other, false otherwise
	 */
	public boolean conflictsWith(Appointment other) {
		/** to be implemented in part (a) **/
		return interval.overlapsWith(other.getTime());
	}
}
public class DailySchedule {
	/** to be implemented in part (b) **/
	private ArrayList<Appointment> appts;
	/**
	 * Creates a list of random appointments
	 * @param nAppts - number of appointments
	 */
	public DailySchedule(int nAppts) {
		/** to be implemented in part (c) **/
		appts = new ArrayList<Appointment>();

		for (int i = 0; i < nAppts; i++) {
			int start = (int) (Math.random() * 10) + 8;
			int end = (int) (Math.random() * 10) + 8;
			while (end <= start) {
				end = (int) (Math.random() * 10) + 8;
			}
			appts.add(new Appointment(new TimeInterval(start, end)));
		}
	}
	/**
	 * Removes and returns all appointments that overlap the given 
       * Appointment
	 * post-condition: all appointments that have a time conflict with
	 * appt have been removed from this DailySchedule 
	 * @param appt - Appointment to check
	 * @return list of removed appointments
	 */
	public ArrayList<Appointment> clearConflicts(Appointment appt) {
		/** to be implemented in part (d) **/
		ArrayList<Appointment> conflicts = new ArrayList<Appointment>();
		for (int i = 0; i < appts.size(); i++) {
			if (appts.get(i).conflictsWith(appt)) {
				conflicts.add(appts.get(i));
				appts.remove(i);
				i--;
			}
		}
		return conflicts;
	}
	/**
	 *  If emergency is true, clears any overlapping appointments and adds
	 *  appt to this DailySchedule; otherwise, if there are no conflicting
	 *  appointments, adds appt to this DailySchedule; returns true if the 
	 *  appointment was added; otherwise, returns false
	 * @param appt - appointment to add
	 * @param emergency - emergency or not
	 * @return true if the appointment was added, false otherwise
	 */
	public boolean addAppt(Appointment appt, boolean emergency) {
		/** to be implemented in part (e) **/
		if (emergency) {
			clearConflicts(appt);
			appts.add(appt);
			return true;
		} else {
			for (int i = 0; i < appts.size(); i++) {
				if (appts.get(i).conflictsWith(appt)) {
					return false;
				}
			}
			appts.add(appt);
			return true;
		}
	}
	/**
	 * Creates a list of random appointments
	 * @param nAppts - number of appointments
	 */
	public DailySchedule(int nAppts) {
	}
	/**
	 * Removes and returns all appointments that overlap the given 
 * Appointment
	 * post-condition: all appointments that have a time conflict with
	 * appt have been removed from this DailySchedule 
	 * @param appt - Appointment to check
	 * @return list of removed appointments
	 */
	public ArrayList<Appointment> clearConflicts(Appointment appt) {
		

	}
	  


}
