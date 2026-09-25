public class ClearRangeOfBits {
    // Clears every bit from index i through j, inclusive.
    static int clearRangeOfBits(int number, int i, int j) {
        int leftMask = -1 << (j + 1);
        int rightMask = (1 << i) - 1;
        return number & (leftMask | rightMask);
    }

    public static void main(String[] args) {
        int number = 31; // 11111
        int i = 1;
        int j = 3;
        System.out.println("After clearing bits " + i + " to " + j + ": "
                + clearRangeOfBits(number, i, j)); // 10001 = 17
    }
}
