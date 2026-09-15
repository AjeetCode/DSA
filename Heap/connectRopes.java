import java.util.PriorityQueue;

/*
8. Connect Ropes
Problem: Connect all ropes with the minimum total cost.
Example: [4, 3, 2, 6]
Answer: 29
*/
class connectRopes {
    public static int connectRope(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : arr) {
            pq.add(num);
        }
        int cost = 0;
        while(pq.size() > 1) {
            int e1 = pq.poll();
            int e2 = pq.poll();
            int l = e1 + e2;
            cost += l;
            pq.add(l);
        }
        return cost;
    }
    public static void main(String args[]) {
        int[] arr = {4, 3, 2, 6};
        System.out.print("the minimum cost is = " + connectRope(arr));
    }
}
