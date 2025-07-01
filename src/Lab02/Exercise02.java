package Lab02;

//    Cho phương trình: ax^2 + bx + c = 0
//    Viết chương trình nhập vào 3 số nguyên a, b, c. Tính toán nghiệm của phương trình trên

//    - Nếu a = 0 => làm tương tự ví dụ bài 1
//            - Nếu a # 0:
//            - Tính delta = b^2 - 4ac.
//    - Nếu delta < 0 => thông báo "phương trình vô nghiệm"
//            - Nếu delta = 0 => thông báo "nghiệm kép x = -b/(2*a)
//            - Nếu delta > 0 => thông báo có 2 nghiệm riêng biệt
//            x1 = (-b + căn(delta))/(2*a)
//    x2 = (-b - căn(delta))/(2*a)

import java.util.Scanner;

public class Exercise02 {
    public static void solveFirstDegreeEquation(int a, int b) {
        System.out.printf("Giải phương trình bậc nhất %dx + %d = 0 \n", a, b);

        if (a == 0 && b == 0) {
            System.out.println("Phương trình có vô số nghiệm");
        } else if (a == 0) {
            System.out.println("Phương trình không có nghiệm");
        } else {
            float x = (float) -b / a;
            System.out.printf("Phương trình có nghiệm = %.5f  ", x);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cho phương trình: ax^2 + bx + c = 0");

        System.out.print("Nhập vào biến a = ");
        int a = scanner.nextInt();
        System.out.print("Nhập vào biến b = ");
        int b = scanner.nextInt();
        System.out.print("Nhập vào biến c = ");
        int c = scanner.nextInt();

        System.out.printf("Giải phương trình bậc hai %dx^2 + %dx + %d = 0 \n", a, b, c);

        if (a == 0) {
            solveFirstDegreeEquation(a, b);
        } else {
            int delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                float x = (float) -b / (2 * a);
                System.out.printf("Phương vô nghiệm kép x = %.3f ", x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Phương có 2 nghiệm riêng biệt, x1=%.3f , x2 =%.3f ", x1, x2);
            }
        }

        scanner.close();
    }
}

/*
    *Cho phương trình: ax^2 + bx + c = 0
    Nhập vào biến a = 1
    Nhập vào biến b = -5
    Nhập vào biến c = 1
    Giải phương trình bậc hai 1x^2 + -5x + 1 = 0
    Phương có 2 nghiệm riêng biệt, x1=4.791 , x2 =0.209
* */
