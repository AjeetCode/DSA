//Qsn
// for n = 6 print below pattern
// 1	
// 1	1	
// 1	2	1	
// 1	3	3	1	
// 1	4	6	4	1	
// 1    5   10  10  5   1

class q3 {
    public static void main(String[] args) {
        int n = 6;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                // finding factorial of n
                int nFact = 1;
                for(int k = 1; k < i+1; k++) {
                    nFact = nFact * k;
                }
                // finding factorial of r
                int rFact = 1;
                for(int k = 1; k < j+1; k++) {
                    rFact = rFact * k;
                }
                // finding n-r fact
                int nrFact = 1;
                for(int k = 1; k < i-j+1; k++) {
                    nrFact = nrFact * k;
                }
                System.out.print(nFact/(nrFact*rFact) + "\t");
            }
            System.out.println();
        }        
    }
}