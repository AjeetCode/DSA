// Q17. Find 7th Fibonacci Number

// Question:
// Series:
// 0 1 1 2 3 5 8

// Final Answer:
// 7th Fibonacci Number = 8

class bmQ17_Find_7th_fibonacci_number {
    public static void main(String args[]) {
        int position = 7;
        int a = 0;
        int b = 1;
        int c;
        int ans = 0;    
        for(int i = 0; i < position; i++) {
            ans = a;
            c = a + b;
            a = b;
            b = c; 
        }
        System.out.print(position + "-th position number is = " + ans);
    }
}