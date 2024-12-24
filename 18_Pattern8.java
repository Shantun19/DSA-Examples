class Main {
    public static void main(String[] args) {
        int r = 10;
        int c = 9;
        
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                if(i < r/2) {
                    if(j >= 4-i && j <= 4+i) System.out.print("*");
                    else System.out.print(" ");
                }
                else {
                    // i = 5 and j = 0; to k = i - 5; // 0 
                    // i = 6 and j = 0; to k = i - 5; // 1
                    // i = 7 and j = 0; to k = i - 5; // 2 
                    // i = 8 and j = 0; to k = i - 5; // 3 
                    // i = 9 and j = 0; to k = i - 5; // 4 
                    int k = i - 5;
                    if(j >= k && j <= 8-k) System.out.print("*");
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
