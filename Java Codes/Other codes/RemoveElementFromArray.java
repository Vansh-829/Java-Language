import java.util.Scanner;
public class RemoveElementFromArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers to be entered : ");
        int l = sc.nextInt();
        int[] num;
        num = new int[l];
        System.out.println("Enter " + l + " number of integers : ");
        for (int i = 0; i < num.length; i++)
        {
            num[i] = sc.nextInt();
        }
        System.out.println("The required array is : ");
        for (int i = 0; i < num.length; i++)
        {
            System.out.println("The element at  " + i + " is " + num[i]);
        }
        System.out.println("Do you know the index (answer with a yes or no) : ");
        String in = sc.next();
        switch (in)
        {
            case "yes":
            {
                System.out.println("Enter the index to be removed : ");
                int removeIndex = sc.nextInt();

                for (int i = removeIndex; i < num.length - 1; i++)
                {
                    num[i] = num[i + 1];
                }
                System.out.println("~~~~~~~~Now the array is ~~~~~~~~");
                for (int i = 0; i < num.length-1; i++)
                {
                    System.out.println("The element at  " + i + " is " + num[i]);
                }
            }
            case "no":
            {
                System.out.println("The element whose index is to be checked : ");//just is case someone does not know the index
                int nenu = sc.nextInt();
                for (int i = 0; i < num.length; i++)
                {
                    if (num[i] == nenu)
                    {
                        System.out.println("The index of " + nenu + " is " + i);
                    } else
                    {
                        i = i++;
                    }
                }
                System.out.println("Enter the index to be removed : ");
                int removeIndex = sc.nextInt();

                for (int i = removeIndex; i < num.length - 1; i++)
                {
                    num[i] = num[i + 1];
                }
                System.out.println("~~~~~~~~Now the array is ~~~~~~~~");
                for (int i = 0; i < num.length-1; i++)
                {
                    System.out.println("The element at  " + i + " is " + num[i]);
                }
            }
        }
    }
}
