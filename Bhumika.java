 class Polymorph {
    //funtion overloading - compiletime
    //method overloading - run time polymorphism

    //same funtion name for different [urposes]

    int age;
    String name;
    String post;

public void printDetails(int age) {
    System.out.println("age of the employee is :" + " " + age);
     
}

public void printDetails(String name) {
    System.out.println("name :"+ " " +name);
}
    public void printDetails(String name ,String post ) {
    System.out.println("name :"+ " " +name);
    System.out.println("post:"+ " " + post);

}

}

public class Bhumika {

    public static void main(String args[]) {
    Polymorph p1 = new Polymorph();
    p1.name = "Bhumika";
    p1.age = 19;
    p1.post= "Cloud Engineer";

    Polymorph p2 = new Polymorph();
    p2.name = "Chetan";
    p2.age = 21;
    p2.post = "Software developer";


    p1.printDetails(p1.age);
    p1.printDetails(p1.name, p1.post);
    p2.printDetails( p2.age);
    p2.printDetails(p2.name, p2.post);
    }
}