/*

*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

*/

class Main {
    public static void main(String[] args) {
        int r = 9;
        int c = 10;
        
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                if(i <= r/2) {
                    if(j <= i || j >= 9-i) {
                        System.out.print("*");
                    }
                    else System.out.print(" ");   
                }
                else {
                    int k = i - 5;
                    if(j <= 3 - k || j >= 6 + k) {
                        System.out.print("*");
                    }
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
