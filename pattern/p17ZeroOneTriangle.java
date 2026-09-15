// 1
// 0       1
// 1       0       1
// 0       1       0       1


// class p17ZeroOneTriangle {
//     public static void main(String args[]) {
//         int n = 4;
//         for(int i = 1; i <= n; i++) {
//             int val = i;
//            for(int j = 1; j <= i; j++) {
//             System.out.print(val % 2 + "\t");
//             val++;
//            }
//             System.out.println();
//         }
//     }
// }

// class p17ZeroOneTriangle {
//     public static void main(String args[]) {
//         int n = 4;
//         int v = 0;
//         int k = 1;
//         for(int i = 0; i < n; i++) {
//             if(v == 0) {
//                 k = v = 1;
//             } else {
//                 k = v = 0;
//             }
//             for(int j = 0; j <= i; j++) {
//                 System.out.print(k + "\t");
//                 if(k == 1) k = 0;
//                 else k = 1;
//             }
//             System.out.println();
//         }
//     }
// }