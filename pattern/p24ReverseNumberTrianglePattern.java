// 1 2 3 4 
//  2 3 4 
//   3 4 
//    4 

class p24ReverseNumberTrianglePattern {
    public static void main(String args[]) {
        int n = 4;
        int space = 0;
        int toPrint = 1;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for(int j = toPrint; j <= n; j++) {
                System.out.print(j + " ");
            }
            space++;
            toPrint++;
            System.out.println();
        }
    }
}