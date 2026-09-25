public class GetIthBit {
    static int getIthBit(int number, int i) {
        return (number >> i) & 1;
    }

    public static void main(String[] args) {
        int number = 10; // 1010 in binary
        int i = 1;
        System.out.println("Bit at index " + i + ": " + getIthBit(number, i));
    }
}
