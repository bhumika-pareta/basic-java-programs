import java.util.*;
public class User {
    public static void main(String[] args){
    
        int i=1;
        System.out.println("Enter the value of n");
Scanner sc =  new Scanner(System.in);
int n = sc.nextInt(); 
 
int sum = 0;
for(i=1; i<=n;i++){
sum = sum + i;  
    }
    System.out.println(sum);
}
}