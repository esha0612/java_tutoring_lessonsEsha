// package 28thNov;

import java.util.ArrayList;

class Student {
    private String name;
    private int rollNo;
    private int marks;

    public Student() {
        this.name = "";
        this.rollNo = 0;
        this.marks = 0;
    }

    public Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public Student(Student obj) {
        this.name = obj.name;
        this.rollNo = obj.rollNo;
        this.marks = obj.marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return this.name;
    }

    public int getRollNo() {
        return this.rollNo;
    }

    public int getMarks() {
        return this.marks;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("Marks: " + this.marks);
    }
}

class Roster {
    private ArrayList<Student> students;
    private int size;

    public Roster() {
        this.students = new ArrayList<Student>();
        this.size = 0;
    }

    public Roster(int size) {
        this.students = new ArrayList<Student>(size);
        this.size = 0;
    }

    public Roster(Roster obj) {
        this.students = obj.students;
        this.size = obj.size;
    }

    // adds a student to the roster
    public void addStudent(Student s) {
        // YOUR CODE HERE
        this.students.add(s);
    }

    // removes a student from the roster
    public void removeStudent(int rollNo) {
        // YOUR CODE HERE
        for (int i = 0; i < this.students.size(); i++) {
            if (this.students.get(i).getRollNo() == rollNo) {
                this.students.remove(i);
                break;
            }
        }
    }

    // returns the student with the highest marks
    public Student getTopper() {
        // YOUR CODE HERE

        int highestMarks = 0;
        Student topper = new Student();
        for (int i = 0; i < this.students.size(); i++) {
            if (this.students.get(i).getMarks() > highestMarks) {
                highestMarks = this.students.get(i).getMarks();
                topper = this.students.get(i);
            }
        }
        return topper;
    }

    // returns the student with the lowest marks
    public Student getBackbencher() {
        // YOUR CODE HERE
        int lowestMarks = 100;
        Student backbencher = new Student();
        for (int i = 0; i < this.students.size(); i++) {
            if (this.students.get(i).getMarks() < lowestMarks) {
                lowestMarks = this.students.get(i).getMarks();
                backbencher = this.students.get(i);
            }
        }

        return backbencher;
    }

    // returns the average marks of the class
    public double getAverageMarks() {
        // YOUR CODE HERE
        double average = 0.0;
        for (int i = 0; i < this.students.size(); i++) {
            average += this.students.get(i).getMarks();
        }
        return average/this.students.size();
    }

    // returns the number of students who have scored more than @param:marks marks
    public int getNoOfStudentsAbove(int marks) {
        // YOUR CODE HERE
        int count = 0;
        for (int i = 0; i < this.students.size(); i++) {
            count += this.students.get(i).getMarks() > marks ? 1 : 0;
        }
        return count;
    }

    // returns the percentage of students who have passed the exam if the passing marks are @param:marks
    public double getPassPercentage(int marks) {
        // YOUR CODE HERE
        return (double) this.getNoOfStudentsAbove(marks) / this.students.size() * 100;
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("A", 1, 90);
        Student s2 = new Student("B", 2, 80);
        Student s3 = new Student("C", 3, 70);
        Student s4 = new Student("D", 4, 60);
        Student s5 = new Student("E", 5, 50);
        Student s6 = new Student("F", 6, 40);
        Student s7 = new Student("G", 7, 30);
        Student s8 = new Student("H", 8, 20);
        Student s9 = new Student("I", 9, 10);
        Student s10 = new Student("J", 10, 0);

        Roster r1 = new Roster(10);
        r1.addStudent(s1);
        r1.addStudent(s2);
        r1.addStudent(s3);
        r1.addStudent(s4);
        r1.addStudent(s5);
        r1.addStudent(s6);
        r1.addStudent(s7);
        r1.addStudent(s8);
        r1.addStudent(s9);
        r1.addStudent(s10);

        System.out.println("Topper: ");
        r1.getTopper().display();
        System.out.println("Backbencher: ");
        r1.getBackbencher().display();
        System.out.println("Average Marks: " + r1.getAverageMarks());
        System.out.println("No of students above 50: " + r1.getNoOfStudentsAbove(50));
        System.out.println("Pass Percentage: " + r1.getPassPercentage(50));
    }
}
