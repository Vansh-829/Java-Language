public class Varargs {
    static int sum(int...arr){      //int...arr is the Varargs 
        int sum = 0;
        for(int a : arr){       //Diffrent method to initialize an array
            sum+=a;
        }
        return sum;
    }
    public static void main(String[] args) {
       
        System.out.printf("The sum of the 10 and 20 is %d.\n",sum(10,20));
        System.out.printf("The sum of the 10,50 and 20 is %d.\n",sum(10,50,20));
        System.out.printf("The sum of the 10,50,20,100 and 20 is %d.\n",sum(10,50,20,100,20));
    }
}
