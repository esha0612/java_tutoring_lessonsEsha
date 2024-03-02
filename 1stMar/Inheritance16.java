class A { 
    void m1() {
        System.out.println("m1 in class A");	 
    }
}
class B extends A {
    void m1() {
        System.out.println("m1 in class B");	 
    }
}
public class Inheritance16 {
    public static void main(String[] args) 
    {
        B b = new B();
        b.m1(); 

        A a = new A();
        a.m1();

        A a2 = new B();
        a2.m1();
    }
}