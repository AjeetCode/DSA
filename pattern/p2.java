//Qsn
// for n = 5 print below pattern
//                  *
//              *   *   
//          *   *   *
//      *   *   *   *
//  *   *   *   *   *

public class pattern2 {
    // Method 1
    public static void main(String[] args){
        int s=6;
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                if(i+j>=s-1){
                    System.out.print("*");
                }
                System.out.print("\t");
            }
            System.out.println();
        }
    }



    // Method 2
    // public static void main(String[] args){
    //     int s=5;
    //     int tab=s-1;
    //     int star=1;
    //     for(int i=0;i<s;i++){
    //         for(int j=0;j<tab;j++){
    //             System.out.print("\t");
    //         }
    //         tab--;
    //         for(int k=0;k<star;k++){
    //             System.out.print("*\t");
    //         }
    //         star++;
    //         System.out.println();
    //     }
    // }
}

