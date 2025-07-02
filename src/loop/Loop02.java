package loop;

//    https://www.w3schools.com/java/java_while_loop.asp

public class Loop02 {
    public static void main(String[] args) {
        int i = 3;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("============");

        int k = 3;
        do {
            System.out.println(k);
            k++;
        } while (k < 5);
    }
}

/*
    3
    4
    ============
    3
    4
* */
