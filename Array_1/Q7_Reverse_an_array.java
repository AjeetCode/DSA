// Level 2: Array Manipulation

// These are frequently asked in beginner interviews.

// Q7. Reverse an array

// Input:

// [1, 2, 3, 4, 5]

// Output:

// [5, 4, 3, 2, 1]

class Q7_Reverse_an_array {
    public static void main(String args[]) {
        int arr[] = {1, 3, 5, 7, 2, 12, 23, 43, 88, 90, 97, 34};
        // array before 
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int lastIndex = arr.length - 1;
        for(int i = 0; i < arr.length / 2; i++) {
            int temp = arr[lastIndex];
            arr[lastIndex] = arr[i];
            arr[i] = temp;
            lastIndex --;
        }
        // array after 
         for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}