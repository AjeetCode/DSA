// Q14. Find missing number from 1 to N
// Input: {1, 6, 3, 2, 4, 8, 7, 10, 9, 11}
// Output: 5
// You are given an array containing numbers from 1 to N, but one number is missing.
// You have to find which number is missing.


class Q14_Find_missing_number_from_1_to_N {
    public static void main(String args[]) {
        int arr[] = {1, 6, 3, 2, 4, 8, 7, 10, 9, 11};
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2; 
        int sumOfArray = 0;
        for(int i = 0; i < arr.length; i++) {
            sumOfArray += arr[i]; 
        }
        System.out.print("the missing number is = " + (sum - sumOfArray));
    }
}