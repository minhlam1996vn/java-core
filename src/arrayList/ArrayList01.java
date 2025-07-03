package arrayList;

//    https://www.w3schools.com/java/java_data_types.asp
//    https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
//    https://stackoverflow.com/questions/29284402/why-do-reference-data-types-point
//    https://stackoverflow.com/questions/2721546/why-dont-java-generics-support-primitive-types
//    https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html
//    https://www.w3schools.com/java/java_arraylist.asp
//    https://docs.oracle.com/javase/tutorial/java/generics/index.html
//    https://docs.oracle.com/javase/tutorial/java/generics/types.html

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
//        ArrayList<String> a1 = new ArrayList<String>(); // generic
        ArrayList<String> a1 = new ArrayList<>(); // Java Diamond (tự động đoán type từ java version 7)
        a1.add("Minh Lam 01");
        a1.add("Minh Lam 02");
        a1.add("Minh Lam 03");
        a1.add("Minh Lam 04");

        a1.remove(1);
        System.out.println(a1.toString());
    }
}

/*
[Minh Lam 01, Minh Lam 03, Minh Lam 04]
* */
