import java.util.*;

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sumOfRecursion(n);
        System.out.print("The sum of recursion is => " + sum);
    }

    public static int sumOfRecursion(int n) {
        if(n == 0) return n;
        return (n % 10) + sumOfRecursion(n / 10);
    }
}
