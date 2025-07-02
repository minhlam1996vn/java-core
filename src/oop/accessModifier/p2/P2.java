package oop.accessModifier.p2;

import oop.accessModifier.p1.P;

public class P2 {
    public static void main(String[] args) {
        P firstObject = new P();
        firstObject.a = 10;
//        firstObj.b = 20; // Er: default
//        firstObj.c = 30; // Er: protected
//        firstObj.d = 40; // ER: d is private

        System.out.println(firstObject.a);
    }
}

/*
    10
* */
