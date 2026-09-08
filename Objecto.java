class Student {
    String name;
    int age;

    public void printName(){

        System.out.println("Student Name"+" "+ this.name);
        
    }
    public void printAge(){
        System.out.println("Student age"+" "+ this.age);
    }
    Student(String name, int age){

        System.out.println("Constructor callled");
    }
}// non paramterised constructor  
public class Objecto {
    public static void main (String args[]){
        Student s1 = new Student();
        Student s2 = new Student();

    s1.name= "Chetan";
    s2.name="Bhumika";
    s1.age= 21;
    s2.age = 19;
s1.printName();
s2.printAge();


    }
}