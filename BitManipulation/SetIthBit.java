public class SetIthBit {
    static int setIthBit(int number, int i) {
        return number | (1 << i);
    }

    public static void main(String[] args) {
        int number = 10; // 1010
        int i = 2;
        System.out.println("After setting bit " + i + ": " + setIthBit(number, i)); // 1110 = 14
    }
}
