// finding the hcf
// class bmQ10_find_HCF_GCD {
//     public static void main(String args[]) {
//         int num1 = 11;
//         int num2 = 22;
//         int hcf = 0;
//         for(int i = num1; i >= 1; i--) {
//             if(num1 % i == 0 && num2 % i == 0) {
//                 hcf = i;
//                 break;
//             }
//         }
//         System.out.print("hcf = " + hcf);
//     }
// }



// method 2
class bmQ10_find_HCF_GCD {
    public static void main(String args[]) {
        int small = 11;
        int large = 22;
        while(small != 0) {
            int rem = large % small;
            large = small;
            small = rem;
        }
        System.out.print("the answer is hcf = " + large);
    }
}

