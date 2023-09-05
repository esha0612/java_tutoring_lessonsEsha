interface Eat{
    static void eat() {
        System.out.println("Eating");
    };
}

interface Move{
    static void run() {
        System.out.println("Moving");
    };
}

interface Sleep{
    int duration = 8;
    void sleep();
}

class Animal implements Eat, Move, Sleep{
    public void sleep() {
        System.out.println("Sleeping");
    }
}

class Tree implements Sleep{
    public void sleep() {
        System.out.println("Sleeping");
    }
}

public class Multiple_Inheritance {
    public static void main(String[] args) {
        Eat.eat();
        Move.run();

        Animal a = new Animal();
        a.sleep();
        Tree t = new Tree();
        t.sleep();
    }
}