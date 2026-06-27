import java.util.*;

  public class ArrayIndex {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter size of array");
	int size = sc.nextInt();
int[] numbers  = new int[size];


System.out.println("Enter Elements:");

int i=0;

for (i=0; i<size ; i++) {
	numbers[i] = sc.nextInt();
}

System.out.println("Enter a  number");

int x = sc.nextInt();

for (i=0; i<size; i++){
	
	if ( x == numbers[i])
	{
		System.out.println(x +  " is found at index" + i);
	}

	}
	
}
  }
  }