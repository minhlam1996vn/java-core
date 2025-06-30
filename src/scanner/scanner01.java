package scanner;

import java.util.Scanner;

public class scanner01 {

    //  Bước 1: Tạo đối tượng Scanner
    //      Scanner scanner = new Scanner(System.in);
    //  Bước 2: sử dụng các phương thức được cung cấp sẵn
    //      scanner.nextLine() => nhận 1 dòng nhập từ bàn phím => trả ra dữ liệu string
    //      scanner.nextInt() => nhận 1 số nguyên từ bàn phím => trả ra dữ liệu số nguyên
    //      scanner.nextDouble() => nhận 1 số thực từ bàn phím => trả ra dữ liệu số thực

    //  Khai báo 2 biến name và age.
    //  Nhập name và age từ bàn phím
    //  Sử dụng 3 hàm trên để in ra màn hình:
    //  My name is <name>, age = <age>

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your name is: ");
        String name = scanner.nextLine();
        System.out.println("Your age is: ");
        int age = scanner.nextInt();
        System.out.println("My name is " + name + ", age = " + age);
        scanner.close();
    }
}

/*
    Your name is:
    LamLDM
    Your age is:
    29
    My name is LamLDM, age = 29
* */
