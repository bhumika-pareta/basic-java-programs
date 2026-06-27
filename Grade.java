
import java.util.Scanner;

public class Grade {

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter your Marks");

int marks = sc.nextInt();

if(marks>=90) {
System.out.println("grade A");
}

else if(marks>=75){

System.out.println("grade B");
}
else if(marks>=50) {

System.out.println("grade C");
}
else if (marks>=60) {

System.out.println("grade D");
}
else {
System.out.println("Fail");

}
}
}