package Lab07;

public class SinhVienMain {
    public static void main(String[] args) {
        System.out.println("Sinh Vien Main");

        SinhVien it = new SinhVienIT(10, 7);
        System.out.println("Sinh Vien IT : " + it.getScore());

        SinhVien coKhi = new SinhVienCoKhi(6, 9);
        System.out.println("Sinh Vien CoKhi : " + coKhi.getScore());
    }
}

/*
    Sinh Vien Main
    Sinh Vien IT : 9.0
    Sinh Vien CoKhi : 7.5
* */
