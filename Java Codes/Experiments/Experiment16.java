//SE4-13-VANSH HARESH GALA
//EXPERIMENT-16
package com.company;
class Threaddollar extends Thread{
    public void run(){
        for( ; ; ) {
            System.out.print("$");
            try {
                sleep(99);
            } catch (Exception e) {
            }
        }
    }
}
class Threadpound extends Thread{
    public void run(){
        for( ; ; ) {
            System.out.print("#");
            try{
                sleep(101);
            }
            catch(Exception e){
            }
        }
    }
}
public class Experiment16 {
    public static void main(String[] args) {
        Threaddollar t1 = new Threaddollar();
        Threadpound t2 = new Threadpound();
        t1.start();
        t2.start();
    }
}
