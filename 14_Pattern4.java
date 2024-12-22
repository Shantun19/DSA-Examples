/*

0    
11   
222  
3333 
44444

*/

class Main {
    public static void main(String[] args) {
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                if(j <= i) System.out.print(i);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
