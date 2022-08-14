import java.util.Scanner;
class Arrays_1D{
public static  void main(String args[]){
    int arr[]=new int[20];
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of elements of array : ");
    int n = sc.nextInt();
    System.out.print("Enter the Array Elements: ");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Array elements are :");
    for(int i=0;i<n;i++){
       System.out.println(arr[i]);
    }
    sc.close();
    }
}