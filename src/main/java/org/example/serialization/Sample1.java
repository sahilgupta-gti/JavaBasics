package org.example.serialization;

import java.io.*;

public class Sample1 implements Serializable {

    private static final long serialVersionUID = -3557282790114991445L;
    private String name;
    private int age;
    private int height;

    public Sample1(String name, int age, int height) {
        if(age == height) {
            throw new IllegalArgumentException("age and height must not be same");
        }
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Sample1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Sample1 s1 = new Sample1("ram", 10, 10);
//        //Write object
//        OutputStream os = new BufferedOutputStream(new FileOutputStream("sample1.ser"));
//        ObjectOutputStream objs = new ObjectOutputStream(os);
//        objs.writeObject(s1);
//        objs.flush();
//        objs.close();

        /*
        Deserialization uses no args constructor, hence it will not throw an exception while constructing an object as
        per below code.
        Refer - https://docs.oracle.com/en/java/javase/15/serializable-records/index.html
        Its one of the difference between records and normal classes.
         */

        InputStream ins = new BufferedInputStream(new FileInputStream("sample1.ser"));
        ObjectInputStream ois = new ObjectInputStream(ins);
        Sample1 s2 = (Sample1)ois.readObject();
        System.out.println(s2);
    }

}
