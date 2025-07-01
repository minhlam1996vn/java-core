package condition;

import java.util.Scanner;

public class Condition03 {
    public static void main(String[] args) {
        System.out.println(">> SELECT FUNCTION <<");
        System.out.println("++ ----------------------------------------- ++");
        System.out.println("| 1. Solve linear equation           |");
        System.out.println("| 2. Solve quadratic equation        |");
        System.out.println("| 3. Calculate electricity bill      |");
        System.out.println("| 4. Exit                            |");
        System.out.println("++ ------------------ ++");

        System.out.print("Your choice is: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        switch (value) {
            case 1:
                System.out.println("You have selected linear equation solving");
                break;
            case 2:
                System.out.println("You have selected quadratic equation solving");
                break;
            default:
                System.out.println("You have chosen to exit the program");
                System.exit(0);
        }

        int value1 = scanner.nextInt();
        System.out.println(value1);

        scanner.close();
    }
}

/*
    >> SELECT FUNCTION <<
    ++ ----------------------------------------- ++
    | 1. Solve linear equation           |
    | 2. Solve quadratic equation        |
    | 3. Calculate electricity bill      |
    | 4. Exit                            |
    ++ ------------------ ++
    Your choice is: 1
    You have selected linear equation solving
    2
    2
 * */
