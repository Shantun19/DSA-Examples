import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans_1 = findGCDUsingNaiveApproach(a , b);
        int ans_2 = findGCDUsingEuclidAlgorithmOfSubtraction(a,b);
        int ans_3 = findGCDUsingEuclidAlgorithmOfSubtractionUsingRecursion(a,b);
        int ans_4 = findGCDUsingDivisionApproach(a , b);

        System.out.println("findGCDUsingNaiveApproach : " + ans_1);
        System.out.println("findGCDUsingEuclidAlgorithmOfSubtraction : " + ans_2);
        System.out.println("findGCDUsingEuclidAlgorithmOfSubtractionUsingRecursion : " + ans_3);
        System.out.println("findGCDUsingDivisionApproach : " + ans_4);
    }

    // find the gcd of two number using naive approach.
    public static int findGCDUsingNaiveApproach(int a , int b) {
        int minNumber = Math.min(a , b);
        while(minNumber != 0) {
            if(a%minNumber == 0 && b%minNumber == 0) break;
            minNumber--;
        }
        return minNumber;
    }

    // find the gcd of two number using euclid algorithm of subtraction using while loop.
    public static int findGCDUsingEuclidAlgorithmOfSubtraction(int a , int b) {
        while(a != 0 && b != 0) {
            if(a > b) a = a - b;
            else b = b - a;
        }
        return (a != 0) ? a : b;
    }

    // find the gcd of two number using euclid algorithm of subtraction using Recursion.
    public static int findGCDUsingEuclidAlgorithmOfSubtractionUsingRecursion(int a , int b) {
        if(a == 0) return b;
        if(b == 0) return a;
        if(a == b) return a;
        if(a > b) return findGCDUsingEuclidAlgorithmOfSubtractionUsingRecursion(a-b , b);
        return findGCDUsingEuclidAlgorithmOfSubtractionUsingRecursion(a , b - a);
    }

    // find gcd of two Number using division method.
    public static int findGCDUsingDivisionApproach(int a , int b) {
        if(b == 0) return a;
        return findGCDUsingDivisionApproach(b , a%b);
    }
}
