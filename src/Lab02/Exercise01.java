package Lab02;

//    Cho phương trình ax + b = 0
//    Viết chương trình nhập vào 2 số nguyên a và b. Tính toán nghiệm của phương trình trên

//    - Nếu a = 0, b = 0 => thông báo "phương trình có vô số nghiệm"
//    - Nếu a = 0, b # 0 => thông báo "phương trình vô nghiệm"
//    - Còn lại: x = -b/a => thông báo x = ?

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cho phương trình ax + b = 0");

        System.out.print("Nhập vào biến a = ");
        int a = scanner.nextInt();
        System.out.print("Nhập vào biến b = ");
        int b = scanner.nextInt();

        System.out.printf("Giải phương trình bậc nhất %dx + %d = 0 \n", a, b);

        if (a == 0 && b == 0) {
            System.out.println("Phương trình có vô số nghiệm");
        } else if (a == 0) {
            System.out.println("Phương trình không có nghiệm");
        } else {
            float x = (float) -b / a;
            System.out.printf("Phương trình có nghiệm = %.5f \n", x);
        }

        scanner.close();
    }
}

/*
    Cho phương trình ax + b = 0
    Nhập vào biến a = 1
    Nhập vào biến b = -2
    Giải phương trình bậc nhất 1x + -2 = 0
    Phương trình có nghiệm = 2.00000
* */
