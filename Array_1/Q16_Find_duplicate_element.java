// Q16. Find duplicate element

// Input:

// [1, 2, 3, 4, 2]

// Output:

// 2

import java.util.HashMap;
class Q16_Find_duplicate_element {
    public static void main(String args[]) {
        int arr[] = {1, 1, 1, 2, 3, 3, 4, 6, 6, 6, 7, 9, 9, 9, 9, 10, 11, 12, 12, 12, 12, 14, 15, 15, 15, 16, 17, 17};
        int l = arr.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < l; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        for(int key : hm.keySet()) {
            if(hm.get(key) > 1) {
                System.out.print(key + " ");
            }
        }
    }
}