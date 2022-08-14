import java.util.Scanner;

class QuestionScope {
    int sum(int a, int b) {                     // non-static method
        return a + b;
    }

    static int multiply(int a, int b) {         // static method
        return a * b;
    }
}

public class QuetionScope1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();    
        QuestionScope st = new QuestionScope(); // Create an object to call non-static method
        int result1 = st.sum(n1, n2); // Call the method
        int result2 = QuestionScope.multiply(n1, n2); // Create an object to static method
        System.out.println("The sum is "+result1);
        System.out.println("The multiply is "+result2);
    }
}