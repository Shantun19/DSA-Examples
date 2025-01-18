import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean firstAns = checkForPrimeNumberMethod1(number);
        boolean secondAns = checkForPrimeNumberMethod2(number);
        boolean thirdAns = checkForPrimeNumberMethod3(number);
    }

    // time complexity O(n).
    public static boolean checkForPrimeNumberMethod1(int number) {
        if(number <= 1) return false;
        for(int i=2; i<number; i++) {
            if(number % i == 0) return false;
        }
        return true;
    }

    // using trial division method. time O(Math.sqrt(number))
    public static boolean checkForPrimeNumberMethod2(int number) {
        if(number <= 1) return false;
        for(int i=2; i<Math.sqrt(number); i++) {
            if(number % i == 0) return false;
        }
        return true;
    }

    // using optimial trial division
    public static boolean checkForPrimeNumberMethod3(int number) {
        if(number <= 1) return false;
        if(number == 2 || number == 3) return true;
        // a number is in the form of 6k , 6k+2 , 6k+3 , 6k+4 are divisible by 2 and 3 and these number are not the prime Number.
        if(number % 2 == 0 || number % 3 == 0) return false;
        // a prime is in the form of 6k+1 and 6k+5.
        for(int i = 5; i < Math.sqrt(number); i += 6) {
            if(number % i == 0 || number % (i + 2) == 0) return false;
        }
        return true;
    }
}

