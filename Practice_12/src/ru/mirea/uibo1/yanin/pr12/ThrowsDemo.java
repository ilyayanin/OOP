package ru.mirea.uibo1.yanin.pr12;

public class ThrowsDemo {
    public void getDetails(String key) {
        try {
            if (key == null) {

                throw new NullPointerException("null key in getDetails");
            }

            System.out.println("Processing key: " + key);
        } catch (NullPointerException e) {

            System.out.println("Caught inside getDetails: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();

        demo.getDetails(null);

        demo.getDetails("test_key");
    }
}