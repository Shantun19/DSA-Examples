import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String companyName = "Salesforce";
        int times = 5;
        printNumberUsingRecursion(times, companyName);
    }

    public static void printNumberUsingRecursion(int times, String name) {
        if (times == 0) return;
        printNumberUsingRecursion(times - 1, name);
        System.out.print(name + " ");
    }
}
