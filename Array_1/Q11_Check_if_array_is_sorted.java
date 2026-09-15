// Q11. Check if array is sorted
// Input: [1, 2, 3, 4, 5]
// Output: Sorted

class Q11_Check_if_array_is_sorted {
    public static void main(String args[]) {
        String s = "";
        // int arr[] = {2, 4, 1, 6, 7, 9, 10, 11, 41, 1, 0, -1, 6, 9, 11, 40, 41};
        // int arr[] = {1, 3, 5, 7, 9, 11, 12, 20};
        int arr[] = {20, 19, 18, 17, 16, 14, 13, 12, 11, 10, 8, 4, 2, 1, 0, -1};
        if(arr[0] < arr[1]) {
            s = "Array is sorted in ascending order.";
            for(int i = 1; i < arr.length; i++) {
                if(arr[i - 1] > arr[i]) {
                    s = "Array is not sorted";
                    break;
                }
            }
        } else {
            s = "Array is sorted in descending order";
            for(int i = 1; i < arr.length; i++) {
                if(arr[i - 1] < arr[i]) {
                    s = "Array is not sorted";
                    break;
                }
            }
        }
        System.out.print(s);
    }
}