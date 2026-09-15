// Q15. Check Automorphic Number

// Question:
// Input: 25

// 25² = 625

// Ends with 25

// Final Answer:
// 25 is an Automorphic Number.

class bmQ15_Check_Automorphic_Number {
    public static void main(String args[]) {
        int number = 25;
        int count = 0;
        int temp = number;
        while(temp != 0) {
            count ++;
            temp = temp / 10;
        }
        int lastDig = 0;
        int mul = 1;
        temp = number * number;
        for(int i = 0; i < count; i++) {
            int mod = temp % 10;
            temp = temp / 10;
            lastDig = lastDig + mod * mul; 
            mul = mul * 10;
        }
        if(number == lastDig) {
            System.out.print("yes..");
        } else {
            System.out.print("no..");
        }
    }
}