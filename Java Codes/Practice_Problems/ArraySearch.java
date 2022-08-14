import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        String[] arr = new String[3];
        Scanner sc = new Scanner(System.in);
      for(int i=0;i<arr.length;i++) {
            System.out.print("Enter the string :");
            arr[i] = sc.next();
        }
        System.out.println("Enter the string to be searched ");
        String search = sc.next();
        for (String a : arr) {
            if (a.compareToIgnoreCase(search)==0){
                System.out.print("True");
                break;
            }
        }
        sc.close();
    }
}
