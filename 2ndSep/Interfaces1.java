interface A{
    void meth1();
    void meth2();
}

interface B extends A{
    void meth3();
}

public class Interfaces1 implements B{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public static void main(String[] args) {
        Interfaces1 obj = new Interfaces1();
        obj.meth1();
        obj.meth2();
        obj.meth3();
    }
}
