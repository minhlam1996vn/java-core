package inheritance.superKeyword;

public class SinhVienCoKhi extends SinhVien {
    private String skill;

    public SinhVienCoKhi(String skill, String id, String name, double price, double tax) {
        super(id, name, price, tax);
        this.skill = skill;
    }

    @Override
    boolean tinhDiem() {
        System.out.println("Sinh vien co khi tinh diem");

        return false;
    }
}
