import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Arrays;

/*
5. Top K Frequent Numbers
Problem: Find the K numbers that occur most frequently in an array.
Example: [1, 1, 1, 2, 2, 3], K = 2
Answer: [1, 2]
*/
class topKFrequentNumbers {
    public static int[] frequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> hm.get(a) - hm.get(b));
        for(int num : hm.keySet()) {
            pq.add(num);
            if(pq.size() > k) {
                pq.poll();
            }
        }
        int[] answer = new int[k];
        for(int i = k-1; i >= 0; i--) {
            answer[i] = pq.poll();
        }
        return answer;
    }
    public static void main(String args[]) {
        int[] arr = {1,1,2,2,2,2,1,3,3,4,6,6,6,67,7};
        int[] answer = frequent(arr, 3);
        System.out.println(Arrays.toString(answer));
    }
}
