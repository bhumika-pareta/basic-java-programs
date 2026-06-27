
import java.util.Scanner;

public class ArithmeticOperation {

public static void main(String [] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Enter first number");
int a = sc.nextInt();

System.out.println("enter second number");
int b = sc.nextInt();

System.out.println("Addition =" + (a+b));
System.out.println("Subtraction =" + (a-b));
System.out.println("multiplication =" + (a*b));
System.out.println("Division =" + (a/b));
}
}