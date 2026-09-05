import java.util.*;
public class Factorial {

public static void factNum(int n) {
    if(n<0){
        System.out.println("invalid input");
        return;
    }
    int fact = 1;
    for(int i=n; i>=1;  i--){

      fact  = fact*i;

    }
    System.out.println("Factorial of the number is " +" "+ fact);
return;
}

public static void  main(String args[]){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

    factNum(n);
}

}