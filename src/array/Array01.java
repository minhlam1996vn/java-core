package array;

//    https://www.w3schools.com/java/java_arrays.asp

import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {
        String[] clubs = {"MU", "Man city", "Liverpool"};
        clubs[0] = "Arsenal";

        System.out.println("run hear array white length: " + clubs.length);
        System.out.println("run hear array: " + Arrays.toString(clubs));
        System.out.println("run hear array: first element = " + clubs[0]);

        System.out.println("================");

        String[] a = new String[5];
        a[0] = "ABC";
        System.out.println("run hear array white length: " + a.length);
        System.out.println("run hear array: " + Arrays.toString(a));
        System.out.println("run hear array: first element = " + a[1]);
    }
}
