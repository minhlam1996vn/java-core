package inheritance.superKeyword;

public class SinhVienIt extends SinhVien {
    private String language;

    public void getMoney() {
        System.out.println("Sinh Vien IT: getMoney");
        super.info(); // Luôn gọi đến class cha
//        this.info(); // Sẽ gọi đến class này
    }

    public void info() {
        System.out.println("Sinh Vien IT: info");
    }
}
