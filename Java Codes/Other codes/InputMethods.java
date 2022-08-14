import java.io.BufferedReader;
// import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
//A GENERAL FORM OD INPUTS ARE TAKEN IN THIS PROGRAM , TO EXPLAIN THE SYNTAX
public class InputMethods {
    public static void main(String[] args) throws Exception {
//       SCANNER METHOD
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the data(in integrers)  : ");
        int data = sc.nextInt();
        System.out.println(data);
        sc.close();
//       DATA INPUT METHOD
        // int a, b, c;
        // DataInputStream din = new DataInputStream(System.in);
        // System.out.println("enter the numbers : ");
        // a = Integer.parseInt(din.readLine()); // READLINE  IS CUT OVER HERE TO RESEMBLE THAT IT THROWS EXCEPTIONS
        // b = Integer.parseInt(din.readLine());
        // c = a + b;
        //System.out.println("the addition is : " + c);
//       BUFFERED READER METHOD
        BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the name : ");
        String name;
        int l;
        name = re.readLine();
        System.out.println(name);
        System.out.println("enter the number : ");
        l = Integer.parseInt(re.readLine());
        System.out.println(l);
    }

}
