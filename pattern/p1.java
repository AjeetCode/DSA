// Print the below pattern for given number n;
// For eg n = 5 is below pattern
//  *
//      *
//          *
//              *
//                  *


class pattern1{ // see the syntax after classname declaraition, about spacing
    public static void main(String[] args){       
        int s = 5;
        //
        //metohd 1
        // for(int i=0; i<s; i++){
        //     for(int j=0; j<s; j++){
        //         if (i==j){
        //             System.out.print("*");
        //         } else {
        //             System.out.print("\t");
        //         }
        //     }
        //     System.out.println();
        // }
        // 
        // method 2
        String st="*";
        for(int i=0;i<s;i++){
            System.out.println(st);
            st="\t"+st;
        }

    }
}

