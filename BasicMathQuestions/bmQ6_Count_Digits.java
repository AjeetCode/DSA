class bmQ6_Count_Digits {
    public static void main(String args[]) {
        int givenDigit = 1234976;
        int count = 0;
        while(givenDigit != 0) {
            count ++;
            givenDigit = givenDigit/10;
        }
        System.out.println("the number of digits are = "+count);
    }
}