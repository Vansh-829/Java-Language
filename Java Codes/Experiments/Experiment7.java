//SE4_13_VANSH HARESH GALA
//EXPERIMENT NO-7
//Buffered Reader class
import java.io.*;
class Matrix {
    Matrix(int r) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int array[][] = new int[r][r];
        String name;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                System.out.format("Enter the (%d,%d) element :\n",i,j);
                name = br.readLine();
                array[i][j] = Integer.parseInt(name);
            }
        }
        System.out.println("Elements recorded successfully");
        if(check_symmetric(array, r)){
            System.out.println("Matrix is Symmetric");
        }
        else
            System.out.println("Matrix is NOT Symmetric");
    }
    boolean check_symmetric(int array[][],int r) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                if ((array[i][j] != array[j][i]) && (j>i))
                    return false;   
            }
        }
        return true;
    }
}
public class Experiment7 {
    public static void main(String[] args) throws IOException, NumberFormatException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter the square matrix :");
        int r;
        String name = br.readLine();
        r = Integer.parseInt(name);
        Matrix max = new Matrix(r);
    }
}
