// Q22. Majority Element

// Input:

// [2,2,1,1,1,2,2]

// Output:

// 2
import java.util.HashMap;
class Q22_MajorityElement {
    public static void main(String args[]) {
        int arr[] = {2,2,1,1,1,2,2,2};
        int maxV = 0;
        int maxE = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        for(int key : hm.keySet()) {
            int value = hm.get(key);
            if(maxV < value) {
                maxV = value;
                maxE = key;
            }
        }
        System.out.print("majority element is = " + maxE + " and it occurs " + maxV + " times.");
    }   
}