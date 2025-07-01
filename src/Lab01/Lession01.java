package Lab01;

//  Viết chương trình cho phép nhập tên sinh viên, điểm trung bình từ bàn phím.
//  In ra màn hình với định dạng: <tên_sinh_viên> có điểm = <điểm>

import java.util.Scanner;

public class Lession01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your name is: ");
        String name = sc.nextLine();
        System.out.println("Average score: ");
        double score = sc.nextDouble();
        System.out.println(name + "'s average score: " + score);
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
