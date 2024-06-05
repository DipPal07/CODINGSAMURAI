import java.util.Scanner;

/**
 * calculator
 */
public class calculator {
    private static
    int n;
    private int num1;
    private int num2;
    private static int res;
    public
    // menu options for the user to choose from. It displays the following options:
    static void display()
    {
        System.out.println("Enter '1' for Addition");
        System.out.println("Enter '2' for Subtraction");
        System.out.println("Enter '3' for Multiplication");
        System.out.println("Enter '4' for Division");
        System.out.println("Enter '5' for Exit");
    }
    /*
    The function input1 reads an integer input from the user using the Scanner class in Java.
     */
    int input1()
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        return num;
    }
    /**
     * The addn function in Java takes two integer parameters and returns their sum.
     */
    /**
     * The function addn takes two integers as input, adds them together, and prints the result.
     * 
     * @param num1 The parameter num1 is an integer that represents the first number to be added.
     * @param num2 The parameter num2 in the addn function is an integer that represents the second
     * number to be added.
     */
    static void addn(int num1,int num2)
    {
        res=num1+num2;
        System.out.println("Result is  = "+res);
    }

    
   /**
    * The function performs subtraction of two numbers and prints the result.
    * 
    * @param num1 The num1 parameter represents the first number in the subtraction operation.
    * @param num2 The parameter num2 is the second number that will be subtracted from the first
    * number num1 in the subtraction function.
    */
    static void subtraction(int num1,int num2)
    {
        res = num1-num2;
        System.out.println("Result is = "+res);
    }
    /**
     * The function "multiplication" takes two integers as input, multiplies them together, and prints
     * the result.
     * 
     * @param num1 The parameter num1 is the first integer value that will be multiplied in the
     * multiplication function.
     * @param num2 The parameter num2 in the multiplication function is an integer representing the
     * second number that will be multiplied with num1 to calculate the result.
     */
    static void multiplication(int num1,int num2)
    {
        res= num1*num2;
        System.out.println("Result is = "+res);
    }
    
    // The division method in the provided Java code snippet is responsible for performing division
    // operation between two numbers and handling the scenario where the second number is zero
    // (division by zero). Here's a breakdown of what the method does:
    static void division(int num1,int num2)
    {
        try {
            res=num1/num2;
            System.out.println("Result is = "+res);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Cannot divided by zero");
        }
        
    }
    public static void main(String[] args) throws ArithmeticException{
        calculator c=new calculator();
        c.display();
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int num1,num2,result=0;
        // The code snippet if (n==1 || n==2 || n==3|| n==4 || n==5) { is checking the value of the
        // variable n to see if it matches any of the numbers 1, 2, 3, 4, or 5. If n matches any of
        // these values, it prompts the user to enter the first number, reads the input using the
        // input1() method, then prompts the user to enter the second number and reads that input as
        // well. This is part of the logic to handle different operations based on the user's choice in
        // the calculator program.
        if (n==1 || n==2 || n==3|| n==4 || n==5) {
        System.out.println("Enter 1st number");
        num1= c.input1();
        System.out.println("Enter the second number");
        num2=c.input1();
        // The switch (n) statement in the code snippet you provided is a control flow statement in
        // Java that allows the program to execute different blocks of code based on the value of the
        // variable n. Here's a breakdown of what each case does:
        switch (n) {
            case 1:
                addn(num1,num2);
                break;
            case 2:
                subtraction(num1,num2);
                break;
            case 3:
                multiplication(num1,num2);
                break;
            case 4:
                division(num1,num2);
                break;
            default:
            System.out.println("exit");
                System.exit(0);
                break;
        }
            
    }
    else
    System.out.println("Wrong input ");
    //System.exit(0);
}
}