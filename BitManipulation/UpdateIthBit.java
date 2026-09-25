public class UpdateIthBit {
    // newBit must be 0 or 1.
    static int updateIthBit(int number, int i, int newBit) {
        int clearedNumber = number & ~(1 << i);
        return clearedNumber | (newBit << i);
    }

    public static void main(String[] args) {
        int number = 10; // 1010
        int i = 0;
        int newBit = 1;
        System.out.println("After updating bit " + i + ": " + updateIthBit(number, i, newBit)); // 1011 = 11
    }
}
