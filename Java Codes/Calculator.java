import java.util.Scanner;
class Calculator
{
    public static void main(String args[])
    {
        int res;
        String sym;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first no.");
        int no1=s.nextInt();
        System.out.println("Enter second no.");
        int no2=s.nextInt();
        System.out.print("Choose symbol(+,-,*,/):");
        sym=s.next();
        s.close();
        switch(sym)
        {
            case "+": res=no1+no2;
                         System.out.println("Addition is :"+res);
                         break;
            case "-": res=no1-no2;
                         System.out.println("Subtraction is :"+res);
                         break;
            case "*": res=no1*no2;
                         System.out.println("Multiplication is :"+res);
                         break;
            case "/": res=no1/no2;
                         System.out.println("Division is :"+res);
                         break;  
            default :   System.out.println("Invalid symbol");
                         break; 
                         
        }
        
    }
}