// Factors always occur in pairs. If a number has a factor greater than √n, 
// its paired factor must be smaller than √n. 
// Therefore checking up to √n is sufficient.
class m1CheckPrime {
    public static void main(String args[]) {
        int n = 11;
        int count = 0;
        for(int i = 2; i*i <= n; i++) {
            if(n % i == 0) {
                System.out.print("false");
            }
        } 
        System.out.print("true");
    }
}