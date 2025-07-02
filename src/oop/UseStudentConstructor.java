package oop;

public class UseStudentConstructor {
    public static void main(String[] args) {
        System.out.println("Use student constructor");
        StudentConstructor student = new StudentConstructor();
        StudentConstructor student2 = new StudentConstructor("Eric", 26);

        System.out.println("Check obj 1: " + student.name + " and age: " + student.age);
        System.out.println("Check obj 2: " + student2.name + " and age: " + student2.age);
    }
}
