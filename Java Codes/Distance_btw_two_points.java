import java.util.Scanner;

public class Distance_btw_two_points {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point p1 = new Point();
        System.out.print("Enter the x and y co-ordinate :");
        p1.x = sc.nextDouble();
        p1.y = sc.nextDouble();
        Point p2 = new Point();
        System.out.print("Enter the x and y co-ordinate :");
        p2.x = sc.nextDouble();
        p2.y = sc.nextDouble();
        Point p3 = new Point();
        p3.distance(p1, p2);
        sc.close();
    }
}

class Point {
    double x;
    double y;

    void distance(Point p1, Point p2) {
        double d;
        d = Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
        System.out.println("The distance is "+d);
    }
}
