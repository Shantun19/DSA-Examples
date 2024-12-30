// link : https://www.geeksforgeeks.org/problems/count-digits5716/1

import java.util.*;

/*

Given a number n. Count the number of digits in n which evenly divide n. Return an integer, total number of digits of n which divides n evenly.
Note :- Evenly divides means whether n is divisible by a digit i.e. leaves a remainder 0 when divided.

*/

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("the result is : " + countDigits(n));
    }

    public static int countDigits(int n) { // 12
        int temp = n;
        int count = 0;
        while(n != 0) {
            // get the last digit of the given number .
            int lastDigit = n % 10;
            if((temp % lastDigit == 0)) count++;
            n/=10;
        }

        return count;
    }

}




/* another approach */

class Main {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(countDigitsUsingMethod1(n));
        System.out.println(countDigitsUsingMethod2(n));
        System.out.println(countDigitsUsingMethod3(n));
    }
    
    public static int countDigitsUsingMethod1(int n) {
        int temp = n;
        int count = 0;
        while(temp != 0) {
            count++;
            temp/=10;
        }
        return count;
    }
    
    public static int countDigitsUsingMethod2(int n) {
        return Integer.toString(n).length();
    }
    
    public static int countDigitsUsingMethod3(int n) {
        return (int)Math.log10(n) + 1;
    }
}
