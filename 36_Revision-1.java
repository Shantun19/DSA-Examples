import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printPattern1();
        System.out.println();
        printPattern2();
        System.out.println();
        printPattern3();
        System.out.println();
        printPattern4();
        System.out.println();
        printPattern5();
        System.out.println();
        printPattern6();
        System.out.println();
        printPattern7();
        System.out.println();
        printPattern8();
        System.out.println();
        printPattern9();
        System.out.println();
        printPattern10();
        System.out.println();
        printPattern11();
        System.out.println();
        printPattern12();
        System.out.println();
        printPattern13();
        System.out.println();
        printPattern14();
        System.out.println();
        printPattern15();
        System.out.println();
        int n = 12345;
        countDigits(n);
        System.out.println();
        reverseNumber(n);
        System.out.println();
        checkPalindrome(n);
        System.out.println();
        calculateTheGCD(12 , 18);
        System.out.println();
        amstrongNumber(1234);
        System.out.println();
        printAllDivisor(36);
        System.out.println();
        checkForThePrime(3);
    }

    public static void printPattern1() {
        int row = 5;
        int col = 5;
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printPattern2() {
        int row = 5;
        int col = 5;
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(j <= i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printPattern3() {
        int row = 5;
        int col = 5;
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(j <= 4 - i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printPattern4() {
        int row = 5;
        int col = 9;
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(j >= 4 - i && j <= 4 + i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printPattern5() {
        int row = 5;
        int col = 9;
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(j >= i && j <= 8 - i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printPattern6() {
        int row = 10;
        int col = 9;
        for(int i=0; i<row; i++) {
            for(int j =0; j<col; j++) {
                if(i <= row/2) {
                    if(j >= 4 - i && j <= 4 + i) System.out.print("*");
                    else System.out.print(" ");
                }
                else {
                    int k = i - 5;
                    if(j >= k && j <= 8 - k) System.out.print("*");
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printPattern7() {
        int row = 9;
        int col = 5;
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(i <= row / 2) {
                    if(j <= i) System.out.print("*");
                    else System.out.print(" ");
                }
                else {
                    int k = i - 5;
                    if(j <= 3 - k) System.out.print("*");
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printPattern8() {
        int row = 5;
        int col = 5;
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(j <= i) {
                    if(i % 2 == 0) {
                        int k = (j%2 == 0 ? 1 : 0);
                        System.out.print(k);
                    }
                    else {
                        int k = (j%2 == 0 ? 0 : 1);
                        System.out.print(k);
                    }
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printPattern9() {
        int row = 4;
        int col = 8;
        int k = 1;
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(j < 4) {
                    if(j <= i || j >= 7-i) {
                        System.out.print(k);
                        k++;
                    }
                    else System.out.print(" ");
                }
                else {
                    if(j <= i || j >= 7-i) {
                        k--;
                        System.out.print(k);
                    }
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printPattern10() {
        int row = 5;
        int col = 5;
        int k = 1;
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(j <= i) System.out.print(k++ + " ");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printPattern11() {
        int row = 5;
        int col = 5;
        for(int i=0; i<row; i++) {
            char ch = 'A';
            for(int j=0; j<col; j++) {
                if(j <= i) System.out.print(ch++);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printPattern12() {
        int row = 5;
        int col = 5;
        for(int i=0; i<row; i++) {
            char ch = 'A';
            for(int j=0; j<col; j++) {
                if(j <= 4 - i) System.out.print(ch++);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printPattern13() {
        int row = 5;
        int col = 5;
        char ch = 64;
        for(int i=0; i<row; i++) {
            ch++;
            for(int j=0; j<col; j++) {
                if(j <= i) System.out.print(ch);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printPattern14() {
        int row = 4;
        int col = 7;
        for(int i=0; i<row; i++) {
            char ch = 'A';
            for(int j=0; j<col; j++) {
                if(j >= 3 - i && j <= 3 + i) {
                    System.out.print(ch);

                    if(j < col/2) ch++;
                    else ch--;
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printPattern15() {
        int row = 5;
        int col = 5;
        char ch = 'E';
        for(int i=0; i<row; i++) {
            char temp = (char)(ch - i);
            for(int j=0; j<col; j++) {
                if(j <= i) System.out.print(temp++);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void countDigits(int n) {
        int dig = String.valueOf(n).length();
        System.out.println("the Number of digits in " + n + " is " + dig);
    }

    public static void reverseNumber(int n) {
        int temp = n;
        int rev = 0;
        while(temp != 0) {
            rev = (rev * 10) + (temp % 10);
            temp/=10;
        }
        System.out.println("The reverse digits are : " + rev);
    }

    public static void checkPalindrome(int n) {
        int temp = n;
        int rev = 0;
        while(temp != 0) {
            rev = (rev * 10) + (temp % 10);
            temp/=10;
        }
        if(rev == n) System.out.println("Palindrome Number");
        else System.out.print("Not a Palindrome Number");
    }

    public static void calculateTheGCD(int a , int b) {
        int min_element = Math.min(a , b);
        int gcd = 0;
        for(int i=2; i<min_element; i++) {
            if(a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println("the gcd of a Number is : " + gcd);
    }

    public static void amstrongNumber(int n) {
        int digits = 0;
        // calculate the digits
        int temp = n;
        while(temp != 0) {
            digits++;
            temp/=10;
        }
        int current_temp = n;
        int sum = 0;
        while(current_temp != 0) {
            sum += Math.pow((current_temp % 10) , digits);
            current_temp/=10;
        }
        if(sum == n) System.out.println("Amstrong Number");
        else System.out.print("Not a Amstrong Number");
    }

    public static void printAllDivisor(int n) {
        for(int i=2; i*i <= n; i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
                if(i != (n/i)) System.out.print((n/i) + " ");
            }
        }
    }

    public static void checkForThePrime(int n) {
        if(n <= 1) System.out.println("Not a Prime Number");
        for(int i=2; i<Math.sqrt(n); i++) {
            if(n % i == 0) System.out.println("Not a Prime Number");
        }
        System.out.println(n + " is a prime Number");
    }
}

