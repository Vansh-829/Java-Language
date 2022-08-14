import java.util.Scanner;
class Recursive_Factorial {
    public static int fact (int n){
        if(n==1){
            return 1;
        }
        else{
            return (n*(fact(n-1)));
        }
    }
    public static void main(String args[]){
    System.out.print("Enter the number : ");
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    System.out.print("The Factorial of "+n+" is "+(fact(n)));
    }
}