import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/*
4. K Closest Numbers
Problem: Given an array, X, and K, find the K numbers closest to X.
Example: [5, 6, 7, 8, 9], X = 7, K = 3
Answer: [6, 7, 8]
*/
class kClosestNumbers {
    public static void kClosestToX(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> Math.abs(b-x) - Math.abs(a-x));
        for(int num : arr) {
            pq.add(num);
            if(pq.size() > k) {
                pq.poll();
            }
        }
        while(!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
    public static void main(String args[]) {
        int[] arr = {1,4,7,1,0,9,7,3,2};
        int k = 3;
        int x = 2;
        kClosestToX(arr, k, x);
    }
}
