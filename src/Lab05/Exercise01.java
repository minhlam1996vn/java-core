package Lab05;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> arrNumber = new ArrayList<>();

        while (true) {
            System.out.print("Nhập vào 1 số thực bất kỳ: ");
            double input = scanner.nextDouble();
            arrNumber.add(input);
            scanner.nextLine(); // enter

            System.out.print("Continue ? Y or N ??? ");
            String option = scanner.nextLine();
            if (option.equals("N") || option.equals("n")) {
                break;
            }

        }

        System.out.println(" check array: " + arrNumber);
        double sum = 0;
        for (int i = 0; i < arrNumber.size(); i++) {
            sum += arrNumber.get(i);
        }

        System.out.println("sum array= " + sum);

        scanner.close();
    }
}

/*
    Nhập vào 1 số thực bất kỳ: 10
    Continue ? Y or N ??? y
    Nhập vào 1 số thực bất kỳ: 20
    Continue ? Y or N ??? y
    Nhập vào 1 số thực bất kỳ: 30
    Continue ? Y or N ??? y
    Nhập vào 1 số thực bất kỳ: 40
    Continue ? Y or N ??? n
     check array: [10.0, 20.0, 30.0, 40.0]
    sum array= 100.0
* */
