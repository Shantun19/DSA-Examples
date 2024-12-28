/*

**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

*/

class Main {
    public static void main(String[] args) {
        int r = 10;
        int c = 10;
        
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                if(i < r/2) {
                    if(j <= 4 - i || j >= 5 + i) {
                        System.out.print("*");
                    }
                    else System.out.print(" ");
                }
                else {
                    int k = i - 5;
                    if(j <= k || j >= 9-k) {
                        System.out.print("*");
                    }
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
