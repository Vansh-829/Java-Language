//SE4-13-VANSH HARESH GALA
//EXPERIMENT-15
package com.company;
import java.util.Scanner;
class StringMismatchException extends Exception{
    StringMismatchException(String msg){
        super(msg);
    }
}
public class Experiment15 {
    public static void main(String[] args) {
        StringMismatchException sme = new StringMismatchException("String not Matched");
        System.out.print("Enter the string : ");
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        if(s.equalsIgnoreCase("INDIA")){
            System.out.println("String Matched");
        }
        else {
            try {
                throw sme;
            }
            catch (StringMismatchException e) {
//                e.printStackTrace():
                System.out.println(e);
            }
        }
    }
}
