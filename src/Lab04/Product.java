package Lab04;

import org.jetbrains.annotations.NotNull;

public class Product {
    private String name;
    private double price;
    private double tax;

    public Product() {

    }

    public Product(String name, double price, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public Product addProduct(String name, double price, double tax) {
        return new Product(name, price, tax);
    }

    public void printfProduct(@NotNull Product product) {
        System.out.println("name = " + product.getName() + " price = " + product.getPrice() + " tax= " + product.getTax());
    }

    public double getTaxPrice(double price, double tax) {
        return price * tax;
    }
}
