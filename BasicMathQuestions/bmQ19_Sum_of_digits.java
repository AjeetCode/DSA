// 6. Digits Based (4 Questions)
// Q19. Sum of Digits

// Question:
// Input: 1234

// 1 + 2 + 3 + 4

// Final Answer:
// Sum = 10

class bmQ19_Sum_of_digits {
    public static void main(String args[]) {
        int number = 1234;
        int temp = number;
        int sum = 0;
        while(temp != 0) {
            int mod = temp % 10;
            sum += mod;
            temp = temp / 10; 
        }
        System.out.print("sum of digits is = " + sum);
    } 
}