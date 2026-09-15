//     *
//    * *
//   *   *
//  *     *
// * * * * * 

class p26HollowTrianglePattern {
    public static void main(String args[]) {
        int n = 5;
        int spaceBeforeStar = n - 1;
        int spaceAfterStar = 0;
        for(int i = 0; i < n; i++) {
            // for first line i==0
            if(i == 0) {
                for(int j =0; j < spaceBeforeStar; j++) {
                    System.out.print(" ");
                }
                spaceBeforeStar--;
                System.out.println("*");
                continue;
            }
            // for last line i == n-1
            if(i == n-1) {
                for(int j = 0; j < n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
                continue;
            }
            // for 2nd line to last line i==1 to i == n-2;
            for(int j = 0; j < spaceBeforeStar; j++) {
                System.out.print(" ");
            }
            spaceBeforeStar--;
            System.out.print("* ");
            for(int j = 0; j < spaceAfterStar; j++) {
                System.out.print("  ");
            }
            spaceAfterStar++;
            System.out.print("*");
            System.out.println();
        }
    }
}
