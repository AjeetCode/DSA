// Q1. Print all elements of an array

// Input:

// [10, 20, 30, 40, 50]

// Output:

// 10 20 30 40 50

class Q1Print_all_elements_of_an_array {
    public static void main(String args[]) {
        int arr[] = {2, 3, 4, 1, 6, 6, 7, 8, 9, 10};
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }
}