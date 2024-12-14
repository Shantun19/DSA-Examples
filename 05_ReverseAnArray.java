class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        reverseByBF(arr);
        System.out.println();
        reverseByApproach01(arr);
        System.out.println();
        reverseByApproach02(arr);
        System.out.println();
        reverseByApproach03(arr , 0 , arr.length-1);
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
    }
    
    // brute force approach.
    // tc : o(n)
    // sc : o(n)
    public static void reverseByBF(int[] arr) {
        int[] temp = new int[arr.length];
        int index = 0;
        for(int i=arr.length-1; i>=0; i--) {
            temp[index++] = arr[i];
        }
        // print the array 
        for(int ele : temp) {
            System.out.print(ele + " ");
        }
    }
    
    // tc : o(n)
    // sp : o(1)
    public static void reverseByApproach01(int[] arr) {
        int start_pointer = 0;
        int end_pointer = arr.length - 1;
        while(start_pointer <= end_pointer) {
            int temp = arr[start_pointer];
            arr[start_pointer] = arr[end_pointer];
            arr[end_pointer] = temp;
            start_pointer++;
            end_pointer--;
        }
        // print the array 
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
    }
    
    // tc : o(n)
    // sp : o(1)
    public static void reverseByApproach02(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n/2; i++) {
            int t = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = t;
        }
        // print the array 
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
    }
    
    // tc : (n)
    // sc : o(1)
    public static void reverseByApproach03(int[] arr , int start , int end)
    {
        if(start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseByApproach03(arr , start + 1 , end -1);
        }
        else return;
    }
}
