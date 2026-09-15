class bmQ21_Largest_Digit {
    public static void main(String args[]) {
        int number = 1294;
        int answer = Integer.MIN_VALUE;
        int temp = number;
        while(temp != 0) {
            int mod = temp % 10;
            answer = Math.max(answer, mod);
            temp = temp / 10;
        }
        System.out.print("largest digit in the nnumber is = " +answer);
    }
}