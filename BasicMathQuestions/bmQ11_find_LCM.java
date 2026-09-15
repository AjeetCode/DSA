// class bmQ11_find_LCM {
//     public static void main(String args[]) {
//         int num1 = 11;
//         int num2 = 22;
//         int lcm = 0;
//         for(int i = num2; i < i+1; i++) {
//             if(i % num1 == 0 && i % num2 == 0) {
//                 lcm = i;
//                 break;
//             }
//         }
//         System.out.print("lcm = " + lcm);
//     }
// }

// method 2

class bmQ11_find_LCM {
    public static int hcf(int small, int large) {
        while(small != 0) {
            int rem = large % small;
            large = small;
            small = rem;
        }
        return large;
    }
    public static void main(String[] args) {
        int small = 123;
        int large = 231; 
        int gcd = hcf(small, large);
        System.out.print("lcm = " + (small*large)/gcd);
    }
}