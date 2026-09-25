public class ClearLastIBits {
    // Clears bits from index 0 through i - 1.
    static int clearLastIBits(int number, int i) {
        return number & (-1 << i);
    }

    public static void main(String[] args) {
        int number = 15; // 1111
        int i = 2;
        System.out.println("After clearing last " + i + " bits: " + clearLastIBits(number, i)); // 1100 = 12
    }
}
