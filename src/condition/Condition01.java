package condition;

//    https://www.w3schools.com/java/java_conditions.asp

import java.util.Random;

public class Condition01 {
    public static void main(String[] args) {
        Random random = new Random();
        int score = random.nextInt(10);

        if (score > 4) {
            System.out.println("score: " + score);
            System.out.println("pass");
        } else {
            System.out.println("not pass");
        }
    }
}

/*
    score: 6
    pass
* */
