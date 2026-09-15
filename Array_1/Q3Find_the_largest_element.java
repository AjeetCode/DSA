// Q3. Find the largest element

// Input:

// [5, 8, 2, 10, 3]

// Output:

// 10

class Q3Find_the_largest_element {
    public static void main(String args[]) {
        int arr[] = {2, 4, 5, 23, 45, 98, 90, 11};
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            // max = Math.max(arr[i], max);
            // if(max < arr[i]) {
            //     max = arr[i];
            // }
            max = max < arr[i] ? arr[i] : max;
        }
        System.out.print("maximum element = " + max);
    }
}