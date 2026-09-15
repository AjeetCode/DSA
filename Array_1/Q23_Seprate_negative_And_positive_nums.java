class Q23_Seprate_negative_And_positive_nums {
    public static void main(String args[]) {
        // int arr[] = {2, 3, -1, -5, -7, 8, -10, 10, 15};
        int arr[] = {-1, -5, -7, -10};
        // int arr[] = {2, 3, 8, 10, 15};
        int end = arr.length - 1;
        int i = 0;
        while(i < end) {
            if(arr[i] > 0) {
                while(arr[end] > 0 && end > 0) {
                    end--; 
                }
                int temp = arr[end];
                arr[end] = arr[i];
                arr[i] = temp;
                end--;
            }
            i++;
        }
        for(int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}

// // the simplest way is to sort the array.
// class Q23_Seprate_negative_And_positive_nums {
//     public static void main(String args[]) {
//         int arr[] = {2, 3, -1, -5, -7, 8, -10, 10, 15};
//         int end = arr.length - 1;
//         for(i=0; i<end; i++)
//             if(arr[i] > 0) {
//                 while(arr[end] > 0) {
//                     end--; 
//                 }
//                 int temp = arr[end];
//                 arr[end] = arr[i];
//                 arr[i] = temp;
//                 end--;
//             }
//         }
//         for(int j = 0; j < arr.length; j++) {
//             System.out.print(arr[j] + " ");
//         }
//     }
// }