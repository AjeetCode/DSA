// printing all the prime numbers bt. 1 and n.

// class bmQ8_print_prime_number_from_1_to_n {
//     // checking for prime
//     public static boolean check(int n) {
//         for(int i = 2; i*i <= n; i++) {
//             if(n % i == 0) {
//                 return false;
//             }
//         } 
//         return true;
//     }
//     public static void main(String args[]) {
//         int num = 10;
//         for(int i = 2; i <= num; i++) {
//             if(check(i)) {
//                 System.out.print(i + " ");
//             }
//         }
//     }
// }


// method 2

class bmQ8_print_prime_number_from_1_to_n {
    public static void main(String args[]) {
        int num = 13234;
        boolean arr[] = new boolean[num+1];
        for(int i = 2; i <= num; i++) {
            arr[i] = true;
        }
        for(int j = 2; j <= num; j++) {
            for( int k = j*j; k <= num; k+=j) {
                arr[k] = false;
            }
        }
        for(int j = 2; j <= num; j++) {
            if(arr[j]) {
            System.out.print(j + " ");
            }
        }
    }
}