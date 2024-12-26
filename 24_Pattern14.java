/*

ABCDE
ABCD 
ABC  
AB   
A  

*/

class Main {
    public static void main(String[] args) {
        for(int i=0; i<5; i++) {
            char ch = 'A';
            for(int j=0; j<5; j++) {
                if(j <= 4 - i) {
                    System.out.print(ch);
                    ch++;
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
