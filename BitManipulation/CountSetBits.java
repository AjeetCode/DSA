public class CountSetBits {
    static int countSetBits(int number) {
        int count = 0;
        while (number > 0) {
            number = number & (number - 1); // Removes the rightmost set bit.
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int number = 29; // 11101
        System.out.println("Set bits: " + countSetBits(number));
    }
}
