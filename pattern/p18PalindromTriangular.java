//                                 1
//                         2       1       2
//                 3       2       1       2       3
//         4       3       2       1       2       3       4
// 5       4       3       2       1       2       3       4       5




// method 1

// class p18PalindromTriangular {
//     public static void main(String arrgs[]) {
//         int n = 5;
//         for(int i = 0; i < n; i++) {
//             for(int j = 0; j < n - i - 1; j++) {
//                 System.out.print("\t");
//             }
//             for(int j = i + 1; j > 0; j--){
//                 System.out.print(j + "\t");
//             }
//             for(int j = 2; j < i+2; j++) {
//                 if(i == 0) continue;
//                 System.out.print(j + "\t");
//             }
//             System.out.println();
//         }
//     }
// }