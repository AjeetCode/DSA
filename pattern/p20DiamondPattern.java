//                                 *
//                         *               *
//                 *               *               *
//         *               *               *               *
// *               *               *               *               *
//         *               *               *               *
//                 *               *               *
//                         *               *
//                                 *



// // method 1
// class p20DiamondPattern {
//     public static void main(String args[]) {
//         int n = 9;
//         int a = n - n/2;
//         int b = n - a; 
//         for(int i = 0; i < a; i++) {
//             for(int j = 0; j < a-i-1; j++) {
//                 System.out.print("\t");
//             }
//             for(int j = 0; j < i+1; j++) {
//                 System.out.print("*\t\t");
//             }
//             System.out.println();
//         }
//         for(int i = 0; i < b; i++) {
//             for(int j = 0; j < i+1; j++) {
//                 System.out.print("\t");
//             }
//             for(int j = 0; j < b-i; j++) {
//                 System.out.print("*\t\t");
//             }
//             System.out.println();
//         }
//     }
// }