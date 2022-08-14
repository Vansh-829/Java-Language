import java.util.Scanner;

class AmstrongNumber {
    public static void main(String args[]) {
        int no,d,sum=0,n;
        System.out.print("Enter the Number:");
        Scanner sc= new Scanner(System.in);
        no = sc.nextInt();
        sc.close();
        n=no;
        while(n!=0){
            d=n%10;
            sum+=d*d*d;
            n/=10;
        }
        if(no==sum){
            System.out.println("The Number is Amstrong Number.");
        }
        else{
            System.out.println("The Number is NOT Amstrong Number.");
        }
    } 
}