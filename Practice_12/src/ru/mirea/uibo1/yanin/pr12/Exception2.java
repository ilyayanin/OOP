package ru.mirea.uibo1.yanin.pr12;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();


            int i = Integer.parseInt(intString);


            System.out.println(2/i);

        } catch (NumberFormatException e) {

            System.out.println("Error: Input is not a valid integer format.");
        } catch (ArithmeticException e) {

            System.out.println("Error: Attempted division by zero.");
        } finally {

            myScanner.close();
        }
    }

    public static void main(String[] args) {
        Exception2 demo = new Exception2();
        demo.exceptionDemo();
    }
}
