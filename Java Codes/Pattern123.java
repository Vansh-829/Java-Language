//SE4_13_VANSH GALA
//QUESTION NUMBER-5
import java.util.Scanner;
public class Pattern123 {
    public static void main ( String arg[]) {
        System.out.print("Enter the rows to be printed :");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        sc.close();
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
        System.out.print("\n");    
        }
    } 
}
