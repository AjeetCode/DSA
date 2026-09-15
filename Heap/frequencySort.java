import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/*
6. Frequency Sort
Problem: Sort elements by frequency, with most frequent elements first.
Example: [1, 1, 1, 3, 3, 2]
Answer:  [1, 1, 1, 3, 3, 2]
*/
class frequencySort {
    public static void fSort(int[] arr) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int num : arr) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> hm.get(b) - hm.get(a)); 
        for(int num : arr) {
            pq.add(num);
        }
        int i = 0;
        while(pq.isEmpty()) {
            arr[i++] = pq.poll();
        }
    }
    public static void main(String args[]) {
        int[] arr = {1, 1, 1, 3, 3, 2};
        fSort(arr);
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
