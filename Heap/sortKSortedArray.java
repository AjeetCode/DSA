import java.util.Arrays;
import java.util.PriorityQueue;

/*
3. Sort K-Sorted Array
Problem: Every element is at most K positions away from its sorted position.
Example: [6, 5, 3, 2, 8, 10, 9], K = 3
Answer: [2, 3, 5, 6, 8, 9, 10]
*/
class sortKSortedArray {
    public static int[] SortKSorted(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0;
        for(int ele : arr) {
            pq.add(ele);
            if(pq.size() > k) {
                int element = pq.poll();
                arr[i++] = element;
            }
        }
        while(!pq.isEmpty()) {
            arr[i++] = pq.poll();
        }
        return arr;
    }
    public static void main(String args[]) {
        int[] arr = {6,5,3,2,8,10,9};
        int k = 3;
        SortKSorted(arr, k);
        for(int ele : arr) {
        System.out.print(ele + ",");
        }
    } 
}
