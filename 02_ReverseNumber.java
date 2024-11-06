// link : https://leetcode.com/problems/reverse-integer/description/


class Solution {
    public int reverse(int x) {
        long finalNum = 0;
        while(x!=0){
            int lastDig = x%10;
            finalNum += lastDig;
            finalNum = finalNum*10;
            x= x/10;
        }
        finalNum = finalNum/10;
        if(finalNum > Integer.MAX_VALUE || finalNum<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)(-1*finalNum);
        }
        return (int)finalNum;
    }
}

// or 

class Solution {
    public int reverse(int n) {
        return reversedDigits(n);
    }

    public static int reversedDigits(int n) { // 123
        long result = 0;

        while(n != 0) {
            result = (result * 10) + (n % 10);
            n/=10;
        }
        
        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) return 0;
        if(n < 0) return (int)(-1 * result);
        return (int)result;
    }
}
