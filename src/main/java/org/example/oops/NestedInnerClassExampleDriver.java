package org.example.oops;

public class NestedInnerClassExampleDriver {

    public static void main(String[] args) {

        NestedInnerClassExample.NestedStaticClass nestedStaticClass1 = new NestedInnerClassExample.NestedStaticClass();
        nestedStaticClass1.display(" nested static class example");

        NestedInnerClassExample.NestedStaticClass nestedStaticClass2 = new NestedInnerClassExample.NestedStaticClass("with name");
        nestedStaticClass2.display(" nested static class example");

        System.out.println("****************************************************************");


        NestedInnerClassExample outer = new NestedInnerClassExample("outer-variable");
        NestedInnerClassExample.NestedInnerClass nestedInnerClass1 =  outer.new NestedInnerClass();
        nestedInnerClass1.display(" nested inner class example");
        System.out.println("****************************************************************");

        NestedInnerClassExample.NestedInnerClass nestedInnerClass2 = outer.new NestedInnerClass("with name");
        nestedInnerClass2.display(" nested inner class example");

        System.out.println("****************************************************************");

        outer.display("outer-display");



    }


}
