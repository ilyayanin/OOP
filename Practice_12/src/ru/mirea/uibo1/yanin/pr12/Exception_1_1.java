package ru.mirea.uibo1.yanin.pr12;

public class Exception_1_1 {
    public void exceptionDemo() {
        try {
            System.out.println(2/0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        Exception_1_1 demo = new Exception_1_1();
        demo.exceptionDemo();
    }
}