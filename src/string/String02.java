package string;

//    Ứng dụng quản lý sinh viên
//    - Tạo class Student với thuộc tính name, id
//    - Tại hàm main, tạo 5 students với tên khác nhau (sử dụng constructor)
//    eg: new Student("Nam", 1); new Student("Eric", 2);
//    Yêu cầu: tìm và xuất ra:
//    - các student có tên bắt đầu là "Nguyễn"

import java.util.ArrayList;

public class String02 {
    public static void main(String[] args) {
        Student student1 = new Student("Nguyễn Văn A", "1");
        Student student2 = new Student("Trần Thị B", "2");
        Student student3 = new Student("Nguyễn Văn C", "3");
        Student student4 = new Student("Lê Văn D", "4");
        Student student5 = new Student("Bùi Thị E", "5");

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student5);
        students.add(student4);
        students.add(student3);
        students.add(student2);
        students.add(student1);

        System.out.println(students);

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().startsWith("Nguyễn")) {
                System.out.println(students.get(i));
            }
        }
    }
}

/*
    [Student{name='Bùi Thị E', id='5'}, Student{name='Lê Văn D', id='4'}, Student{name='Nguyễn Văn C', id='3'}, Student{name='Trần Thị B', id='2'}, Student{name='Nguyễn Văn A', id='1'}]
    Student{name='Nguyễn Văn C', id='3'}
    Student{name='Nguyễn Văn A', id='1'}
* */
