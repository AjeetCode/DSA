// *       *       *       *       *
// *       *       *       *
// *       *       *
// *       *
// *

// // method 1
// class p9ReverseRightHalfPyramid {
//     public static void main(String[] args) {
//         int n = 5;
//         for(int i = n; i > 0; i--) {
//             for(int j = 0; j < i; j++) {
//                 System.out.print("*\t");
//             }
//             System.out.println();
//         }
//     }
// }


// method 2
class p9ReverseRightHalfPyramid {
    public static void main(String[] args) {
        int n = 5;
        int star = n;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < star; j++) {
                System.out.print("*\t");
            }
            star--;
            System.out.println();
        }
    }
}