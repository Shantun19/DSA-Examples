import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); // 1234
        if(checkForAmstrongNumber(number)) {
            System.out.print(number + " is a Amstrong Number");
        }
        else System.out.print(number + " is not a Amstrong Number");
    }

    public static boolean checkForAmstrongNumber(int number) {
        int duplicateNumber = number;
        int dig = findTheNumberOfDigits(number);
        int totalSum = 0;
        while(duplicateNumber != 0) {
            totalSum += (int) Math.pow(duplicateNumber%10 , dig);
            duplicateNumber /= 10;
        }
        return totalSum == number;
    }

    public static int findTheNumberOfDigits(int number) {
        return Integer.toString(number).length();
    }
}
