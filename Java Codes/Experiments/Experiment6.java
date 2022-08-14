// package Experiments;
//SE4_13_VANSH HARESH GALA
//EXPERIMENT NUMBER -6
import org.Calculator.*;
import java.util.Scanner;
public class Experiment6 {
    public static void main(String[] args) {
        int a, b, no = 0;
        System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Square\n6.Cube\n7.EXIT");
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the operation to be performed : ");
            no = sc.nextInt();
            switch (no) {
                case 1:
                    System.out.print("Enter the two numbers : ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.format("The addition of %d and %d is %d\n", a, b, Arithmatic.add(a, b));
                    break;
                case 2:
                    System.out.print("Enter the two numbers : ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.format("The subtraction of %d and %d is %d\n", a, b, Arithmatic.subtract(a, b));
                    break;
                case 3:
                    System.out.print("Enter the two numbers : ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.format("The multiplication of %d and %d is %d\n", a, b, Arithmatic.multiply(a, b));
                    break;
                case 4:
                    System.out.print("Enter the two numbers : ");
                    float x = sc.nextFloat();
                    float y = sc.nextFloat();
                    System.out.format("The division of %.1f and %.1f is %.2f\n", x, y, Arithmatic.division(x, y));
                    break;
                case 5:
                    System.out.print("Enter the number : ");
                    a = sc.nextInt();
                    System.out.format("The square of %d is %d\n", a, CalcPower.square(a));
                    break;
                case 6:
                    System.out.print("Enter the number : ");
                    a = sc.nextInt();
                    System.out.format("The cube of %d is %d\n", a, CalcPower.cube(a));
                    break;
                case 7:
                    System.out.println("**********EXIT**********");
                    break;
            }
        } while (no != 7);
        sc.close();
    }
}