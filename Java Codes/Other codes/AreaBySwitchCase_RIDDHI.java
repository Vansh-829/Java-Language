/*RIDDHI DHIREN KUMBHANI
ROLLNO- 25
Write a java program for calculating Area of rectangle, triangle and square using switch case.
*/
import java.util.Scanner;
public class AreaBySwitchCase_RIDDHI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the shape ");
        String shape = input.nextLine();
        switch (shape) {
            case "triangle": {
                System.out.println("ENTER THE HEIGHT AND BASE:");
                int height = input.nextInt();
                int base = input.nextInt();
                System.out.println("THE AREA OF TRIANGLE IS " + (height * base) / 2);
                break;
            }
            case "rectangle": {
                System.out.println("ENTER THE length AND breadth:");
                int L = input.nextInt();
                int B = input.nextInt();
                System.out.println("THE AREA OF TRIANGLE IS " + (B * L));
                break;
            }
            case "square": {
                System.out.println("ENTER THE SIDE:");
                int SIDE = input.nextInt();
                System.out.println("THE AREA OF TRIANGLE IS " + (SIDE * SIDE));
                break;
            }
            default:
                System.out.println("INVALID ENTERY  ");
                break;
        }
    input.close();   
    }
}
