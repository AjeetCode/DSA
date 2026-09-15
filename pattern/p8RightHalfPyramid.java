// *
// *       *
// *       *       *
// *       *       *       *
// *       *       *       *       *

// // method 1
// class p8RightHalfPyramid {
//     public static void main(String args[]) {
//         int n = 5;
//         for(int i = 0; i < 5; i++) {
//             for(int j = 0; j <= i; j++) {
//                 System.out.print("*\t");
//             }
//             System.out.println();
//         }
//     }
// }


// methiod 2
class p8RightHalfPyramid {
    public static void main(String args[]) {
        int n = 5;
        int star = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < star; j++){
                System.out.print("*\t");
            }
            star++;
            System.out.println();
        }
    }
}