import java.util.Scanner;

class Shape {
    double length, breadth;

    Shape(double l, double b) { // Constructor to initialize a Shape object
        length = l;
        breadth = b;
    }

    Shape(double len) { // Constructor to initialize another Shape object
        length = breadth = len;
    }

    double calculate() { // To calculate the area of a shape object
        return length * breadth;
    }
}

class Test1 extends Shape {
    double height; // Template code:

    Test1(double length, double h) {
        super(length); // base class constructor with one parameter is called
        height = h;
    }

    Test1(double length, double breadth, double h) {
        super(length, breadth);     // base class constructor having two argument is called
        height = h;
    }

    double calculate() {
        return length * breadth * height;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);// Create an object to read input
        System.out.print("Enter the length breadth and height of shape : ");
        double l = sc.nextDouble(); // Read length
        double b = sc.nextDouble(); // Read breadth
        double h = sc.nextDouble(); // Read height
        Test1 myshape1 = new Test1(l, h);
        Test1 myshape2 = new Test1(l, b, h);
        double volume1;
        double volume2;
        volume1 = myshape1.calculate();
        volume2 = myshape2.calculate();
        System.out.println("The volume of shape 1 is "+volume1);
        System.out.println("The volume of shape 2 is "+volume2);
        sc.close();
    }
}
