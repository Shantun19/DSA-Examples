import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        // declare a prefix sum array.
        int[] prefixSum = new int[arr.length];
        prefixSum = performPrefixSum(arr);
        
        int left = 3;
        int right = 5;
        
        System.out.println(prefixSum[right] - prefixSum[left - 1]);
    }
    
    public static int[] performPrefixSum(int[] arr) {
        int[] prefix = new int[arr.length];
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
            prefix[i] = sum;
        }
        
        return prefix;
    }
}
