//SE4_13_VANSH HARESH GALA
//EXPERIMENT NO-12
import java.util.Scanner;
class Student{
    int rollNo;
    String name;
    Student(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roll No : ");
        rollNo=sc.nextInt();
        System.out.println("Enter the Name : ");
        name=sc.next();
    }
}
class Test extends Student{
    int sub1,sub2,sub3;
    Test(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks of Subject1 out of 100 : ");
        sub1=sc.nextInt();
        System.out.println("Enter the Marks of Subject2 out of 100: ");
        sub2=sc.nextInt();
        System.out.println("Enter the Marks of Subject3 out of 100: ");
        sub3=sc.nextInt();
    }
}
interface MarksheetInterface{
    String clgName ="SAKEC";
    void calculateMarksheet();
}
class Marksheet extends Test implements MarksheetInterface{
    int total;
    float percent;
    @Override
    public void calculateMarksheet(){
        total=sub1+sub2+sub3;
        percent=(float)(total/300.0)*100;
    }
    Marksheet(){
        calculateMarksheet();
        System.out.println("\nThe Marksheet of the Student is : \n");
        System.out.println("College\tRoll No\tName\tSub1\tSub2\tSub3\tTotal Marks\tPercentage(%)");
        System.out.println(clgName+"\t"+rollNo+"\t\t"+name+"\t"+sub1+"\t\t"+sub2+"\t\t"+sub3+"\t\t"+total+"\t\t\t"+percent);
    }
}
public class Experiment12 {
    public static void main(String[] args) {
        Marksheet m =new Marksheet();
    }
}
