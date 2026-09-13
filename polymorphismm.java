//compile time polymorphism
 
class Calculate {
    void add(int a, int b) {
        System.out.println(a+b);
    }

    void add(int a , int b , int c){
        System.out.println(a+b+c);
    }
}
public class Polymorphismm {
    
public static void main(String args[]){


    Calculate c = new Calculate();

    c.add(2,3);
    c.add(1,2,3);
}
}
