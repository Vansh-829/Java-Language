import java.util.Scanner;
import java.util.Vector;

class ShoppingList {
    static Vector<String> list = new Vector<>();

    static boolean add(String a) {
        return list.add(a);
    }

    static int remove(String a) {
        if (list.contains(a)) {
            list.remove(a);
            System.out.println("The element  " + a + " removed");
            return 1;
        } else
            System.out.println("Element unavailable");
        return 0;

    }

    static boolean search(String a) {

        if (list.contains(a)) {
            System.out.println("The " + a + " is present at the location " + list.indexOf(a));
            return true;
        } else
            System.out.println("Element unavailable ");
        return false;
    }

    static int display() {
        System.out.println("The elements in the shopping list are : ");
        System.out.println(list);
        return 0;
    }
}

class EXpt9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1~Add \n2~Remove\n3~Search\n4~Display\n5~Exit\n");
            System.out.println("Enter the index of the operation you want to perform: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter the item to be added in the list : ");
                    String item = sc.next();
                    ShoppingList.add(item);
                    System.out.println();
                    break;

                }
                case 2: {
                    System.out.println("Enter the element to be removed : ");
                    String item = sc.next();
                    ShoppingList.remove(item);
                    System.out.println();
                    break;
                }
                case 3: {
                    System.out.println("Enter the element to check the location : ");
                    String item = sc.next();
                    ShoppingList.search(item);
                    System.out.println(" ");
                    break;
                }
                case 4: {
                    ShoppingList.display();
                    break;
                }
                case 5: {
                    System.out.println("Program terminating\n");
                    break;
                }
                default: {
                    System.out.println("!!! PLEASE CHECK THE CHOICE ENTERED !!!\n");
                    break;
                }
            }
        } while (choice != 5);
    }
}
