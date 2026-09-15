class bmQ7_Check_prime_number {
    public static void main(String[] args) {
        int num = 122 ;
        boolean tellMe = true ;
        for(int i = 2; i*i <= num; i++) {
            if(num % i == 0) {
                tellMe = false ;
                break;
            } 
        }
        System.out.print(tellMe);
    }
}

// If we don't find a divisor before or at √31, there cannot suddenly be a new divisor after √31.
// If the larger factor were greater than √31, its partner would necessarily be smaller than √31.