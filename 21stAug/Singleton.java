// Source code is decompiled from a .class file using FernFlower decompiler.
// This is another use case for private constructors, where we use a static method to return an instance of the class.
// This is useful when we want to make sure that only one instance of the class is created.
// This is called the Singleton pattern.
// This is a very common pattern in Java, and is used in many places, such as the java.lang.Runtime class.

public class Singleton {
   private static Singleton instance;
   private String info = "This is a Singleton class";

   private Singleton() {
   }

   public static Singleton getInstance() {
      if (instance == null) {
         instance = new Singleton();
      }
      return instance;
   }

   public String getInfo() {
      return this.info;
   }
}
