// |0,0|0,1|0,2|0,3|0,4|0,5|0,6|
// |1,0|1,1|1,2|1,3|1,4|1,5|1,6|
// |2,0|2,1|2,2|2,3|2,4|2,5|2,6|
// |3,0|3,1|3,2|3,3|3,4|3,5|3,6|
// |4,0|4,1|4,2|4,3|4,4|4,5|4,6|
// |5,0|5,1|5,2|5,3|5,4|5,5|5,6|
// |6,0|6,1|6,2|6,3|6,4|6,5|6,6|

// *           * 
//   *       *   
// *   *   *   * 
//   *   *   *   
// *   *   *   * 
//   *       *   
// *           * // i == j , i + j == n - 1;



class p21ButterflyStarPattern {
    public static void main(String[] args) {
        int n = 7;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == j || i + j == n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

// class p21ButterflyStarPattern {
//     public static void main(String[] args) {
//         int n = 7;
//         for(int i = 0; i < n; i++) {
//             for(int j = 0; j < n; j++) {
//                 if(i > j && i + j > n - 1) {
//                     System.out.print("  ");
//                 } else if(j > i && i + j < n - 1) {
//                     System.out.print("  ");
//                 // } else if(i == j ||  i + j == n-1) {
//                 //     System.out.print("* ");
//                 } else if((i + j) % 2 == 0) {
//                     System.out.print("* ");
//                 } else {
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
// this logic only works of n is odd.