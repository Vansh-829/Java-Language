//SE4_13_VANSH GALA
//QUESTION NUMBER-4
import java.util.Scanner;
class GCD_fuctions {
    public static void main (String args[]){
    int a,b;
    System.out.print("Enter two numbers\n");
    Scanner sc=new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
    sc.close();
    gcd(a,b);
    }
    static void gcd(int x,int y){
        int gcd,r,num,den;
    if (x>y)
    {
        num= x;
        den= y;
    }
    else
    {
        num=y;
        den=x;
    }
    r= num % den;
    while (r != 0)
    {
        num=den;
        den=r;
        r=num % den;
    }
    gcd = den;
    System.out.print("GCD of "+x+" and "+y+" is "+gcd);
    }
}
