package oop.encapsulation.useClass;

import oop.encapsulation.Student;

public class useClassStudent {
    public static void main(String[] args) {
        System.out.println("Use class student");

        Student student1 = new Student();
        Student student2 = new Student("Eric", 26);

        student1.setName("LamLDM");
        student1.setAge(29);
        student1.setAge(29);

        System.out.println("Check student 1: " + student1.getName() + " and age: " + student1.getAge());
        System.out.println("Check student 2: " + student2.getName() + " and age: " + student2.getAge());
    }
}

/*
    Use class student
    Check student 1: LamLDM and age: 29
    Check student 2: Eric and age: 26
* */
