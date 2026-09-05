import java.util.*;

public class Mutiply {

    public static int multiplyNum (int a , int b ) {

        int multi = a*b ;
        return multi;

    }

    public static void main (String args[]) {



        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number");
        int a = sc.nextInt();
        
        System.out.println("enter second number");
         int b = sc.nextInt();

int multi = multiplyNum(a,b);
System.out.println("the  multiplication of two numbers is :" + " " +multi);
         
    }
}