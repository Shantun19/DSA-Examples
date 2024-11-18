import java.util.*;

public class Sample {

    public static  class MinMaxPair {
        int min;
        int max;
    }

    public static void main(String[] args) {
        // Find the minimum and maximum element from an array.
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 12, 43, 100, -1, 56, 7};

        // Method 1: Linear search for min and max
        /*
         * This method takes O(n) time and O(1) space.
         */
        findMinValue(arr);
        findMaxValue(arr);

        // Method 2: Using sorting to find min and max
        /*
         * This method takes O(n log n) time and O(1) space.
         * The number of comparisons is also O(n log n),
         * as sorting the array requires comparisons equivalent to finding min and max.
         */
        findMinMaxValue(arr);

        // method - 3
        /* using linear search
        the no. of comparison would be : 2n-3 (for the worst case)
        * */
        findMinMaxUsingLinearSearch(arr);

        // method - 4
        // using tournament method : here we divide the array into the 2 parts
        // find the min and max from the left side array and find the min and max from the right side array.
        MinMaxPair obj = findMinMaxUsingTournamentMethod(arr , 0 , arr.length-1);
        System.out.println("The minimum element is using tournament" + obj.min);
        System.out.println("The maximum element is using tournament" + obj.max);
    }

    public static void findMinValue(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int ele : arr) {
            if (ele < min) {
                min = ele;
            }
        }
        System.out.println("The minimum element is " + min);
    }

    public static void findMaxValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int ele : arr) {
            if (ele > max) {
                max = ele;
            }
        }
        System.out.println("The maximum element is " + max);
    }

    public static void findMinMaxValue(int[] arr) {
        Arrays.sort(arr); // O(n log n) time complexity.
        System.out.println("The minimum element is " + arr[0]);
        System.out.println("The maximum element is " + arr[arr.length - 1]);
    }

    public static void findMinMaxUsingLinearSearch(int[] arr) {
        // create a class with min and max properties.
        MinMaxPair obj = new MinMaxPair();

        if(arr.length == 1) {
            obj.max = arr[0];
            obj.min = arr[0];
            System.out.println(" array contains single element");
        }

        // for the first comparison
        if(arr[0] > arr[1]) {
            obj.min = arr[1];
            obj.max = arr[0];
        }
        else {
            obj.min = arr[0];
            obj.max = arr[1];
        }

        // comparison for the rest of the element.
        for(int i=2; i<arr.length; i++) {
            if(arr[i] > obj.max) {
                obj.max = arr[i];
            }
            else if(arr[i] < obj.min) {
                obj.min = arr[i];
            }
        }

        System.out.println("The minimum element is " + obj.min);
        System.out.println("The maximum element is " + obj.max);
    }

    public static MinMaxPair findMinMaxUsingTournamentMethod(int[] arr, int start, int end) {
        MinMaxPair obj = new MinMaxPair();

        // If there is only one element in the array
        if (start == end) {
            obj.min = arr[start];
            obj.max = arr[end];
            return obj;
        }

        // If the array contains only two elements
        if (end == start + 1) {
            if (arr[start] > arr[end]) {
                obj.max = arr[start];
                obj.min = arr[end];
            } else {
                obj.min = arr[start];
                obj.max = arr[end];
            }
            return obj;
        }

        // If the array length is greater than 2, divide it into two parts
        int mid = (start + end) / 2;

        // Recursively find the min and max for the left half
        MinMaxPair leftMinMaxPair = findMinMaxUsingTournamentMethod(arr, start, mid);

        // Recursively find the min and max for the right half
        MinMaxPair rightMinMaxPair = findMinMaxUsingTournamentMethod(arr, mid + 1, end);

        // Determine the overall min and max
        obj.min = Math.min(leftMinMaxPair.min, rightMinMaxPair.min);
        obj.max = Math.max(leftMinMaxPair.max, rightMinMaxPair.max);

        return obj;
    }
}
