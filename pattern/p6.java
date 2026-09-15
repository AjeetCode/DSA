// 1 2 3 4
// 1 2 3
// 1 2
// 1

//method 1

// class p6 {
//     public static void main(String[] args) {
//         for(int i = 4; i >= 1; i--) {
//             for(int j = 1; j <= i; j++) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }


// method 2

class p6 {
    public static void main(String[] args){
        int n = 4;
        int num = n;
        for(int i = 0; i < n; i++){
            for(int j = 1; j <= num; j++){
                System.out.print(j + "\t");
            }
            num--;
            System.out.println();
        }
    }
}