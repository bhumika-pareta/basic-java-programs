class Studentt {
    String name;
    int age;
// Parameterised constructor
    public void printName(){

        System.out.println("Student Name :"+" "+ this.name);
        
    }
    public void printAge(){
        System.out.println("Student age :"+" "+ this.age);
    }
    Studentt(String name, int age){

        this.name=  name;
        this.age= age;
}
}
public class Obje {
    public static void main (String args[]){
        Studentt s1 = new Studentt("bhumika",19);
        Studentt s2 = new Studentt("chetan", 21);


System.out.println("Info of first student");

s1.printName();
s1.printAge();

System.out.println("Info of Second student");
s2.printName();
s2.printAge();
    }
}
