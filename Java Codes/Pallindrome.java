import java.util.Scanner;

public class Pallindrome {
    public static void main (String args[]) {
        int no,rev=0;
        int x,d;
        System.out.println("Enter the number to be checked:" );
        Scanner sc= new Scanner(System.in);
        no = x = sc.nextInt();
        sc.close();   
        while(no != 0){
            d = no % 10;
           rev=(rev*10)+d;
            no=no/10;
        }
        if(rev==x){
            System.out.println("The Number is Pallindrome.");
        }
        else{
            System.out.println("The Number is NOT Pallindrome.");
        }

    }
}
