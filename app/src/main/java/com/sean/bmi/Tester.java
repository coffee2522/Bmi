package com.sean.bmi;

import com.sean.bmi.hello.Person;
import com.sean.bmi.hello.Student;

public class Tester {
    public static void main(String[] args) {
        Student stu = new Student("001","Sean",90,60);
        Student stu1 = new Student("004","Eric",35,60);
        stu.print();
        stu1.print();
        /*stu.setId("001");
        stu.setName("Sean");
        stu.setMath(90);
        stu.setEnglish(60);*/

//        System.out.println("Hello word");
        /* Person person = new Person();
         person.hello();
         person.hello("Sean");
         person.setWeight(66);
         person.setHeight(1.7f);
         System.out.println(person.bmi());*/

    }
}
