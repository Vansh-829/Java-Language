//SE4_13_VANSH GALA
//QUESTION NUMBER-3
import java.util.Scanner;
public class Fibonacci_Function {
    static void fibonacci(int n) {
        int n1=0, n2=1, n3=0;
        if (n == 1) 
        {
            System.out.print("0");
        } 
        else if (n == 2) 
        {
            System.out.print("0\t1");
        } 
        else 
        {
            System.out.print("0\t1");
            for (int i = 1; i <= (n - 2); i++) 
            {
                n3 = n1 + n2;
                System.out.print("\t" + n3);
                n1 = n2;
                n2 = n3;
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms :");
        int num = sc.nextInt();
        sc.close();
        fibonacci(num);
    }
}
