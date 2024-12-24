/*

*    
**   
***  
**** 
*****
**** 
***  
**   
*

*/


class Main {
    public static void main(String[] args) {
        int r = 9;
        int c = 5;
        
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                if(i <= r/2) {
                    if(j <= i) System.out.print("*");
                    else System.out.print(" ");
                }
                else {
                    // i = 5 k = 0 
                    // i = 6 k = 1 
                    int k = i - 5; 
                    if(j <= 3 - k) System.out.print("*");
                    else System.out.print(" "); 
                }
            }
            System.out.println();
        }
    }
}
