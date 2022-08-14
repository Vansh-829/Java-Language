import java.util.Scanner;
public class LargestNumber {
    public static void main(String args[]) {
        System.out.print("Enter three numbers:");
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        sc.close();
        if((a>b) && (a>c)){
            System.out.println(a+" is the Largest Number");
        }
        else  if((b>a) && (b>c)){
            System.out.println(b+" is the Largest Number");
        }
        else{
            System.out.println(c+" is the Largest Number");
        }

    }
    
}
