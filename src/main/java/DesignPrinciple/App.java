package DesignPrinciple;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator c = new Calculator();
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("**** MENU ****");
            System.out.println("1. Add ");
            System.out.println("2. Subtract ");
            System.out.println("3. Multiply ");
            System.out.println("4. Divide ");
            System.out.println("5. Exit ");
            System.out.println("ENTER YOUR CHOICE");
            choice = sc.nextInt();
            System.out.println("Enter two numbers");
            System.out.print("Number 1:");
            int num1 = sc.nextInt();
            System.out.print("Number 2:");
            int num2 = sc.nextInt();
            switch (choice){
                case 1: System.out.println(num1 + " + " + num2 + " = " + c.add(num1,num2));
                        break;
                case 2: System.out.println(num1 + " - " + num2 + " = " + c.sub(num1,num2));
                        break;
                case 3: System.out.println(num1 + " x " + num2 + " = " + c.multiply(num1,num2));
                        break;
                case 4: System.out.println(num1 + " / " + num2 + " = " + c.divide(num1,num2));
                        break;
                case 5: System.out.println("Program terminated");
                        System.exit(0);
                        break;
                default: System.out.println("Wrong Input");
            }
        }while(choice!=5);
    }
}
