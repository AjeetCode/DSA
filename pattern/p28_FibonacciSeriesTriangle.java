// 0
// 1 1
// 2 3 5
// 8 13 21 34
// 55 89 144 233 377

class p28_FibonacciSeriesTriangle {
    public static void main(String args[]) {
        int n = 5;
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(a + " ");
                c = b + a;
                a = b;
                b = c;
            }
            System.out.println();
        }
    }
}
