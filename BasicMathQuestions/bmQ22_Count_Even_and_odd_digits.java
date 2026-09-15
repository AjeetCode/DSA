// Q22. Count Even and Odd Digits

// Question:
// Input: 123456

// Even Digits:
// 2, 4, 6

// Odd Digits:
// 1, 3, 5

// Final Answer:
// Even = 3

// Odd = 3

class bmQ22_Count_Even_and_odd_digits {
    public static void main(String[] args) {
        int number = 12345;
        int even = 0;
        int odd = 0;
        int temp = number;
        while(temp != 0) {
            int mod = temp % 10;
            if(mod % 2 == 0) even ++;
            else odd ++;
            temp = temp / 10;
        }
        System.out.print("Even digits = " + even + "," + "odd digits = " + odd);
    }
}