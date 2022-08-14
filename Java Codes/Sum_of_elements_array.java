import java.util.Scanner;

public class Sum_of_elements_array {
    public static void main(String args[]) {
        int arr[] = new int[20];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of array : ");
        int n = sc.nextInt();
        System.out.print("Enter the Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum of Array elements is :");
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
        sc.close();
    }
}