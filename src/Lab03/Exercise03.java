package Lab03;

//    Viết chương trình nhập vào 1 mảng số nguyên bất kỳ:
//    - Sắp xếp và xuất mảng vừa nhập ra màn hình
//    - Xuất phần tử có giá trị nhỏ nhất
//    - Xuất phần tử có giá trị lớn nhất

//    Gợi ý:
//    - Sử dụng Arrays.sort
//    - Sử dụng Math.min, Math.max

import java.util.Arrays;
import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của array: ");
        int size = sc.nextInt();
        int[] a = new int[size];

        System.out.println("Nhập giá trị cho từng phần tử: ");
        for (int i = 0; i < size; i++) {
            System.out.print("item[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        System.out.println("Array ban đầu: " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Array sắp xếp: " + Arrays.toString(a));

        System.out.println("max = " + a[a.length - 1]);
        System.out.println("min = " + a[0]);

//        int max = a[0];
//        for (int i = 0; i < a.length; i++) {
//            max = Math.max(max, a[i]);
//        }
//
//        int min = a[0];
//        for (int i = 0; i < a.length; i++) {
//            min = Math.min(min, a[i]);
//        }
//        System.out.println(" max = " + max);
//        System.out.println(" min = " + min);

        sc.close();
    }
}

/*
    Nhập số lượng phần tử của array: 5
    Nhập giá trị cho từng phần tử:
    item[0] = 5
    item[1] = 8
    item[2] = 1
    item[3] = 2
    item[4] = 3
    Array ban đầu: [5, 8, 1, 2, 3]
    Array sắp xếp: [1, 2, 3, 5, 8]
    max = 8
    min = 1
* */
