// Q5. Count even and odd elements

// Input:

// [1, 2, 3, 4, 5, 6]

// Output:

// Even = 3
// Odd = 3

class Q5_Count_even_and_odd_elements {
    public static void main(String args[]) {
        int arr[] = {1, 3, 4, 6, 9, 10, 11, 13, 15};
        int even = 0;
        int odd = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.print("count of even = " + even + "\t an count of odd = " + odd);
    }
}