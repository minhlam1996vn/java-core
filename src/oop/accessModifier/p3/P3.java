package oop.accessModifier.p3;

//    https://stackoverflow.com/questions/215497/what-is-the-difference-between-public-protected-package-private-and-private-in

import oop.accessModifier.p1.P;

public class P3 extends P {
    private void test() {
        P firstObj = new P();
        firstObj.a = 10;
//        firstObj.b = 20; // Er: default
        super.c = 20;
//        firstObj.d = 40; // ER: d is private
    }

    public static void main(String[] args) {
    }
}
