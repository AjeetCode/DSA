class bmQ20_Product_of_digits {
    public static void main(String args[]) {
        int number = 1324;
        int product = 1;
        int temp = number;
        while(temp != 0) {
            int mod = temp % 10;
            product *= mod;
            temp = temp / 10;
        }
        System.out.print("product of digits is = " + product);
    }
}