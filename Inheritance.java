//inheritance
 
class Parent {
    int money = 5000;
    void showMoney() {
        System.out.println("Money" + " " +money);

    }
}
class Child extends Parent {
    void showChild(){
        System.out.println("heyy! I am  a child");
    }


} 
public class Inheritance {
    public static void main(String[] args){

        Child  c = new Child();


       
        c.showChild();
         c.showMoney();
    }
}