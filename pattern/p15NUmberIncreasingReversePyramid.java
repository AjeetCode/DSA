// 1       2       3       4
// 1       2       3
// 1       2
// 1

// Method 2
class p15NUmberIncreasingReversePyramid {
    public static void main(String[] args) {
        int n = 4;
        int t = n;
        for(int i = 0; i < n; i++) {
            int num = 1;
            for(int j = 0; j < t; j++) {
                System.out.print(num + "\t");
                num++;
            }
            t--;
            System.out.println();
        }
    }
}

// // Method 1
// class p15NUmberIncreasingReversePyramid {
//     public static void main(String[] args) {
//         int n = 4;
//         for(int i = n; i >= 1; i--) {
//             for(int j = 1; j <= i; j++) {
//                 System.out.print(j + "\t");
//             }
//             System.out.println();
//         }
//     }
// }


