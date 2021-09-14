
package com.company;
import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
                int num1;
                int num2;
               
                String operation;
                Scanner input = new Scanner(System.in);
                //Enter the numbers
            System.out.println("please enter the first number");
                num1 =input.nextInt();
            System.out.println("please enter the second number");

                num2 =input.nextInt();
                Scanner op = new Scanner(System.in);
                //Enter the operation
            System.out.println("Please enter operation");
                operation =op.next();
        }
    }

