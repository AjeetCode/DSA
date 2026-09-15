class bmQ4_Find_Largest_of_3_Numbers {
    public static void main(String[] args) {
        int a = 31;
        int b = 14;
        int c = 5;
        if(a > b && a > c) {
            System.out.print(a + " is greatest number.");
        } else if(b > a && b > c) {
            System.out.print(b + " is greatest number.");
        } else if(c > b && c > b) {
            System.out.print(c + " is greatest number.");
        }
    }
}