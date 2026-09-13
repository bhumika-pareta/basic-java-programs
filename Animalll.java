//run time polymorphism

class Animals {

    void sound(){
        System.out.println("animal sound");
    }
}

class Dogs extends Animal {

    void sound(){
        System.out.println("dog barks");


    }
}
class Cat extends Animal {
    void sound(){
        System.out.println("Cat meows");


    }
}
public class Animall {
    public static void main(String args[]){

        Animal a ;
        a = new Dog();
        a.sound();

        Animal b;
        b = new Cat();
        b.sound();
    }
}
