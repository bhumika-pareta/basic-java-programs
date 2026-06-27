import java.util.Scanner;

public class WeekDays {

  public static void main(String[] args) {
  
     Scanner  sc = new Scanner(System.in);
	 
	 System.out.println("enter number according to day");
	 
	 int day = sc.nextInt();
	 
	 switch(day)
	 {
	 case 1:
	 System.out.println("Monday");
	 break;
	 
	 case 2:
	 System.out.println("Tuesday");
	 break;
	 
	 case 3:
	 System.out.println("Wedenesday");
	 break;
	 
	 default:
	 System.out.println("Invalid");
	 }
	 }
	 }