// Ch2_patterns;
// Qsn
// for n = 5 print below pattern
//          *
//      *   *   *   
//  *   *   *   *   *
//      *   *   *
//          *

// 10, 00, 01 || 03, 04, 14 || 34, 44, 43 || 
class p3 {
    public static void main(String[] args) {
        int n = 5;
        int tab = n / 2;
        int star = 1;
        for(int i = 0; i < n; i++) {
            if(i <= n / 2) {
                for(int j = 0; j < tab; j++)
                System.out.print("\t");
                tab --;
                for(int j = 0; j < star; j++)
                System.out.print("*\t");
                star = star + 2;
            }
            if(i == n/2) {
            tab ++;
            star = star - 2;
            }
            if(i > n/2) {
                tab ++;
                for(int j = 0; j < tab; j++)
                System.out.print("\t");
                star = star - 2;
                for(int j = 0; j < star; j++)
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}