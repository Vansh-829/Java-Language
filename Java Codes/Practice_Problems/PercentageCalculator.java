import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks in subject 1 : ");
        int a = sc.nextInt();
        System.out.print("Enter the marks in subject 2 : ");
        int b = sc.nextInt();
        System.out.print("Enter the marks in subject 3 : ");
        int c = sc.nextInt();
        System.out.print("Enter the marks in subject 4 : ");
        int d = sc.nextInt();
        System.out.print("Enter the marks in subject 5 : ");
        int e = sc.nextInt();
        int sum=0;
        sum=a+b+c+d+e;
        float percentage;
        percentage=((float)sum/500)*100;
        System.out.print("The percentage of Student is "+percentage+"%");
        sc.close();
    }
}
