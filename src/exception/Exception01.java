package exception;

import java.util.Scanner;

public class Exception01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Nhập x = ");
            try {
                int x = sc.nextInt();
                try {
                    System.out.println("Kết quả 10/x = " + 10 / x);
                    break;
                } catch (Exception e) {
                    // TODO: handle exception
                }

            } catch (Exception e) {
                sc.next();
                System.out.println("Run error: " + e.getMessage());
            }
        }
    }
}

/*
    Nhập x =
    2
    Kết quả 10/x = 5
* */
