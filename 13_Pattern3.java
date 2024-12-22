/*
0    
01   
012  
0123 
01234
*/

class Main {
    public static void main(String[] args) {
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                if(j <= i) System.out.print(j);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
