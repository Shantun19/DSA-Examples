/*
1    
01   
101  
0101 
10101
*/

class Main {
    public static void main(String[] args) {
        int r = 5;
        int c = 5;
        
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                if(j <= i) {
                    if(i%2 == 0) {
                        int k = (j%2 == 0) ? 1 : 0;
                        System.out.print(k);
                    }
                    else {
                        int k = (j%2 == 0) ? 0 : 1;
                        System.out.print(k);
                    }
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
