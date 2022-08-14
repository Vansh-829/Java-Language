import java.util.Scanner;
public class FibonacciLastNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt(); // Read an integer
        System.out.println("The "+n+"th Fibonacci Number is "+fib(n)); // Generate and print the n-th Fibonacci number
        sc.close();
    }
    static int fib(int n) {
        if (n == 1) // Terminal condition
            return 0;
        else if (n == 2)
            return 1;
        return fib(n - 1) + fib(n - 2); // Recursive call of function
    }
}