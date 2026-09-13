//runtime polymorphism "Method overriding" 

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}

public class Overr {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
    }

}
