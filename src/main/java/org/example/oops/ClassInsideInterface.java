package org.example.oops;

public interface ClassInsideInterface {

    String NAME = "ClassInsideInterface";

    void printName(String name);

    class ClassInsideInterface1 implements ClassInsideInterface {

        @Override
        public void printName(String name) {
            if (name == null || name.equals("")) {
                System.out.println("name1 : " + ClassInsideInterface.NAME);
                return;
            }
            System.out.println("name1 : " + name);
        }
    }

    class ClassInsideInterface2 implements ClassInsideInterface {
        @Override
        public void printName(String name) {
            System.out.println("name2 : " + ClassInsideInterface.NAME);
        }
    }
}
