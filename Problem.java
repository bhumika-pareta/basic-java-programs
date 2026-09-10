//inheritance 
 
class Employee {

    String name = "Bhumika Pareta";
    int salary = 1000000;
    void showEmployeeDetails(){
        System.out.println("Name :" + " " + name);
         System.out.println("Salary :" + " " + salary);

    }
}
class Developer extends Employee {

    String language = "JAVA" ;
    void showDeveloperDetails(){
        System.out.println("Language :" + " "+ language);

    }
}

public class Problem{
    public static void main (String[] args){
        Developer d = new Developer() ;

    
       
       d.showEmployeeDetails();
        d.showDeveloperDetails();
    }
}