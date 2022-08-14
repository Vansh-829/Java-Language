import java.util.Scanner;

public class table_of_a_given_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers for which the table has to be searched : ");//checks the length of array
        int l= sc.nextInt();//stores the length
        int[] num;//initialising the array
        num=new int[l];
        System.out.println("Enter the numbers for which the table has to be found: ");//takes the input of number for which the table is to be found
        for (int i = 0 ;i< num.length;i++)//normal for loop to store the array input
        {
         num[i] = sc.nextInt();
        }
        System.out.println("The tables are : ");//for the tables
        for (int j = 0;j< num.length;j++)//setting the array measures
             {
            for (int i = 1; i <= 10; i++) //setting the table
                 {
                System.out.println(num[j] + " x " + i + " = " + num[j] * i);//format to show the table
                System.out.println("");//for better appearance
            }
            System.out.println("\n");//for better appearance
        }
        sc.close();
    }
}