package inheritance.polymorphism;

class Animal {
    void eat() {
        System.out.println("Animal eat");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("Dog eat");
    }
}

class BabyDog1 extends Dog {
    void eat() {
        System.out.println("BabyDog1 eat");
    }
}

class Cat extends Animal {
    void eat() {
        System.out.println("Cat eat");
    }
}

public class PolymorphismMain {
    public static void main(String[] args) {
        System.out.println("Polymorphism Main");
//        Animal animal = new BabyDog1();
        Animal animal = new Cat();
        animal.eat();
    }
}

/*
    Polymorphism Main
    Cat eat
* */
