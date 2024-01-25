// This is a demo to show how to resolve time overlap conflicts
// Workday is from 9 to 17 (9am to 5pm)
// Teachers can put in a request for a class in that time frame, star and end time must be an integer
// If there is a conflict, the program will keep the shorter duration class

// This represents a request for a class, with a start time, end time, and name

import java.util.ArrayList;

class ClassRequest {
    private int start;
    private int end;
    private String name;

    public ClassRequest(int start, int end, String name) {
        this.start = start;
        this.end = end;
        this.name = name;
    }

    public int getStart() { return start; }
    public int getEnd() { return end; }
    public String getName() { return name; }
}

// This represents a Teacher and a list of classes they want to teach
class Teacher {
    private String name;
    private ArrayList<ClassRequest> requests;

    public Teacher(String name) {
        this.name = name;
        requests = new ArrayList<ClassRequest>();
    }

    public void addRequest(ClassRequest request) {
        requests.add(request);
    }

    public String getName() { return name; }
    public ArrayList<ClassRequest> getRequests() { return requests; }
}

// This class stores a list of teachers and will merge their requests into a daily roster of classes
public class ConflictManagement {
    private ArrayList<Teacher> teachers;
    private ArrayList<ClassRequest> roster;

    public ConflictManagement() {
        teachers = new ArrayList<Teacher>();
        roster = new ArrayList<ClassRequest>();
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void printRoster() {
        for (ClassRequest request : roster) {
            System.out.println(request.getName() + " " + request.getStart() + " " + request.getEnd());
        }
    }

    public void generateRandomRequests() {
        for (Teacher teacher : teachers) {
            for (int i = 0; i < 5; i++) {
                int start = (int)(Math.random() * 8) + 9;
                int end = start + (int)(Math.random() * 3) + 1;
                teacher.addRequest(new ClassRequest(start, end, teacher.getName()));
            }
        }
    }

    public void mergeRequests() {
        for (Teacher teacher : teachers) {
            for (ClassRequest request : teacher.getRequests()) {
                if (roster.size() == 0) {
                    roster.add(request);
                } else {
                    boolean conflict = false;
                    for (int i = 0; i < roster.size(); i++) {
                        ClassRequest current = roster.get(i);
                        if (request.getStart() >= current.getStart() && request.getStart() < current.getEnd()) {
                            conflict = true;
                            if (request.getEnd() < current.getEnd()) {
                                roster.set(i, request);
                            }
                        }
                    }
                    if (!conflict) {
                        roster.add(request);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        ConflictManagement manager = new ConflictManagement();
        manager.addTeacher(new Teacher("Mr. Smith"));
        manager.addTeacher(new Teacher("Ms. Jones"));
        manager.addTeacher(new Teacher("Mr. Lee"));
        manager.addTeacher(new Teacher("Ms. Brown"));
        manager.generateRandomRequests();
        manager.mergeRequests();
        manager.printRoster();
    }
}
