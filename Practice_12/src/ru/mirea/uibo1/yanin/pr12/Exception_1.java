package ru.mirea.uibo1.yanin.pr12;

public class Exception_1 {
    public void exceptionDemo() {
        System.out.println(2/0);
    }

    public static void main(String[] args) {
        Exception_1 demo = new Exception_1();
        demo.exceptionDemo();
    }
}
