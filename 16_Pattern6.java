/*

    *    
   ***   
  *****  
 ******* 
*********

*/

class Main {
    public static void main(String[] args) {
        int r = 5;
        int c = 9;
        
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                if(j >= 4 - i && j <= 4+i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
