    import java.util.Scanner;
    class Area 
    {
    public static void main (String args[]) {
        int rad ;
        double area , circumference ;
        System.out.print("Enter the radius of the circle:");
        Scanner input = new Scanner(System.in);
        rad = input.nextInt();
        input.close();
        area=3.14 *rad * rad;
        circumference=2*3.14*rad;
        System.out.println("Area of the circle is "+area);
        System.out.println("Circumference of the circle is "+circumference);    
        }
    
    }   
