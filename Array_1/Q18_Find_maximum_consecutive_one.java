// Q18. Find maximum consecutive ones

// Input:

// [1,1,0,1,1,1]

// Output:

// 3

class Q18_Find_maximum_consecutive_one {
    public static void main(String args[]) {
        int arr[] = {1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int ans = 0;
        for(int i = 0; i < arr.length; i++) {
            int count = 0;
            while(arr[i] == 1){
                count ++;
                i++;
                if(i == arr.length) break;
            }
            ans = Math.max(ans, count);
        }
        System.out.print("total number of consecutive one = " + ans);
    }
}


