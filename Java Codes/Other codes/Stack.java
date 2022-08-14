import java.util.Scanner;

class Stack {
    private int arr[];
    private int top;
    private int max;

    Stack(int size) {
        arr = new int[size];
        max = size;
        top = -1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack overflow");
            System.exit(0);
        }
        top = top + 1;
        arr[top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            System.exit(0);
        }
        return arr[top--];
    }

    public int size() {
        return top + 1;
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public Boolean isFull() {
        return top == max - 1;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int in, choice;
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack(5);
        System.out.println("1~ Push");
        System.out.println("2~ Pop");
        System.out.println("3~ Check if the stack is full");
        System.out.println("4~ Check if the stack is empty");
        System.out.println("5~ Check the size of stack ");
        System.out.println("6~ Show the top element of stack");
        System.out.println("7~ Print all the elements in the stack");
        System.out.println("8~ Exit the stack");
        do {
            System.out.println("Please enter your choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter the number to be pushed : ");
                    int num = sc.nextInt();
                    stack.push(num);
                    break;
                }
                case 2: {
                    in = stack.pop();
                    System.out.println("The deleted element is %d \n");
                    break;

                }
                case 3: {
                    stack.isFull();
                    break;
                }
                case 4: {
                    stack.isEmpty();
                    break;
                }
                case 5: {
                    System.out.println("The size of the stack is " + stack.top + 1);
                    break;
                }
                case 6: {
                    System.out.println("The top element of the stack is  " + stack.top);
                    break;
                }
                case 7: {
                    System.out.println("All the elements of the stack are : ");
                    stack.printStack();
                    break;
                }
                case 8: {
                    System.out.println("Exit");
                    break;
                }
                default: {
                    System.out.println("~~~!!!Please check the value entered !!!~~~");
                    break;
                }

            }

        } while (choice != 9);
    }
}