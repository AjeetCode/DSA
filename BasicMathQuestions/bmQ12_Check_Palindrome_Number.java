// Q12. Check Palindrome Number
// Question:
// Input: 121
// Reverse = 121
// Final Answer:
// 121 is a Palindrome Number.

class bmQ12_Check_Palindrome_Number {
    public static void main(String[] args) {
        int number = 11111;
        int reverseNum = 0;
        int temp = number;
        while(temp != 0) {
            int mod = temp % 10;
            reverseNum = reverseNum*10 +mod;
            temp = temp / 10;
        }
        if(reverseNum == number) {  
            System.out.print(number + " is palindrome number.");
        } else {
            System.out.print(number + " is not a palindrome number.");
        }
    }
}