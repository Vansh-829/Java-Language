import java.util.Scanner;

class Question { // Define a class Question with two elements e1 and e2.
    Scanner sc = new Scanner(System.in);
    int e1 = sc.nextInt(); // Read e1
    int e2 = sc.nextInt(); // Read e2

}

public class Swap_using_call_by_object_ref {
    public static void swap(Question t) { // Define static method swap()to swap the values of e1 and e2 of class T.
        int temp = t.e1;
        t.e1 = t.e2;
        t.e2 = temp;
    }

    public static void main(String[] args) {
        System.out.print("Enter two numbers :");
        Question t = new Question(); // Create an object of class Question
        swap(t); // Call the method swap()
        System.out.println(t.e1 + " " + t.e2);
    }
}
