//SE4_13_VANSH GALA
//QUESTION NUMBER-2
import java.util.Scanner;

public class Prime_btwn_twovalues {
    static void primeNumber(int min, int max) {        //Range of numbers
        for (int i = min; i <= max; i++) {
            if (checkPrimeNumber(i)) {
                System.out.println("" + i);
            }
        }
    }
    static boolean checkPrimeNumber(int no) {           //Check wether the number is prime or not
        for (int j = 2; j <= no / 2; ++j) {
            if (no % j == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Range  : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();
        primeNumber(n1, n2);
    }
}
