// Q13. Check Armstrong Number

// Question:
// Input: 153

// Calculation:
// 1³ + 5³ + 3³

// = 1 + 125 + 27

// = 153

// Final Answer:
// 153 is an Armstrong Number.

class bmQ13_Check_Armstromg_NUmber {
    public static void main(String[] args) {
        int number = 154;
        // count number of digits
        int temp = number;
        int count = 0;
        while(temp != 0) {
            temp = temp / 10;
            count ++;
        }
        temp = number;
        int armNum = 0;
        while(temp != 0) {
            int mod = temp % 10;
            armNum = armNum + (int)Math.pow(mod, count);
            temp = temp / 10; 
        }
        if(number == armNum) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }
    }
}