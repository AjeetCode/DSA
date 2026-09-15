// Q6. Search an element (Linear Search)

// Input:

// [10, 20, 30, 40]
// Target = 30

// Output:

// Found at index 2

class Q6_Search_an_element_Linear_Search {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        int target = 21;
        int index = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                index = i;
            }
        }
        if(index == -1) {
            System.out.print("not found");
        } else {
            System.out.print("found at index = " + index);
        }
    }
}