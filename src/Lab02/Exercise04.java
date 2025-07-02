package Lab02;

import java.util.Scanner;

public class Exercise04 {
    public static void Ex01() {
        System.out.println(">> LỰA CHỌN TÍNH NĂNG 1 <<");
    }

    public static void Ex02() {
        System.out.println(">> LỰA CHỌN TÍNH NĂNG 2 <<");
    }

    public static void Ex03() {
        System.out.println(">> LỰA CHỌN TÍNH NĂNG 3 <<");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
        System.out.println("++ ----------------------------------------- ++");
        System.out.println("| 1. Giải phương trình bậc nhất              |");
        System.out.println("| 2. Giải phương trình bậc hai               |");
        System.out.println("| 3. Tính số tiền điện                       |");
        System.out.println("| 4. Kết thúc                                |");
        System.out.println("++ ------------------ ++");

        System.out.print("Lựa chọn của bạn: ");
        int x = scanner.nextInt();

        switch (x) {
            case 1:
                Ex01();
                break;
            case 2:
                Ex02();
                break;
            case 3:
                Ex03();
                break;
            default:
                System.out.println(">> Bạn đã thoát chương trình <<");
                System.exit(0);
        }

        scanner.close();
    }
}

/*
    >> LỰA CHỌN TÍNH NĂNG <<
    ++ ----------------------------------------- ++
    | 1. Giải phương trình bậc nhất              |
    | 2. Giải phương trình bậc hai               |
    | 3. Tính số tiền điện                       |
    | 4. Kết thúc                                |
    ++ ------------------ ++
    Lựa chọn của bạn: 1
    >> LỰA CHỌN TÍNH NĂNG 1 <<
* */
