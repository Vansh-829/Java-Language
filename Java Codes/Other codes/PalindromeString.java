import java.util.Scanner;

public class PalindromeString {
    public static void main(String args[])
    {
        String newstring,old , reverse = "";

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        newstring =old = in.nextLine();
        in.close();
          
        for ( int i = newstring.length()-1; i >= 0; i-- )
            reverse = reverse + newstring.charAt(i);
            System.out.println(reverse);
         if (old == reverse)
             System.out.println("Entered string/number is a palindrome.");
         else
             System.out.println("Entered string/number isn't a palindrome.");
    }
}
                           