import java.util.Arrays;
import java.util.PriorityQueue;

/*
7. K Closest Points to Origin
Problem: Given points (x, y), find the K points closest to (0, 0).
Example: [[1, 3], [-2, 2], [5, 8]], K = 2
Answer:  [[-2, 2], [1, 3]]
*/
class kClosestPointsToOrigin {
  public static int[][] closestToOrigin(int[][] nums, int k) {
    PriorityQueue<int []> pq = new PriorityQueue<>((a,b)->b[0]*b[0]+b[1]*b[1]-a[0]*a[0]+a[1]*a[1]);
    for(int[] num : nums) {
      pq.add(num);
      if(pq.size() > k) {
        pq.poll();
      }
    }
    int[][] answer = new int[k][2];
    for(int i = 0; i < k; i++) {
      answer[i] = pq.poll();
    }
    return answer;
  }
  public static void main(String args[]) {
    int arr[][] = {{1,3},{-2,2},{5,8}};
    int [][] ar = closestToOrigin(arr, 2);
    for(int[] a : ar) {
      for(int k : a) {
        System.out.print(k + ", ");
      }
      System.out.println();
    }
  }
}
