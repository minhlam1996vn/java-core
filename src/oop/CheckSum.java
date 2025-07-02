package oop;

public class CheckSum {
    int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        CheckSum obj = new CheckSum();
        int sum = obj.sum(6, 9);
        System.out.println("Check sum = " + sum);
    }
}

/*
    Check sum = 15
* */
