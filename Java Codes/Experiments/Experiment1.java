//SE4_13_VANSH HARESH GALA
//EXPERIMENT NUMBER -1
import java.util.Scanner;
class Experiment1 {
    static void primeNumber(int min, int max) { // Range of numbers
        int count = 0;
        int minNum = 0, maxNum = 0;
        for (int i = min; i <= max; i++) {
            if (checkPrimeNumber(i)) { // check for prime number
                System.out.println(" " + i); // print the range of numbers
                count++; // number of primes in the range
                if (count == 1) {
                    minNum = i; // sets the minimum value
                } else {
                    maxNum = i; // sets the maximum value
                }
            }
        }
        System.out.println("The minimum number is " + minNum);
        System.out.println("The maximum number is " + maxNum);
        System.out.println("The count of prime numbers in the range is " + count);
        fibonacci(minNum, maxNum, count);
    }
    static boolean checkPrimeNumber(int no) { // Check wether the number is prime or not
        for (int j = 2; j <= no / 2; ++j) {
            if (no % j == 0) {
                return false; // return false if number is not prime
            }
        }
        return true; // return true if number is prime
    }
    static void fibonacci(int n1, int n2, int count) { // function to print last term in fibonacci series
        int n3 = 0;
        for (int i = 1; i <= count-2; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println("The last term of Fibonacci Series is : " + n3);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Range  : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();
        if (n1 >= 2 && n2 <= 100 && n2 - n1 >= 35) {
            System.out.println("The list of prime number is :");
            primeNumber(n1, n2); // function call for prime number
        }
        else{
            System.out.print("Constraints not matched.");
        }
    }
}