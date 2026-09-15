// Q 14. Check Perfect Number

// Question:
// Input: 28

// Factors:
// 1 + 2 + 4 + 7 + 14

// x = 28;

// Final Answer:
// 28 is a Perfect Number.

// class bmQ14_Check_Perfect_Number {
//     public static void main(String args[]) {
//         int num = 28;
//         int mid = num / 2;
//         int sum = 0;
//         for(int i = 1; i <= mid; i++) {
//             if(num % i == 0) {
//                 sum += i;
//             }
//         }
//         if(num == sum) {
//             System.out.print(num + " it is a perfect number.");
//         } else {
//             System.out.print(num + " it is not a perfect number.");
//         }
//     }
// }


// method 2
class bmQ14_Check_Perfect_Number {
    public static void main(String args[]) {
        int num = 29;
        int sum = 1;
        for(int i = 2; i*i <= num; i++) {
            if(num % i == 0) {
                if (i * i == num) {
                    sum = sum + i;
                } else {
                    sum = sum + i + num / i;
                }
            }
        }
        if(num == sum) {
            System.out.print(num + " it is a perfect number.");
        } else {
            System.out.print(num + " it is not a perfect number.");
        }
    }
}