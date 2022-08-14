import java.util.Scanner; 
class Fibonacci { 

    public static void main (String args[]) { 
        int n1=2, n2=47;
        int sum=0;
        System.out.print("Enter the number for which you want the Fibonacci Series to be printed :" );
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
        System.out.print("0\t1");
        for(int i=1; i<=(n-2);i++){
            sum=n1+n2;
            System.out.print("\t"+sum);
            n1 = n2;
            n2=sum;
        }
        sc.close();
    } 
}
