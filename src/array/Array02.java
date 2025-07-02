package array;

//    https://www.w3schools.com/java/java_arrays_loop.asp

public class Array02 {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) { // for (int i = 0; i < cars.length; i++) {
            System.out.println(car);
        }
    }
}

/*
    Volvo
    BMW
    Ford
    Mazda
* */
