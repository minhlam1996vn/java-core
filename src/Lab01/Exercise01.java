package Lab01;

//  Viết chương trình cho phép nhập tên sinh viên, điểm trung bình từ bàn phím.
//  In ra màn hình với định dạng: <tên_sinh_viên> có điểm = <điểm>

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        System.out.println("Enter score: ");
        int score = scanner.nextInt();

        System.out.println(name + " have points = " + score);

        scanner.close();
    }
}

/*
    Enter name:
    Lâm
    Enter score:
    10
    Lâm have points = 10
* */
