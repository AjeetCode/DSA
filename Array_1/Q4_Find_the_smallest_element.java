// Q4. Find the smallest element

// Input:

// [5, 8, 2, 10, 3]

// Output:

// 2

class Q4_Find_the_smallest_element {
    public static void main(String args[]) {
        int arr[] = {2, 4, 5, 1, 3, 6, 7, 4, 8, 9, 0, -1, 3, -22};
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        System.out.print("min = " + min);
    }
}