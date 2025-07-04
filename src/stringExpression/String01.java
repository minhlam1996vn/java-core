package stringExpression;

//    https://www.w3schools.com/java/java_strings_specchars.asp

//    Nhập username và password từ bàn phím. Nếu username = "admin" và password > 6 ký tự thì hợp lệ

import java.util.Scanner;

public class String01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào username: ");
        String username = scanner.nextLine();

        System.out.print("Nhập vào password: ");
        String password = scanner.nextLine();

        System.out.println("username: " + username + ", password: " + password);

        if (username.equals("admin") && password.length() > 6) {
            System.out.print("Valid input");
        }

        scanner.close();
    }
}

/*
    Nhập vào username: admin
    Nhập vào password: 123123123
    username: admin, password: 123123123
    Valid input
* */
