import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        printAllDivisorUsingBruteforceApproach(number);
        printAllDivisorUsingOptimalApproach(number);
    }

    public static void printAllDivisorUsingBruteforceApproach(int number) {
        for(int i=2; i<=number; i++) {
            if(number % i == 0) System.out.println(i);
        }
    }

    public static void printAllDivisorUsingOptimalApproach(int number) {
        for(int i = 1; i * i <= number; i++) {
            if(number % i == 0) {
                int secondNumber = (number / i);
                System.out.println(i);
                if(secondNumber != i) System.out.println(secondNumber);
            }
        }
    }
}
