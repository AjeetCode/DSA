// if n is even.
// * * * * *
// * * * *
// * * *
// * *
// * *
// * * *
// * * * *
// * * * * *

// if n is odd.
// * * * *
// * * *
// * *
// *
// * *
// * * *
// * * * *


// works only when n is odd.   

class p22K_Pattern {
    public static void main(String[] args) {
        int n = 7;
        int a = n - n/2;
        int t1 = a;
        int b = n - a; 
        int t2 = 2;
        for(int i = 0; i < n; i++) {
            if(i < a) {
                for(int j = 0; j < t1; j++){
                    System.out.print("*\t");
                }
                t1--;
            } else {
                for(int j = 0; j < t2; j++) {
                    System.out.print("*\t");
                }
                t2++;
            }
            System.out.println();
        }
    }
}


