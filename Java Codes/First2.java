import java.util.Scanner;

class MenuItem6 {
    String itemName;
    String ingr;
    int price;

    void acceptMenuItem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of item");
        itemName = sc.next();
        System.out.println("Enter the item ingr");
        ingr = sc.next();
        System.out.println("Enter the item price");
        price = sc.nextInt();
        sc.close();
    }
    void displayMenuItem() {
        System.out.println(itemName + " " + ingr + " " + price);
    }
}
public class First2 {
    public static void main(String args[]) {
        MenuItem6 m[] = new MenuItem6[3];

        for (int i = 0; i < 3; i++) {
            m[i] = new MenuItem6();
            m[i].acceptMenuItem();
        }
        System.out.println("**********Menu************");
        for (int i = 0; i < 3; i++) {
            m[i].displayMenuItem();
        }
    }
}