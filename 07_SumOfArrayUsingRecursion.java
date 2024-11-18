import java.util.*;

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3};
        int sum = sumUsingRecursion(arr , arr.length - 1);
        System.out.print("the sum of the array is : " + sum);

    }

    public static int sumUsingRecursion(int[] arr , int endIndex) {
        if(endIndex < 0) return 0;
        return sumUsingRecursion(arr , endIndex - 1) + arr[endIndex];
    }
}
