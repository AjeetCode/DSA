// ****
// ***
// **
// *
// for n = 4

// method 1.
// class p4 {
//     public static void main(String[] args) {
//        for(int i = 3; i >= 0; i--) {
//             for(int j = i; j >= 0; j--) {
//                 System.out.print("*");
//             }
//             System.out.println();
//        } 
//     }
// }


// method 2.
// class p4 {
//     public static void main(String[] args) {
//         for(int i = 4; i > 0; i--) {
//             int k = i;
//                 System.out.print("*\t");
//             while(k > 0) {
//                 k--;
//             }
//             System.out.println();
//         }
//     }
// }

// Method 3
class p4 {
    public static void main(String[] args) {
        int n = 4;
        int star = n;
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < star; j++){
                System.out.print("*\t");
            }
            star--;
            System.out.println();
        }
    }
}
