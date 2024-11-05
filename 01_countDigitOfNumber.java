import java.util.*;

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("the Number of digits in using optimal way " + n + " is " + count_dig(n));
        System.out.println("the Number of digits in using brute force way " + n + " is " + count_dig_2(n));
        System.out.println("the Number of digits in using recursion " + n + " is " + count_digit_using_recursion(n));
    }

    // optimal approach.
    public static int count_dig(int n) {
        return (int) (Math.log10(n) + 1);
    }

    // brute force approach.
    public static int count_dig_2(int n) {
        int count = 0;
        while(n != 0) {
            count++;
            n/=10;
        }
        return count;
    }

    // using recursive approach
    public static int count_digit_using_recursion(int n) {
        if(n == 0) return 0;
        return 1 + count_digit_using_recursion(n/=10);
    }
}



