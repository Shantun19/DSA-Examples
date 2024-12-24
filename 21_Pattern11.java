/*

1      1
12    21
123  321
12344321

*/

class Main {
    public static void main(String[] args) {
        int r = 4;
        int c = 8;
        int k = 1;
        
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                if(j < 4) {
                    if(j <= i || j >= 7 - i ) {
                        System.out.print(k);
                        k++;
                    }
                    else System.out.print(" ");
                }
                else {
                    if(j <= i || j >= 7 - i ) {
                        k--;
                        System.out.print(k);
                    }
                    else System.out.print(" ");
                }
            }
            System.out.println();
            k = 1;
        }
    }
}

