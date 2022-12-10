public class Hierarchicalinheritance {
    public static void main(String[] args) {
        
        System.out.println();
    }
}

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// Derived class
class Mammal extends Animal {
    void walk() {
        System.out.println("walks");
    }
}
class Fish extends Animal {
    void swim() {
        System.out.println("swims");
    }
}
class bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}


