import java.util.Scanner;

class Circle_using_objects {
    public static void main(String args[]) {
        Circle c = new Circle();
        System.out.print("Enter the radius : ");
        Scanner sc = new Scanner(System.in);
        c.r = sc.nextInt();
        sc.close();
        System.out.println("Area of Circle is " + c.area());
        System.out.println("Circumference of Circle is " + c.circumference());
    }
}

class Circle {
    double r;

    double area() {
        return (Math.PI * r * r);
    }

    double circumference() {
        return (2 * Math.PI * r);
    }
}