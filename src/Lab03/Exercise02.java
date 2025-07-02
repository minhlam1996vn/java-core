package Lab03;

//    Viết bảng cửu chương của 1 số nguyên bất kỳ

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        System.out.println("Chương trình tạo bảng cửu chương");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào 1 số nguyên bất kỳ: ");
        int x = scanner.nextInt();

        if (x <= 1 || x >= 10) {
            System.out.println("Số không hợp lệ");
            System.exit(0);
        }

        for (int i = 1; i <= 10; i++) {
            System.out.printf(" %d x %d = %d ", x, i, x * i);
            System.out.print("\n");
        }

        scanner.close();
    }
}

/*
    Chương trình tạo bảng cửu chương
    Nhập vào 1 số nguyên bất kỳ: 2
     2 x 1 = 2
     2 x 2 = 4
     2 x 3 = 6
     2 x 4 = 8
     2 x 5 = 10
     2 x 6 = 12
     2 x 7 = 14
     2 x 8 = 16
     2 x 9 = 18
     2 x 10 = 20
* */
