class bmQ9_Find_sum_of_prime_numbers_from_1_to_n {
    public static void main(String args[]) {
        int num = 1234;
        boolean arr[] = new boolean[num+1];
        for(int i = 2; i <= num; i++) {
            arr[i] = true;
        } 
        for(int i = 2; i <= num; i++) {
            if(arr[i]) {
                for(int j = i*i; j <= num; j += i) {
                    arr[j] = false;
                }
            }
        }
        int sum = 0;
        for(int i = 2; i <= num; i++) {
            if(arr[i]) {
                sum += i;
            }
        }
        System.out.print("the sum of all the prime numbers from 1 to " + num + " is = " + sum);
    }
}