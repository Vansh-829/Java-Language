class Static_NonStatic_Method {
    //Program to swap two numbers using two methods
    static void swap1(int a,int b ){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swap : "+a+"  "+b);
    }
    void swap2(int a,int b ){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swap : "+a+"  "+b);
    }
    public static void main(String args[]){
        System.out.println("The two numbers before swapping are 8 and 9");
        System.out.println("By static method:");
        swap1(8,9);
        /*If we dont want to use the static method we need to create an object of the same class then we can use that function */
        Static_NonStatic_Method obj=new Static_NonStatic_Method();
        System.out.println("By non static method:");
        obj.swap2(8,9);
    }
}