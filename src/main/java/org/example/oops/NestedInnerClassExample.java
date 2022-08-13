package org.example.oops;

public class NestedInnerClassExample {

    /*
    https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html
     */

    private static final String name = "NestedInnerClassExample";
    private String innerVariable;

    public NestedInnerClassExample(String value){
        innerVariable = value;
    }

    public static class NestedStaticClass {
        private String name;

        public NestedStaticClass() {
        }

        public NestedStaticClass(String name) {
            this.name = name;
        }

        void display(String message) {
            System.out.println("From: " + NestedStaticClass.class.getCanonicalName() + ", message: " + message);
            System.out.println("From: " + NestedStaticClass.class.getCanonicalName() + ", name: " + name);
            System.out.println("From: " + NestedStaticClass.class.getCanonicalName() + ", outer class name: " + NestedInnerClassExample.name);
           /* this will give error,
            System.out.println("From: " + NestedStaticClass.class.getCanonicalName() + ", outer class name: " + innerVariable);
            */
        }
    }

    public class NestedInnerClass {
        private String name;
        private static final String INNER_CLASS_NAME = "NestedInnerClass";

        public NestedInnerClass() {
        }

        public NestedInnerClass(String name) {
            this.name = name;
        }

        void display(String message) {
            System.out.println("From: " + this.getClass().getCanonicalName() + ", message: " + message);
            System.out.println("From: " + this.getClass().getCanonicalName() + ", name: " + name);
            System.out.println("From: " + this.getClass().getCanonicalName() + ", outer class name: " + NestedInnerClassExample.name);
            System.out.println("From: " + this.getClass().getCanonicalName() + ", outer class var: " + innerVariable);
            System.out.println("From: " + this.getClass().getCanonicalName() + ", INNER_CLASS_NAME: " + INNER_CLASS_NAME);
            Object obj = NestedInnerClassExample.this;
            System.out.println("Object: "+obj);
            NestedInnerClassExample.this.display("inner calling outer class display");
        }
    }

    void display(String message) {
        System.out.println("From: " + this.getClass().getCanonicalName() + ", message: " + message);
        System.out.println("From: " + this.getClass().getCanonicalName() + ", name: " + name);
        System.out.println("From: " + this.getClass().getCanonicalName() + ", innerVariable: "+ innerVariable);
    }
}
