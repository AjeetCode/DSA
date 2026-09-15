class zzz_prac {
    public static int factorial(int n) {
        if(n == 0) return 1;
        return n*factorial(n-1);
    }

    public static int power(int x, int n) {
        if(n == 0) return 1;

        int val = power(x, n/2);
        int xpn = val * val; 
        
        if(n % 2 == 0) {
            retuen val*val;
        } else {
            return val*val*x;
        }
        // return x * power(x, n - 1);
    }

    public static void main(String args[]) {
        int num = 4;
        int x = 4;
        // System.out.print(factorial(num));
        System.out.print(power(x, num));

    }
}