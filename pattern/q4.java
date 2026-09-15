//Qsn
// for n = 5 print below pattern ( only odd n)
//          *
//          *   *
//  *   *   *   *   *     
//          *   *
//          *

class q4 {
    public static void main(String[] args) {
        int n = 7;
        int star = 1;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n/2; j++) {
                if (i == n/2) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            for(int j = 0; j < star; j++) {
                System.out.print("*\t");
            }
            if (i >= n/2) {
                star--;
            } else {
                star++;
            }
            System.out.println();
        }
    }
}

// class q4 {
//     public static void main(String[] args) {
//         int n = 7;
//         int mid = n - n / 2;
//         int k = 0;
//         for(int i = 1; i <= n; i++) {
//             if(i < mid) {
//                 for(int j = 1; j < mid; j++) {
//                     System.out.print("\t");
//                 }
//                 for(int j = 0; j <= k; j++) {
//                     System.out.print("*\t");
//                 }
//                     k++;
//             } else if(i == mid) {
//                 for(int j = 0; j < n; j++) {
//                     System.out.print("*\t");
//                 }
//             } else if(i > mid) {
//                     for(int j = 1; j < mid; j++) {
//                     System.out.print("\t");
//                 }
//                 for(int j = k; j > 0; j--) {
//                     System.out.print("*\t");
//                 }
//                 k--;
//             }
//             System.out.println();
//         }
//     }
// }