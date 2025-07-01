package Lab01;

//  Viết chương trình nhập từ bàn phím 2 cạnh của 1 hình chữ nhật.
//  Tính toán và in ra console:
//      - chu vi hình chữ nhật
//      - diện tích hình chữ nhật
//      - cạnh nhỏ nhất của hình chữ nhật

import java.util.Scanner;

public class Lession02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        int length = sc.nextInt();
        System.out.println("Enter rectangle width: ");
        int width = sc.nextInt();

        int perimeterOfRectangle = (length + width) * 2;

        System.out.println("The perimeter of the rectangle is: " + perimeterOfRectangle);
        System.out.println("The area of the rectangle is: " + length * width);
        System.out.println("Smallest side of a rectangle: " + Math.min(length, width));

        sc.close();
    }
}

/*
    Enter the length of the rectangle:
    2
    Enter rectangle width:
    4
    The perimeter of the rectangle is: 12
    The area of the rectangle is: 48
    Smallest side of a rectangle: 2
* */
