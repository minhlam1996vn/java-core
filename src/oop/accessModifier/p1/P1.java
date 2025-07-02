package oop.accessModifier.p1;

public class P1 {
    public static void main(String[] args) {
        P firstObj = new P();
        firstObj.a = 10;
        firstObj.b = 20;
        firstObj.c = 30;
//        firstObj.d = 40; // ER: d is private

        System.out.println("a = " + firstObj.a + ", b = " + firstObj.b + ", c = " + firstObj.c);
    }
}

/*
    a = 10, b = 20, c = 30
* */
