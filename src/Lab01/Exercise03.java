package Lab01;

//  Viết chương trình nhập vào bàn phím cạnh của một khối lập phương.
//  Tính và xuất ra thể tích của hình lập phương.

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the cube edge: ");
        int edge = scanner.nextInt();

        double volume = Math.pow(edge, 3);
        System.out.println("Volume: " + volume);

        scanner.close();
    }
}

/*
    Enter the cube edge:
    3
    Volume: 27.0
* */
