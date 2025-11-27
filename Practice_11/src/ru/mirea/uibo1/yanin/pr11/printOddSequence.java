package ru.mirea.uibo1.yanin.pr11;

public static void printOddSequence() {
    Scanner scanner = new Scanner(System.in); // Assuming input reading
    int n = scanner.nextInt();

    // Base Case
    if (n == 0) {
        return;
    }

    // Recursive Step
    if (n % 2 != 0) {
        System.out.println(n); // Print the number if it's odd
    }

    printOddSequence(); // Recursive call for the next number
}