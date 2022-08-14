import java.util.Scanner;

class Recursive_Fibonacci {
    static int n1 = 0, n2 = 1, n3 = 0;

    public static void fib(int n) {
        if (n > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print("\t" + n3);
            fib(n - 1);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for for which Fibonacci Series is to be printed :");
        int n = sc.nextInt();
        sc.close();
        System.out.print("The Fibonacci Series for " + n + " is :");
        System.out.print("" + n1 + "\t" + n2);
        fib(n - 2);
    }
}