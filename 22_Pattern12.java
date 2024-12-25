/*

1     
2 3    
4 5 6   
7 8 9 10  
11 12 13 14 15

*/

class Main {
    public static void main(String[] args) {
        int r = 5;
        int c = 5;
        int k = 1;
        
        for(int i=0; i<r; i++) {
            for(int j=0; j<5; j++) {
                if(j <= i) {
                    System.out.print(k+" ");
                    k++;
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
