/*
   A   
  ABA  
 ABCBA 
ABCDCBA

*/

class Main {
    public static void main(String[] args) {
        int r = 4;
        int c = 7;
        
        for(int i=0; i<r; i++) {
            char ch = 'A';
            for(int j=0; j<c; j++) {
                if(j >= 3 - i && j <= 3 + i) {
                    if(j <= c/2) {
                        System.out.print(ch);
                        if(j != 3) ch++;
                    }
                    else {
                        ch--;
                        System.out.print(ch);
                    }
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
