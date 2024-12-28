/*

4444444
4333334
4322234
4321234
4322234
4333334
4444444

*/

class Main {
    public static void main(String[] args) {
        int n = 4;
        int size = 2 * n - 1; // Grid size (7 for n = 4)

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int val = n - Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));
                System.out.print(val);
            }
            System.out.println();
        }
    }
}
