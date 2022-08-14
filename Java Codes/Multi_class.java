import java.util.Scanner;

public class Multi_class {
    public static void main(String args[]) {
        Circle3 c = new Circle3();
        Box b = new Box();
        System.out.print("Enter the radius : ");
        Scanner sc = new Scanner(System.in);
        c.r = sc.nextInt();
        sc.close();
        System.out.println("Area of Circle is " + c.area());
        System.out.println("Circumference of Circle is " + c.circumference());
        System.out.println("Volume of Box is " + b.volume());
        System.out.println("Area of Box is " + b.a());
    }
}

class Circle3 {
    double r;

    double area() {
        return (Math.PI * r * r);
    }

    double circumference() {
        return (2 * Math.PI * r);
    }
}

class Box {
    double width;
    double height;
    double length;

    double volume() {
        return (width * height * length);
    }

    double a() {
        return ((width * height) + (height * length) + (length * width));
    }
}
