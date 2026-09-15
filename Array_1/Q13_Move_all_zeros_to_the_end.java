// Q13. Move all zeros to the end

// Input:

// [1, 0, 2, 0, 3, 0]

// Output:

// [1, 2, 3, 0, 0, 0]

// first i can count all the zeros and 

class Q13_Move_all_zeros_to_the_end {
    public static void main(String args[]) {
        int arr[] = {0, 0, 1, 2, 5, 3, 0, 0, 6, 8, 9, 10, 12, 23, 45, 56, 67, 0, 9, 0};
        // bring all non zero element to the left side.
        int start = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                arr[start] = arr[i];
                start++;
            }
        }
        // add all zeros after non-zero element
        for(int i = start; i < arr.length; i++) {
            arr[i] = 0;
        }
        // print all array elements 
        for(int el : arr) {
            System.out.print(el + " ");
        }
    }
}

// {2, 3, -1, -5, -7, 8, -10, 10, 15} seprte negative and positive.