public class Patterns {
public static void main(String [] args){
     /*for(int i=1; i<=4; i++) {
    
        for(int j = 0; j<=5; j++){
            System.out.print(" * ");
        }
        System.out.println();
    }/* */


    //hollow rectangle

    /*int n =4;
    int m=5;
    for(int i= 1; i<=n; i++ ){

        for(int j=1; j<=m; j++) {
            if(i==1|| j== 1 || i == n || j == m ){
                System.out.print("*");
            } else { 
                System.out.print(" ");
            }
        }
        System.out.println();
    } */ 
/*  */

//increasing triagnle 
    /*  int n = 4;
     for (int i =  1; i<=n; i++){
        for(int j = 1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
     }
*/
// decreasing triangle
     int n = 1;
     for (int i = 4; i>=n; i--){
        for(int j = 1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
     }

     }
} 