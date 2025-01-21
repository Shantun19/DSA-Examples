import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        printNumberUsingRecursion(n);
    }

    public static void printNumberUsingRecursion(int n) { // 10
        // base condition
        if(n <= 0) return;
        printNumberUsingRecursion(n - 1); // assuming that this line print the Number from 1 to 9
        System.out.print(n + " "); // when Number 1 to 9 gets printed at last print the 10.
    }
}
