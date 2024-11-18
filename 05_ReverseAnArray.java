import java.util.*;

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1 , 2 , 3 , 4 , 5};
        reverse_arr(arr , 0 , arr.length - 1);
        for(int e : arr) System.out.print(e + " ");
    }

    public static void reverse_arr(int[] arr , int start , int end) {
       if(start >= end) return; // when start get bigger than end then the array gets reversed.

        // swapping logic to swap the elements.
       int t = arr[start];
       arr[start] = arr[end];
       arr[end] = t;

       // recursive call.
       reverse_arr(arr , start + 1 , end -1);

    }
}
