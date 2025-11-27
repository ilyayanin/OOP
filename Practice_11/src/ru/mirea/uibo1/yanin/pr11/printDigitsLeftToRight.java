package ru.mirea.uibo1.yanin.pr11;

public static void printDigitsLeftToRight(int n) {
    // Base Case: No more digits to process
    if (n == 0) {
        return;
    }

    // 1. Recursive Step (Process N/10 first - pre-order)
    printDigitsLeftToRight(n / 10);

    // 2. Print the last digit of the current number (N % 10)
    System.out.print(n % 10 + " ");
}