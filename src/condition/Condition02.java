package condition;

//    https://www.w3schools.com/java/java_switch.asp

import java.util.Scanner;

public class Condition02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day of the day in numbers: ");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

        scanner.close();
    }
}

/*
    Enter the day of the day in numbers: 5
    Friday
* */
