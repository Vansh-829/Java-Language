//SE4_13_VANSH HARESH GALA
//EXPERIMENT NO-8
import java.util.Scanner;
class StringFormatter {
    public static String capitalizeWord(String str) {
        String words[] = str.split("\\s");
        String capitalizeWord = "";
        for (String w : words) {
            String first = w.substring(0, 1);
            String afterfirst = w.substring(1);
            capitalizeWord += first.toUpperCase() + afterfirst + " ";
        }
        return capitalizeWord.trim();
    }}
public class Experiment8 {
    public static void main(String[] args) {
        System.out.println("Enter the string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println("String after capitalisation of the first letter is : ");
        System.out.println(StringFormatter.capitalizeWord(str));
    }
}