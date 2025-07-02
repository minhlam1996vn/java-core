package loop;

//    https://www.w3schools.com/java/java_break.asp

public class Loop03 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("===========");

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}

/*
    0
    1
    2
    3
    ===========
    0
    1
    2
    3
    5
    6
    7
    8
    9
 * */
