// method 1
//                         1
//                 2               2
//         3               3               3
// 4               4               4               4


// method 2
class p13NumberTiangular {
    public static void main(String[] args) {
        int n = 4;
        // int space = n - 1;
        for (int i = 0; i < n; i++) {
                for(int k = 0; k < n-1-i; k++) {
                    System.out.print("\t");
                }
                for(int k = 0; k < i+1; k++) {
                    System.out.print(i+1 + "\t\t");
                }
            System.out.println();
        }
    }
}
// class p13NumberTiangular {
    // public static void main(String[] args) {
    //     int n = 4;
    //     for(int i = 0; i < n; i++) {
    //         int count = 0;
    //         int printOn = n-1;
    //         for(int j = 0; j < n+n-1; j++) {
    //             if(i + j == printOn){
    //                 System.out.print(i+1 + "\t");
    //                 count++;
    //                 printOn += 2;
    //             } else {
    //                 System.out.print("\t");
    //             }
    //             if(i+1 == count) break;
    //         }
    //         System.out.println();
    //     }
    // }
// }

