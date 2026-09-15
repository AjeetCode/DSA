import java.util.PriorityQueue;

/*
2. K-th Largest Element
Problem: Given an array, find the K-th largest element.
Example: [7, 10, 4, 3, 20, 15], K = 3
Answer: 10
*/
class kthLargestElement {
    public static int kthLargestElement(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele : arr) {
            pq.add(ele);
            if(pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }
    public static void main(String args[]) {
        int[] arr = {3,1,2,4,5,1,4,6,1,5,2,6,77,8,9,0,11};
        int k = 7;
        System.out.print(k + " largest element is = " + kthLargestElement(arr, k));
    }
}
