package Lab08;

//    https://stackoverflow.com/questions/29140402/how-do-i-print-my-java-object-without-getting-sometype2f92e0f4/29140403#29140403

public class JavaInterfaceMain {
    public static void main(String[] args) {
        System.out.println("Java Interface Main");

        Student student = new Student("123", "LamLDM", 18, 3);
        System.out.println(student);
        student.setGrade();
        System.out.println(student);

        Person person = new Person("123", "eric", 26);
        System.out.println(person);
    }
}

/*
    Java Interface Main
    Student [mark=3, grade=null]
    Student [mark=3, grade=Tạch cmnr]
    Lab08.Person@5e481248
* */
