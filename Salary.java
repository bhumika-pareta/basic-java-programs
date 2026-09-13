//problem based on run time polymorphism and use of reference 

class Employeeee {
    int salary = 50000;

    void showSalary(){
        System.out.println("employee salary :"+" "+salary);

    }


}
class Developerrr extends Employeeee{
    int salary = 80000;
    void showSalary(){
        System.out.println("Developer salary :" + " "+ salary);
        System.out.println("Employee salary :"+" "+ super.salary);
        System.out.println("salary showed");

    }
}
public class Salary {
    public static void main(String args[]){

        Developerrr d = new Developerrr();

        d.showSalary();
    }
}