//SE4_13_VANSH HARESH GALA
//EXPERIMENT NUMBER -5
//Method Overloading
import java.util.Scanner;
class AreaShapes {
    static double area(float r) { // Area of Circle
        return Math.PI * r * r;
    }
    static double area(int l, int b) { // Area of Rectangle
        return l * b;
    }
    static double area(int side) { // Area of Square
        return Math.pow(side, 2);
    }
}
public class Experiment5 {
    public static void main(String[] args) {
        int no;
        System.out.print("1.Area of Circle\n2.Area of Rectangle\n3.Area of Square\n4.EXIT\n");
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter the function to be performed : ");
            no = sc.nextInt();
            switch (no) {
                case 1: // Input for calculation of Area of Circle
                    System.out.print("\nEnter the radius of circle : ");
                    float r = sc.nextFloat();
                    System.out.println("\n The Area of circe is " + AreaShapes.area(r));
                    break;
                case 2: // Input for calculation of Area of Reactangle
                    System.out.print("\nEnter the length and breadth of rectangle : ");
                    int l = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("\n The Area of Rectangle is " + AreaShapes.area(l, b));
                    break;
                case 3:// Input for calculation of Area of Square
                    System.out.print("\nEnter the side of square : ");
                    int a = sc.nextInt();
                    System.out.println("\n The Area of Square is " + AreaShapes.area(a));
                    break;
            }
        } while (no != 4) ;
        if (no == 4) {
            System.out.println("**********EXIT**********");
        }
        sc.close();
    }
}
