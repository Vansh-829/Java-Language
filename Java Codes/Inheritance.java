// import java.util.Scanner;
class A{
    A(){
        System.out.print("This is constructor of class A\n");
    }
    A(int x){
        System.out.print("");
    }
}
class B extends A{
    B(){
        System.out.print("This is constructor of class B\n");
    }
}
class Inheritance {
    public static void main(String args[]){
        // A a =new A();
        B b= new B();

    }
}