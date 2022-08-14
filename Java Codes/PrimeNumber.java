//SE4_13_VANSH GALA
//QUESTION NUMBER-4
import java.util.Scanner;
public class PrimeNumber {
    public static void main (String args[]){
        int flag=1;
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter the Number : ");
        int num =sc.nextInt();
        sc.close();
        for(int i=2;i<=(num/2);i++){
            if(num%i==0){
                flag=0;
                break;
            }
        }
        if(num==2 || flag==1){
            System.out.print("It is a Prime Number.");
        }
        else
        System.out.print("It is a NOT Prime Number.");        
    }    
}
