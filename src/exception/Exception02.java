package exception;

//  https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html

//  https://docs.oracle.com/javase/tutorial/essential/exceptions/declaring.html
//  https://stackoverflow.com/questions/18491020/what-does-throws-do-and-how-is-it-helpful

import java.util.Scanner;

public class Exception02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int x = scanner.nextInt();
            System.out.println("Run try");
        } catch (Exception e) {
            System.out.println("Run catch");
        } finally {
            System.out.println("Run finally");
            scanner.close();
        }

//        try (Scanner scanner = new Scanner(System.in)) {
//            int x = scanner.nextInt();
//        }
    }
}

/*
    1
    Run try
    Run finally
* */
