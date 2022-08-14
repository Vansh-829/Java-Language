//SE4_13_VANSH HARESH GALA
//EXPERIMENT NUMBER-2
import java.util.Scanner;
public class Experiment2 {
    public static void main(String args[]) {
        Employee emp = new Employee();     //Creating object for class Employee
        emp.acceptData();   //Acessing fuction of class
        emp.display();      //Acessing fuction of class
    }
}
class Employee {       //Creating class named Employee
    int id;             //initialising variables
    String name;
    int salary;
    int DA;
    int HRA;
    int IncomeTax;
    int grossSalary() {     //Calculation for gross salary 
        return salary + DA + HRA + IncomeTax;
    }
    void acceptData(){   //function to accept data 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Employee ID :");
        id = sc.nextInt();
        System.out.print("Enter the Employee Name :");
        name = sc.next();
        System.out.print("Enter the Basic salary :");
        salary = sc.nextInt();
        System.out.print("Enter the DA(Dearness Aloowance) :");
        DA = sc.nextInt();
        System.out.print("Enter the HRA(House Rent Allowance) :");
        HRA = sc.nextInt();
        System.out.print("Enter the Income TAx :");
        IncomeTax = sc.nextInt();
        sc.close();
    }
    void display() {       // //function to display data 
        System.out.println("ID\tNAME\tSALARY\tDA\tHRA\tINCOME TAX\tGROSS SALARY");
        System.out.print(id + "\t" + name + "\t" + salary + "\t" + DA + "\t" + HRA + "\t" + IncomeTax + "\t   \t " + grossSalary());
    }
}