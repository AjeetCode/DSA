// Q15. Remove duplicates from sorted array

// Input:

// [1, 1, 2, 2, 3, 4, 4]

// Output:

// [1, 2, 3, 4]

class Q15_Remove_duplicates_from_sorted_array {
    public static void main(String args[]) {
        int arr[] = {1, 1, 1, 2, 3, 3, 4, 6, 6, 6, 7, 9, 9, 9, 9, 10, 11, 12, 12, 12, 12, 14, 15, 15, 15, 16, 17, 17};
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            int current = arr[i];
            while(arr[i] == arr[i + 1] && i < arr.length-1) {
                i++;
                if(i == arr.length - 1) break;
            }
            arr[j] = current;
            j++;
        }
        for(int i = j; i < arr.length; i++) {
            arr[i] = 0;
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < j; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}