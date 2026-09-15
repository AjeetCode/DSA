class bmQ18_Sum_of_fibonacci_Series {
    public static void main(String args[]) {
        int sum = 0;
        int n = 8;
        int a = 0;
        int b = 1;
        int c;
        for(int i = 0; i < n; i++) {
            sum += a;
            c = a + b;
            a = b;
            b = c;
        }
        System.out.print("the sum of the  series = " + sum);
    }
}