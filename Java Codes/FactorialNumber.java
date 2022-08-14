//SE4_13_VANSH GALA
//QUESTION NUMBER-3
import java.util.Scanner;
public class FactorialNumber {
    public static void main(String args[]) {
        int num ;
        int factorial=1 ;
        System.out.print("Enter the Number : ");
        Scanner sc =new Scanner(System.in);
        num=sc.nextInt();
        sc.close();
        for(int i =1;i<=num;i++){
             factorial = factorial * i;
        }
        System.out.println("The Factorial of " +num+ " is :" +(factorial));
    }    
}
