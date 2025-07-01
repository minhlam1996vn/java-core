package Lab01;

//  Viết chương trình nhập vào bàn phím cạnh của một khối lập phương.
//  Tính và xuất ra thể tích của hình lập phương.

import java.util.Scanner;

public class Lession03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cube edge: ");
        int edge = sc.nextInt();

        System.out.println("Volume: " + Math.pow(edge, 3));
        sc.close();
    }
}

/*
    Your name is:
    LamLDM
    Average score:
    9.5
    LamLDM's average score: 9.5
* */
