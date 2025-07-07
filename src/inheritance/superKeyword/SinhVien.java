package inheritance.superKeyword;

//    https://www.w3schools.com/java/java_inheritance.asp
//    https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html

public abstract class SinhVien {
    protected String id;
    protected String name;
    protected double price;
    protected double tax;

    abstract boolean tinhDiem();

    public SinhVien(String id, String name, double price, double tax) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public double getPriceTax() {
        return this.price * this.tax;
    }

    public void info() {
        System.out.println("Sinh Vien: info");
    }
}
