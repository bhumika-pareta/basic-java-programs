
import java.util.*;
public class Methods {

     public static void printMyName(String name){
       
        System.out.println("your name is" +   " "+ name);
        return ;
     }
    public static void main(String args[]){
        // funtion is a block of code which takes some input , perfroms operation and generate output
   ///returnType funtionName(type arg1, type arg2..){
   /// }
   /// 
    System.out.println("Enter your name");
    Scanner sc = new Scanner(System.in);
    String name = sc.next();

    printMyName(name);
    }
}