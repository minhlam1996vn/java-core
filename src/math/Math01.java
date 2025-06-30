package math;

//  https://www.w3schools.com/java/java_math.asp
//  https://www.w3schools.com/java/java_ref_math.asp

import java.util.Scanner;

public class Math01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First number:");
        int firstNumber = sc.nextInt();

        System.out.println("Second number:");
        int secondNumber = sc.nextInt();

        System.out.println("Min = " + Math.min(firstNumber, secondNumber));

        sc.close();
    }
}

/*
    First number:
    10
    Second number:
    15
    Min = 10
* */
