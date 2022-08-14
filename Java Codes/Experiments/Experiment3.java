//SE4_13_VANSH HARESH GALA
//EXPERIMENT NUMBER -3
class ComplexNumbers {
    float realpart, imagpart;
    ComplexNumbers() {          //Default Constructor
        realpart = 0;
        imagpart = 0;
    }
    ComplexNumbers(float n) {              //Single  Paramaterised Costructor
        realpart = imagpart = n;
    }
    ComplexNumbers(float realpart, float imagpart) {            //Double Paramaterised Constructor
        this.realpart = realpart;
        this.imagpart = imagpart;
    }
    void display() {                    // Display Function
        System.out.println(realpart +" + " + imagpart+ "  i");
    }
    void add(ComplexNumbers c1, ComplexNumbers c2) {        //Addition Function
        realpart = c1.realpart + c2.realpart;
        imagpart = c1.imagpart + c2.imagpart;
        display();
    }
}
public class Experiment3 {
    public static void main(String[] args) {
        ComplexNumbers c1 = new ComplexNumbers();             //Default Constructor
        ComplexNumbers c2 = new ComplexNumbers(5);          //Single  Paramaterised Costructor
        ComplexNumbers c3 = new ComplexNumbers(6, 12);    //Double Paramaterised Constructor
        System.out.println("No values are passed (C1)");
        c1.display();
        System.out.println("Single value is passed (C2)");
        c2.display();
        System.out.println("Both values are passed (C3)");
        c3.display();
        System.out.println("C3 = C1 + C2");
        c3.add(c1,c2);      // C3 = C1 + C2
        System.out.println("C1 = C1 + C2");
        c1.add(c1,c2);      //C1 = C1 + C2 
    }
}
