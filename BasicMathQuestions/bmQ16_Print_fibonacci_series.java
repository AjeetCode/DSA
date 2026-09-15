// 5. Fibonacci Series (3 Questions)
// Q16. Print Fibonacci Series

// Question:
// Input: 7

// Output:
// 0 1 1 2 3 5 8

class bmQ16_Print_fibonacci_series {
    public static void main(String args[]) {
    int n = 10;
    int a = 0;
    int b = 1;
    int c;
    for(int i = 0; i < n; i++) {
        System.out.print(a + " ");
        c = a + b;
        a = b;
        b = c;
    }   
    }
}