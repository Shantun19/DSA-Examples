/*

E    
DE   
CDE  
BCDE 
ABCDE

*/

class Main {
    public static void main(String[] args) {
        char ch = 'E';
        for(int i = 0; i < 5; i++) {
            char temp = (char)(ch - i);
            for(int j = 0; j < 5; j++) { 
                if(j <= i) {
                    System.out.print(temp);
                    temp++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


