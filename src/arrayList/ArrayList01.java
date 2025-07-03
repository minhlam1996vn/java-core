package arrayList;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>(); // generic
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
