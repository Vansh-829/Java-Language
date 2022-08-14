import java.util.Scanner;

class MatrixSum  {
public static void main(String args[]){
    int i,j;
    int a[][] = new int[10][10];
    int b[][] = new int[10][10];
    int c[][] = new int[10][10];
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows and columns of array : ");
    int r1 = sc.nextInt();
    int c1 = sc.nextInt();
    System.out.print("Enter the Array Elementsof Matrix A: ");
    for ( i = 0; i < r1; i++) {
        for (j = 0; j < c1; j++){
            a[i][j] = sc.nextInt();
        }
    }
    System.out.print("Enter the Array Elements of Matrix B: ");
    for ( i = 0; i < r1; i++) {
        for (j = 0; j < c1; j++){
            b[i][j] = sc.nextInt();
        }
    }
    System.out.println("The Sum of Matrix A and B is :");
    for ( i = 0; i < r1; i++) {
        for (j = 0; j < c1; j++){
            c[i][j] =a[i][j]+b[i][j];
            System.out.print("\t"+c[i][j]);
        }
        System.out.print("\n");
    }
    sc.close();
    }
}
