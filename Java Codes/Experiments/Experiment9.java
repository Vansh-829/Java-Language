//SE4_13_VANSH HARESH GALA
//EXPERIMENT NO-9
//Vector class
import java.util.*;
class Experiment9 {
    public static void main(String[] args) {
        Vector<String> list = new Vector<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("\nShopping list of items \n");
        System.out.println("1.Add \n2.Remove\n3.Search\n4.Display\n5.Exit\n");
        do {
            System.out.print("Enter the operation you want to perform : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.print("Enter the item to be added in the list : ");
                    String item = sc.next();
                    list.add(item);
                    System.out.println();
                    break;
                }
                case 2: {
                    System.out.print("Enter the element to be removed : ");
                    String item = sc.next();
                    if (list.contains(item)) {
                        list.remove(item);
                        System.out.println("The element  " + item + " removed");
                    } else
                        System.out.println("Element unavailable");
                    break;
                }
                case 3: {
                    System.out.print("Enter the element to check the location : ");
                    String item = sc.next();
                    if (list.contains(item)) {
                        System.out.println("The " + item + " is present at the location " + list.indexOf(item));
                    }
                    else{
                        System.out.println("Element unavailable ");
                    }
                    break;
                }
                case 4: {
                    System.out.println("The shopping list is as follows : ");
                    System.out.println(list);
                    break;
                }
                case 5: {
                    System.out.println("Exit");
                    break;
                }
                default: {
                    System.out.println("Enter valid input ");
                    break;
                }
            }
        } while (choice != 5);
        sc.close();
    }
}