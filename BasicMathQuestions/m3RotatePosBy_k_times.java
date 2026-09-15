//

class m3RotatePosBy_k_times {
    public static void main(String args[]) {
        int n = 12345;
        int k = 2;
        // calculate the no of digits.
        int count = 0;
        int temp = n;
        while(temp != 0) {
            count++;
            temp = temp / 10;
        }
        k = (count + k) % count; // 5 + (-2) in case k is negative
        // calculating the rotated number
        int mulNum = (int) Math.pow(10, count-1);
        for(int i = 0; i < k; i++) {
            int num = n % 10;
            n = n / 10;
            n = num*mulNum + n;
        }
        System.out.print(n);
    }
}