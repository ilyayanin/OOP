package ru.mirea.uibo1.yanin.pr11;

/* Conceptual structure to handle state without parameters */
public static void processEvenIndex() {
    // Read the number at the 2nd, 4th, 6th... position
    int n = scanner.nextInt(); // Assume scanner is available globally/via context
    if (n == 0) { // Base Case
        return;
    }
    // Skip this number (it's at an even position)
    processOddIndex(); // Move to the next (odd) position
}

public static void processOddIndex() {
    // Read the number at the 1st, 3rd, 5th... position
    int n = scanner.nextInt(); // Assume scanner is available globally/via context
    if (n == 0) { // Base Case
        return;
    }
    System.out.println(n); // Print this number (it's at an odd position)
    processEvenIndex(); // Move to the next (even) position
}

public static void main(String[] args) {
    // The main program starts by calling the function for the first (odd) element
    processOddIndex();
}
