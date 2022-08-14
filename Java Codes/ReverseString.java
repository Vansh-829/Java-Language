import java.util.Scanner;

public class ReverseString {

    static void reverseString(String n) {
        String reverse = "";
        for (int i = n.length() - 1; i >= 0; i--) {
            reverse += n.charAt(i);
        }
        System.out.print(reverse);
    }

    static int countSpace(String n) {
        int space = 0;
        for (int i = n.length() - 1; i >= 0; i--) {
            int s =n.charAt(i);     //ASCII code for space is 32 (decimal system ),040(octal system), 20(hexadecimal system)
            if(s ==32) {
                space++;
            }
            // char s =n.charAt(i);
            // if(s ==' ') {
            //     space++;
            // }
        }
        return space;
    }

    static int countLetter(String n) {
        int letter = 0;
        for (int i = n.length() - 1; i >= 0; i--) {
            int s =(n.charAt(i));
            if((s>=97 && s<=122)||(s>=65 && s<=90)) {   //ASCII range for lower and upper case alphabets respectively
                letter++;
            }
        }
        return letter;
    }

    static int countSpecialCharacter(String n) {
        int specialCharacter = 0;
        for (int i = n.length() - 1; i >= 0; i--) {
            int s =(n.charAt(i));
            if(!((s>=97 && s<=122)||(s>=65 && s<=90)||(s==32)||(s>=48 && s<=57))) {
                specialCharacter++;
            }
        }
        return specialCharacter;
    }

    static int countNumber(String n) {
        int number = 0;
        for (int i = n.length() - 1; i >= 0; i--) {
            int s =(n.charAt(i));
            if(s>=48 && s<=57) {        //ASCII range for numbers
                number++;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        name = sc.nextLine();
        sc.close();
        System.out.println("The Original String is:");
        System.out.println(name);
        System.out.println("The Reverse of the String is :");
        reverseString(name);
        System.out.println("");
        int s = countSpace(name);
        System.out.println("Space :"+s);
        int l = countLetter(name);
        System.out.println("Letters: "+l);
        int n = countNumber(name);
        System.out.println("Numbers :"+n);
        int sp = countSpecialCharacter(name);
        System.out.println("Special Characters :"+sp);
    }
}