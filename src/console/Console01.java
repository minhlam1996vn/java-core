package console;

public class Console01 {
    public static void main(String[] args) {
        //in ra kết quả nhưng "không xuống dòng": print
        System.out.print("Hello World 1");
        System.out.print("Hello World 2");

        //xuống dòng với: print
        System.out.print("\n");

        //in ra kết quả rồi xuống dòng: print line
        System.out.println("Hello World 1");
        System.out.print("Hello World 2");

        System.out.print("\n");

        /*
        * in ra kết quả có định dạng: print format
        * %d: số nguyên
        * %f: số thực
        * mặc định là 6 số lẻ
        * %.3f định dạng 3 số lẻ
        * %s: chuỗi
        * */
        System.out.print("Minh Lam IT \n");
        System.out.println("với LamLDM");
        System.out.printf("có %d người đăng ký \n", 40000);
        System.out.printf("có %.0f người đăng ký \n", 40000.555);
    }
}
