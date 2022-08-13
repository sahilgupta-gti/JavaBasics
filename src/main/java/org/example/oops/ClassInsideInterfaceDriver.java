package org.example.oops;

public class ClassInsideInterfaceDriver {


    public static void main(String[] args) {

        ClassInsideInterface ci1 = new ClassInsideInterface.ClassInsideInterface1();
        ci1.printName("driver code");
        ci1.printName("");

        ClassInsideInterface ci2 = new ClassInsideInterface.ClassInsideInterface2();
        ci2.printName("driver code");

    }
}
