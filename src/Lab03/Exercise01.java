package Lab03;

//    Viết chương trình nhập vào 1 số nguyên từ bàn phím. Hiển thị kết quả số đấy là số nguyên tố hay không ?

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        System.out.println("Chương trình kiểm tra số nguyên tố");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên bất kỳ: ");
        int value = scanner.nextInt();

        int count = 0;
        for (int i = 1; i <= value - 1; i++) {
            if (value % i == 0) {
                System.out.println("Ước số khác: " + i);
                count++;
//                break;
            }
        }
        if (count == 0) {
            System.out.printf("%d là số nguyên tố", value);
        } else {
            System.out.printf("%d không là số nguyên tố", value);
        }

        scanner.close();
    }
}

/*
    Chương trình kiểm tra số nguyên tố
    Nhập vào một số nguyên bất kỳ: 6
    Ước số khác: 1
    Ước số khác: 2
    Ước số khác: 3
    6 không là số nguyên tố
* */
