import java.util.Scanner;

class MenuItem {
    int price[] = new int[10];
    String name[] = new String[10];
    String description[] = new String[10];

    void dataOfTheMenu(int n) {
        for (int i = 0; i < n; i++) {
            Scanner INPUT = new Scanner(System.in);
            System.out.println(" ENTER THE PRICE, GENRE, DESCRIPTION : ");
            price[i] = INPUT.nextInt();
            name[i] = INPUT.nextLine();
            description[i] = INPUT.nextLine();
            INPUT.close();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(name[i] + " " + description[i] + " - " + price[i]);
        }
    }

    void DisplayOrder() {
        Scanner input = new Scanner(System.in);
        String ORDER = input.next();
        input.close();
        System.out.println("Enter the order = ");
        System.out.println("YOUR ORDER OF " + ORDER + " IS CONFIRMED");
        System.out.println("THE TOTAL WILL BE " + price + "/-");
    }
}

class Class {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements :");
        int n = sc.nextInt();
        sc.close();
        MenuItem m = new MenuItem();
        m.dataOfTheMenu(n);
        m.DisplayOrder();
    }
}