import java.util.PriorityQueue;

/*
9. Sum of Elements Between K1 and K2
Problem: Sum the elements strictly between the K1-th and K2-th smallest elements.
Example: [1, 3, 12, 5, 15, 11], K1 = 3, K2 = 6
Answer: 23 (11 + 12)
*/
class sumOfElementsBetweenK1AndK2 {
    public static int sum(int[] nums, int k1, int k2) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums) {
            pq.add(num);
        }
        int i = 0;
        while(i < k1) {
            pq.poll();
            i++;j
        }
        int j = 0;
        int sum = 0;
        while(j < k2-k1-1) {
            sum += pq.poll();
            j++;
        }
        return sum;
    }
    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5,6,7,8,9,1,0};
        int k1 = 2;
        int k2 = 6;
        int sum = sum(arr,k1,k2);
        System.out.println("the sum is = " + sum);
    }
}
