// 1
// 2       3
// 4       5       6
// 7       8       9       10

// //method 1
// class p16NumberChangingPyramid {
//     public static void main(String[] args) {
//         int n = 4;
//         int num = 1;
//         for (int i = 0; i < n; i++) {
//             for(int j = 0; j <= i; j++) {
//                 System.out.print(num + "\t");
//                 num++;
//             }
//             System.out.println();
//         }
//     }
// }

// method 2
class p16NumberChangingPyramid {
    public static void main(String[] args) {
        int n = 4;
        int num = 1;
        int t = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < t; j++) {
                System.out.print(num + "\t");
                num++;
            }
            t++;
            System.out.println();
        }
    }
}
