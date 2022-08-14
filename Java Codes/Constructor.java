class Constructor {
    public static void main(String args[]) {
        Circle1 c1 = new Circle1(2.0, 3.0, 5.0);
        Circle1 c2 = new Circle1(5.0);
        Circle1 c3 = new Circle1(c1);
        Circle1 c4 = new Circle1();
        System.out.println("Area of Circle is " + c1.area());
        System.out.println("Circumference of Circle is " + c1.circumference());
        System.out.println("Area of Circle is " + c2.area());
        System.out.println("Circumference of Circle is " + c2.circumference());
        System.out.println("Area of Circle is " + c3.area());
        System.out.println("Circumference of Circle is " + c3.circumference());
        System.out.println("Area of Circle is " + c4.area());
        System.out.println("Circumference of Circle is " + c4.circumference());
    }
}

class Circle1 {
    double r;
    double x, y;

    Circle1(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    Circle1(double a) {
        // x = 0;
        // y = 0;
        // r = a;
        this(0.0,0.0,a);
    }

    Circle1(Circle1 c) {
        // x = c.x;
        // y = c.y;
        // r = c.r;
        this(c.x,c.y,c.r);
    }

    Circle1() {
        // x = 0.0;
        // y = 0.0;
        // r = 1.0;
        this(0.0,0.0,1.0);
    }

    double area() {
        return (Math.PI * r * r);
    }

    double circumference() {
        return (2 * Math.PI * r);
    }
}