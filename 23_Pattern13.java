/*

A    
AB   
ABC  
ABCD 
ABCDE

*/

class Main {
    public static void main(String[] args) {
        int r = 5;
        int c = 5;
        
        for(int i=0; i<r; i++) {
            char ch = 'A';
            for(int j=0; j<5; j++) {
                if(j <= i) {
                    System.out.print(ch);
                    ch++;
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
