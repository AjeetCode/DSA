// Q2. Find the sum of all elements

// Input:

// [10, 20, 30, 40]

// Output:

// 100

class Q2Find_the_sum_of_all_elements { 
    public static void main(String args[]) {
        int arr[] = {3, 4, 1, 3, 6, 7, 8, 8, 9, 10};
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.print(sum);
    }
}