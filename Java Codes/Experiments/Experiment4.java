//SE4_13_VANSH HARESH GALA
//EXPERIMENT NUMBER -4
import java.util.Scanner;
public class Experiment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of hotels :");
        int n = sc.nextInt();
        Hotel h[] = new Hotel[n];   //Creating an array of 'n' objects
        for (int i = 0; i < n; i++) {
            h[i] = new Hotel();     //Initialising the objects 
        }
        Hotel temp ;            //Sorting the array according to the Room Charges
        for(int j=0;j<n;j++){       //Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            if (h[i].roomCharge > h[i + 1].roomCharge) {       //Comparing the values of Room Charges
                temp = h[i];        //Swapping the array objects
                h[i]= h[i + 1];
                h[i + 1] = temp;
            }
        }
    }
        System.out.println("Hotel Name\tCity\tRoom Charge");
        for (int i = 0; i < n; i++) {
            h[i].display();     //Displaying  the data
        }
        sc.close();
    }
}
class Hotel {
    String hotelName;
    String city;
    int roomCharge;
    Hotel() {           //Taking input from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Hotel Name :");
        hotelName = input.next();
        System.out.println("Enter the City :");
        city = input.next();
        System.out.println("Enter the Room Charge :");
        roomCharge = input.nextInt();
    }
    void display() {        //Method for displaying the data
        System.out.println(hotelName + "\t\t" + city + "\t\t" + roomCharge);
    }
}
