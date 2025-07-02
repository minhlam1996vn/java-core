package array;

import java.util.Arrays;

public class Array03 {
    public static void main(String[] args) {
        int[] clubs = {5, 10, 1, 16, 3,};
        for (int i = 0; i < clubs.length; i++) {
            for (int j = i + 1; j < clubs.length; j++) {
                if (clubs[i] > clubs[j]) {
                    int temp = clubs[i];
                    clubs[i] = clubs[j];
                    clubs[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(clubs));

        System.out.println("====================");

        int[] numbers = {5, 10, 1, 16, 3,};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}

/*
    [1, 3, 5, 10, 16]
    ====================
    [1, 3, 5, 10, 16]
* */
