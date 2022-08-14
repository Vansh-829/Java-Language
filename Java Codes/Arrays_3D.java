import java.util.Scanner;
class Arrays_3D {
    public static void main(String args[]) {
        int arr[][][] = new int[20][20][20];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dimensions of array : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.print("Enter the Array Elements: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++){
                for (int k = 0; k < z; k++){   
                arr[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("Array elements are :");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++){
                for (int k = 0; k < z; k++){   
                    System.out.print("\t"+arr[i][j][k]);
                }
                System.out.println("");
            }
            System.out.println("");
        }    
        sc.close();
    }
}
