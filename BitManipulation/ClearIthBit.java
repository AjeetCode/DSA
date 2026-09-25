public class ClearIthBit {
    static int clearIthBit(int number, int i) {
        return number & ~(1 << i);
    }

    public static void main(String[] args) {
        int number = 10; // 1010
        int i = 1;
        System.out.println("After clearing bit " + i + ": " + clearIthBit(number, i)); // 1000 = 8
    }
}
