//SE4_13_VANSH GALA
//QESTION NUMBER-1
import java.util.Scanner;
class EvenOdd {
        public static void main(String args[]){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to be checked : ");
        num =sc.nextInt();
        sc.close();
        if(num%2==0){
            System.out.print("The Number is EVEN");
        }
        else {
            System.out.print("The Number is ODD");    
        }
    }
}