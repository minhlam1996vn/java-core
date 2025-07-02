package oop;

public class UseStudent {
    public static void main(String[] args) {
        System.out.println("Use Student");

        Student student = new Student();
        student.name = "Eric";
        student.age = 25;

        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
    }
}
