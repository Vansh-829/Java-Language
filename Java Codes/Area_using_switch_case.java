//SE4_13_VANSH GALA
//QUESTION NUMBER-2
import java.util.Scanner;
public class Area_using_switch_case {
    public static void main(String args[]) {
    System.out.println("Find the Area of : "+"\n1.Rectangle"+"\n2.Triangle"+"\n3.Square");
    System.out.print("Enter the Number whose Area is to be found : ");  
    Scanner sc = new Scanner(System.in);
    int no =sc.nextInt();
    switch(no){
        case 1 :System.out.print("Enter the length and breadth of the Reactangle : ");
                int length =sc.nextInt();
                int breadth =sc.nextInt();
                System.out.print("The Area of the Rectangle is : "+(length*breadth));
                break;
        case 2 :System.out.print("Enter the base and height of the Triangle : ");
                int base =sc.nextInt();
                int height =sc.nextInt();
                System.out.print("The Area of the Triangle is : "+(0.5*base*height));
                break;
        case 3 :System.out.print("Enter the side of the Square : ");
                int side =sc.nextInt();
                System.out.print("The Area of the Square is : "+(side*side));
                break;        
        }
    sc.close();    
    }    
}
