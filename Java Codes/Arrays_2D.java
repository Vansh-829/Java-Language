import java.util.Scanner;
class Arrays_2D {
    public static void main(String args[]) {
        int arr[][] = new int[20][20];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of array : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.print("Enter the Array Elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array elements are :");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++){
                System.out.print("\t"+arr[i][j]);
            }
            System.out.println("");
        }
        sc.close();
    }
}