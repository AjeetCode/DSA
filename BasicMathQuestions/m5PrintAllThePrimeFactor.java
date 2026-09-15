// bruteforce approach. method 1

// class m5PrintAllThePrimeFactor {
//     // A function to check weather a number is prime or not!
//     public static boolean checkPrime(int n) {
//         for(int i = 2; i*i <= n; i++) {
//             if(n % i == 0) {
//                 return false;
//             } else {
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         int n = 1111;
//         int num = n / 2;
//         for(int i = 2; i <= num; i++) {
//             if(n % i == 0) {
//                 boolean b = checkPrime(i);
//                 if(b == true) {
//                     System.out.print(i + " ");
//                 }
//             }
//         }
//     }
// }

//  method 2 
// Har composite number ko prime numbers ke multiplication me break kiya ja sakta hai.
// A composite number is a number that has more than 2 factors.
class m5PrintAllThePrimeFactor {
    // Main Method to find the prime factors.
    public static void main(String args[]) {
        int n = 8776464;
        int divisor = 2;
        while(n > 1) {
            int count = 0;
            while(n % divisor == 0) {
                n = n / divisor;
                count ++;
                if(count == 1) {
                    System.out.print(divisor + " ");
                }
            }
            divisor ++;
        }
    }
}


// class m5PrintAllThePrimeFactor {
//     // Main Method to find the prime factors.
//     public static void main(String args[]) {
//         int n = 8776464;
//         int divisor = 2;
//         while(n > 1) {
//             if(n%divisor == 0) {
//                 System.out.print(divisor + " ");
//             }
//             while(n%divisor == 0) {
//                 n = n/divisor;
//             }
//             divisor++;
//         }
//     }
// }