// We have a class Student which stores basic info about a student.
// This would be an ID, a Subject and a Score.

import java.util.ArrayList;
import java.util.List;

class Student {
    private int id;
    private String subject;
    private int score;
    private char grade;

    public Student(int id, String subject, int score) {
        this.id = id;
        this.subject = subject;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public int getScore() {
        return score;
    }

    public char getGrade() {
        return grade;
    }

    public void assignGrade() {
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }
}


public class Streaming_Ex1 {
    public static void main (String[] args) {
        // Let's create a list of students
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(1, "Maths", 90));
        students.add(new Student(2, "Maths", 80));
        students.add(new Student(3, "Maths", 70));
        students.add(new Student(4, "Maths", 60));
        students.add(new Student(5, "Maths", 50));
        students.add(new Student(6, "Maths", 40));
        students.add(new Student(7, "Maths", 30));
        students.add(new Student(8, "Maths", 20));
        students.add(new Student(9, "Maths", 10));
        students.add(new Student(10, "Maths", 0));

        // We want to assign grades to each student
        // Let's try using a stream
        students.stream().forEach(student -> student.assignGrade());

        // We want to count the number of students with grade F (fail)
        // Let's try using a stream
        System.out.println("Number of students with grade F: " + students.stream().filter(student -> student.getGrade() == 'F').count());
    }
}
