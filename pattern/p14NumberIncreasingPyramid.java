// 1
// 2       2
// 3       3       3
// 4       4       4       4

// method 1
class p14NumberIncreasingPyramid {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
}

// // method 2
// class p14NumberIncreasingPyramid {
//     public static void main(String[] args) {
//         int n = 4;
//         for (int i = 0; i < n; i++) {
//             int num = 1;
//             for (int j = 0; j <= i; j++) {
//                 System.out.print(num + "\t");
//                 num++;
//             }
//             System.out.println();
//         }
//     }
// }

