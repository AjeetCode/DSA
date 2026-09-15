// Q1 partition if pivot element is at end
// class Q5_Partition {
//     public static void main(String args[]) {
//         int arr[] = {6, 3, 9, 5, 2, 8};
//         int l = arr.length;
//         int pe =arr[l-1];
//         int k = -1;
//         for(int i = 0; i < arr.length-1; i++) {
//             if(arr[i] < pe) {
//                 k++;
//                 int temp = arr[k];
//                 arr[k] = arr[i];
//                 arr[i] = temp;
//             }
//         }
//         k++;
//         int temp = arr[k];
//         arr[k] = arr[l-1];
//         arr[l-1] = temp;
//         for(int el : arr) {
//             System.out.print(el + " ");
//         }
//     }
// } 

// Q2. what if pivot value is given, it may or may not lie in your array.
class Q5_Partition {
    public static void main(String args[]) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int l = arr.length;
        int pe = 6; // pivot element.
        int start = 0;
        for(int i = 0; i < l; i++) {
            if(arr[i] < pe) {
                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;
            }
        }
        for(int el : arr) {
            System.out.print(el + " ");
        }
    }
} 