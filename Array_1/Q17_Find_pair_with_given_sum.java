// Q17. Find pair with given sum

// Input:

// [2, 7, 11, 15]
// Target = 9

// Output:

// 2 + 7 = 9


class Q17_Find_pair_with_given_sum {
    public static void main(String args[]) {
        int arr[] = {1, 1, 1, 2, 3, 3, 4, 6, 6, 6, 7, 9, 9, 9, 9, 10, 11, 12, 12, 12, 12, 14, 15, 15, 15, 16, 17, 17};
        int target = 9;
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = i; j < arr.length; j++) {
                if(arr[i] + arr[j] == target) { 
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                }
            }
        }
    }
}