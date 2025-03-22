import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int getDigitCount_bruteForce = returnDigitCount_bruteForce(num);
        System.out.println("the count of digits is using brute force approach " + getDigitCount_bruteForce);
        int getDigitCount_optimal = returnDigitCount_optimal(num);
        System.out.println("the count of digits is using optimal approach " + getDigitCount_optimal);
        int getDigitCount_optimalApproach = returnDigitCount_optimalApproach(num);
        System.out.println("the count of digits is using 2nd optimal approach " + getDigitCount_optimalApproach);
        int getDigitCount_recursion = returnDigitCount_recursion(num);
        System.out.println("the count of digits is using Recursion " + getDigitCount_recursion);
    }

    // brute force approach
    public static int returnDigitCount_bruteForce(int n) {
        int count = 0;
        while(n != 0) {
            count++;
            n/=10;
        }
        return count;
    }

    // using optimal approach
    public static int returnDigitCount_optimal(int n) {
        return String.valueOf(n).length();
    }

    // using math logic
    public static int returnDigitCount_optimalApproach(int n) {
        return (int)(Math.log10(n) + 1); // log10 of an integer will be the one less digits of a number;
    }

    // using recursion
    public static int returnDigitCount_recursion(int n) {
        if(n == 0) return 0;
        return 1 + returnDigitCount_recursion(n/10);
    }

}
