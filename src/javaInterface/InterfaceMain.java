package javaInterface;

//  https://docs.google.com/document/d/1zNh72U2s3bVW8r0VbSa57uWnWLqSV89ySSaMR5FQPXE/edit?tab=t.0
//  https://stackoverflow.com/questions/2801878/implementing-two-interfaces-in-a-class-with-same-method-which-interface-method

//  2. Đặc điểm của interface
//      - Interface không có body => body được ghi đè lại tại các class "implements"
//      - Khi kế thừa interface, cần phải ghi đè tất cả method của interface (ngoại trừ default method)
//      - Mặc định, tất cả method của interface là "abstract" + "public"
//          => thay vì viết: abstract public void animalSound( ); chuyển thành: void animalSound( )
//      - Interface không thể có constructor
//      => không thể khởi tạo object từ interface (ví dụ là không thể tao Animal object)
//      - 1 class có thể kế thừa cùng lúc nhiều interface (abstract class là kế thừa 1:1)

public class InterfaceMain {
    public static void main(String[] args) {
        System.out.println("Interface Main");

        Pig p = new Pig();
        p.run();
    }
}

/*
    Interface Main
    Zzz
* */
