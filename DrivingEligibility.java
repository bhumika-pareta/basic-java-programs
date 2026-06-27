import java.util.Scanner;

public class DrivingEligibility {
	
	
	public static void main(String[] args){

 
 Scanner sc = new Scanner(System.in);
  
  System.out.println("enter your age");
  
     int age = sc.nextInt();
  
  System.out.println("do you have license (write true for yes and false for no!");
  
      boolean license = sc.nextBoolean();
  
  if(age >=18) {
    
    	if(license)
	    
	System.out.println("can drive");
	
	    else
	
    System.out.println("license required");
    } 
      else{
		  
         System.out.println("under age");
        }
		
    }
	
}