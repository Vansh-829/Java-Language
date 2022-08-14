//SE4_13_VANSH HARESH GALA
//EXPERIMENT NO-11
import java.util.Scanner;
abstract class Shape{
    abstract public void cal_area();
}
class Circle extends Shape{
    @Override
    public void cal_area(){
        System.out.println("Enter the radius :");
        Scanner sc =new Scanner(System.in);
        int r =sc.nextInt();
        double area = Math.PI*r*r;
        System.out.println("The Area of the Circle is "+area);
    }
}
class Rectangle extends Shape{
    @Override
    public void cal_area(){
        System.out.println("Enter the length and breadth :");
        Scanner sc =new Scanner(System.in);
        int l =sc.nextInt();
        int b =sc.nextInt();
        double area = l*b;
        System.out.println("The Area of the Rectangle is "+area);
    }
}
class Triangle extends Shape{
    @Override
    public void cal_area(){
        System.out.println("Enter the base and height :");
        Scanner sc =new Scanner(System.in);
        int b =sc.nextInt();
        int h =sc.nextInt();
        double area = 0.5*b*h;
        System.out.println("The Area of the Triangle is "+area);
    }
}
class Experiment11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int no;
        System.out.println("1.Circle\n2.Rectangle\n3.Triangle\n4.Exit");
        do {
            System.out.print("Enter the choice : ");
            no = sc.nextInt();
            switch (no) {
                case 1 -> {
                    Circle c = new Circle();
                    c.cal_area();
                }
                case 2 -> {
                    Rectangle r = new Rectangle();
                    r.cal_area();
                }
                case 3 -> {
                    Triangle t = new Triangle();
                    t.cal_area();
                }
                case 4 -> System.out.println("Exit");
                default -> System.out.println("Invalid Input");
            }
        }while(no!=4);
    }
}