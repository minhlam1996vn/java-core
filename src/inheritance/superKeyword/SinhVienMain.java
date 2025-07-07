package inheritance.superKeyword;

public class SinhVienMain {
    public static void main(String[] args) {
        System.out.println("Sinh Vien Main");
        SinhVienIt st1 = new SinhVienIt("java", "123", "LamLDM", 10, 0.1);
        st1.getMoney();
        System.out.println("st1 check = " + st1.id);

        SinhVienCoKhi st2 = new SinhVienCoKhi("machine", "456", "LamCK", 10, 0.1);
        System.out.println("st2 check = " + st2.name);
    }
}

/*
    Sinh Vien Main
    Sinh Vien IT: getMoney
    Sinh Vien: info
    st1 check = 123
    st2 check = LamCK
* */
