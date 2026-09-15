//                                 *
//                         *       *
//                 *       *       *
//         *       *       *       *
// *       *       *       *       *

// // method 1
// class p10LeftHalfPyramid {
//     public static void main(String[] args){
//         int n = 5;
//         int tab = n - 1;
//         int star = 1;
//         for(int i = 0; i < n; i++) { 
//             for(int j = 0; j < tab; j++) {
//                 System.out.print("\t");
//             }
//             for(int j = 0; j < star; j++){
//                 System.out.print("*\t");
//             }
//             tab--;
//             star++;
//             System.out.println();
//         }
//     }
// }

// method 2
class p10LeftHalfPyramid {
    public static void main(String[] args) { 
        int n = 5;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if (i + j >= n - 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}