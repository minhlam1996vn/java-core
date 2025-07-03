package Lab04;

public class UseProduct {
    public static void main(String[] args) {
        Product test = new Product();

        Product product1 = test.addProduct("computer", 200, 0.1);
        test.printfProduct(product1);
        System.out.println("tax price= " + test.getTaxPrice(product1.getPrice(), product1.getTax()));
    }
}

/*
    name = computer price = 200.0 tax= 0.1
    tax price= 20.0
*/
