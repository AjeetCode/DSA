// Q8. Copy one array into another

// Input:

// [10, 20, 30]

// Output:

// [10, 20, 30]

class Q8_Copy_one_array_into_another {
    public static void main(String args[]) {
        int arr[] = {1, 3, 5, 7, 9, 10, 11, 13, 14, 16, 17};
        int len_of_arr = arr.length; 
        int newArr[] = new int[len_of_arr];
        for(int i = 0; i < len_of_arr; i++) {
            newArr[i] = arr[i];
        }
        for(int i = 0; i < len_of_arr; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}