/*

A    
BB   
CCC  
DDDD 
EEEEE

*/

class Main {
    public static void main(String[] args) {
        char ch = 64;
        for(int i=0; i<5; i++) {
            ch++;
            for(int j=0; j<5; j++) {
                if(j <= i) {
                    System.out.print(ch);
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
