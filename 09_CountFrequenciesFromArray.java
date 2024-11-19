import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        countFrequencies(arr);
        countFrequencies_inOrder(arr);
        countFrequenciesUsingBinarySearch(arr); // for constant space 
    }
    
    // the time complexity is o(n) and space o(n)
    // the order is display the output is not same as the input in the array.
    public static void countFrequencies(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int ele : arr) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Element: " + entry.getKey() + " Frequency: " + entry.getValue());
        }
    }
    
    // this method is use to display the output in the correct order.
    // as they present in the array.
    // time o (n) and space o(n)
    public static void countFrequencies_inOrder(int[] arr) {
        Map<Integer , Integer> map = new HashMap<Integer , Integer>();
        for(int ele : arr) {
            map.put(ele , map.get(ele) == null ? 1 : (map.get(ele)) + 1);
        }
        // display in the same order : 
        for(int ele : arr) {
            if(map.get(ele) != -1) {
                System.out.println(ele + " => " + map.get(ele));
                map.put(ele , -1);
            }
        }
    }
    
    public static void countFrequenciesUsingBinarySearch(int[] arr) {
        Arrays.sort(arr);
        
        for(int i=0; i<arr.length; i++) {
            int firstIndex = getIndex(arr , arr[i] , "first"); // 0 
            int lastIndex = getIndex(arr , arr[i] , "last"); // 0 
            int fre = (lastIndex - firstIndex) + 1;
            System.out.println("element " + arr[i] + " frequencies " + fre);
            i = lastIndex;
        }
    }
    
    public static int getIndex(int[] arr , int ele , String pos) {
        if(pos == "first") {
            for(int i=0; i<arr.length; i++) {
                if(arr[i] == ele) return i; // 0 
            }
        }
        else if(pos == "last") {
            for(int i=arr.length - 1; i>=0; i--) {
                if(arr[i] == ele) return i; // 0 
            }
        }
        
        return -1;
    }
}
