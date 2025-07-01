package Lab01;

//  Viết chương trình nhập từ bàn phím 2 cạnh của 1 hình chữ nhật.
//  Tính toán và in ra console:
//      - chu vi hình chữ nhật
//      - diện tích hình chữ nhật
//      - cạnh nhỏ nhất của hình chữ nhật

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width of the rectangle:");
        int length = scanner.nextInt();

        System.out.println("Enter the length of the rectangle:");
        int width = scanner.nextInt();

        int perimeter = (length + width) * 2;
        int acreage = (length * width);
        int edgeMin = Math.min(length, width);

        System.out.println("Perimeter = " + perimeter);
        System.out.println("Acreage = " + acreage);
        System.out.println("Edge Min = " + edgeMin);

        scanner.close();
    }
}

/*
    Enter the width of the rectangle:
    4
    Enter the length of the rectangle:
    2
    Perimeter = 12
    Acreage = 8
    Edge Min = 2
* */
