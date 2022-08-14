//SE4_13_VANSH GALA
//QUESTION NUMBER-1
import java.util.Scanner;
public class PrimeNumber_Using_functions {
    static int primenumber(int a) {
        int flag = 1;
        for (int i = 2; i <= (a / 2); i++) {
            if (a % i == 0) {
                flag = 0;
                break;
            }
        }
        if (a == 2 || flag == 1) {
            return -1;
        } else
            return 0;
    }
    public static void main(String args[]) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        sc.close();
        x = primenumber(num);
        if (x == -1) {
            System.out.print("It is a Prime Number.");
        } 
        else {
            System.out.print("It is a NOT Prime Number.");
        }
    }
}
