// get the HCF and LCM of the passed two numbers

// 1. HCF (Highest Common Factor)
// 2. GCD (Greatest Common Divisor)
// HCF is commonly used in school mathematics.
// GCD is commonly used in programming and algorithms.
// 3. LCM (Least Common Multiple)
// The smallest positive number that is a multiple of both numbers. (12, 18) lcm is 36.

class m4_HCF_LCM {
    public static void main(String args[]) {
    // LCM
    int n1 = 24;
    int n2 = 12;
    for(int i = n2; i < i+1; i++) {
        if(i % n1 == 0 && i % n2 == 0) {
            System.out.println("LCM of the the number is = " + i);
            break;
        }
    }

    // HCF
    for(int i = n1; i > 0; i--) {
        if(n1 % i == 0 && n2 % i == 0) {
            System.out.println("HCF of the the number is = " + i);
            break;
        }
    }
    }
}