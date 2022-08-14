//SE4_13_VANSH HARESH GALA
//EXPERIMENT NO-10
import java.util.Scanner;
class Employee{
    int employee_id;
    String name;
    int salary;
    Employee(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Employee id :");
        employee_id = sc.nextInt();
        System.out.println("Enter the Employee name :");
        name = sc.next();
    }
    void display(){
        System.out.println("Employee details\nEmployee Id\tName\tSalary");
        System.out.println(employee_id+"\t\t"+name+"\t"+salary);
    }
}
class FullTimeEmployee extends Employee{
    int basic;
    int hra;
    int da;
    void cal_salary(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Basic salary :");
        basic = sc.nextInt();
        System.out.println("Enter the HRA salary :");
        hra = sc.nextInt();
        System.out.println("Enter the DA salary :");
        da = sc.nextInt();
        salary=basic+hra+da;
        display();
    }
}
class PartTimeEmployee extends Employee{
    int workingHours;
    int wage;
    void cal_salary(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Working hours :");
        workingHours = sc.nextInt();
        System.out.println("Enter the Wage :");
        wage = sc.nextInt();
        salary=workingHours*wage;
        display();
    }
}
class Experiment10 {
    public static void main(String args[]){
        System.out.println("1.Part time employee\n2.Full time employee");
        System.out.println("Enter the choice");
        Scanner sc=new Scanner(System.in);
        int no = sc.nextInt();
        switch (no) {
            case 1:
                PartTimeEmployee pt = new PartTimeEmployee();
                pt.cal_salary();
                break;
            case 2:
                FullTimeEmployee ft = new FullTimeEmployee();
                ft.cal_salary();
                break;
            default:
            System.out.println("Invalid Input");
                break;
        }
    }
}