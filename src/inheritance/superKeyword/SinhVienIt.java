package inheritance.superKeyword;

public class SinhVienIt extends SinhVien {
    private String language;

    public SinhVienIt(String language, String id, String name, double price, double tax) {
        super(id, name, price, tax);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void getMoney() {
        System.out.println("Sinh Vien IT: getMoney");
        super.info(); // Luôn gọi đến class cha
//        this.info(); // Sẽ gọi đến class này
    }

    public void info() {
        System.out.println("Sinh Vien IT: info");
    }

    @Override
    boolean tinhDiem() {
        System.out.println("Sinh vien co khi tinh diem");

        return false;
    }
}
