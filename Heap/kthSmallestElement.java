// 
// 1. K-th Smallest Element
// Problem: Given an array, find the K-th smallest element.
// Example:
// Array = [7, 10, 4, 3, 20, 15]
// K = 3
// Sorted:
// 3, 4, 7, 10, 15, 20
//       ↑
//     3rd
// Answer: 7
// 

import java.util.*;
class kthSmallestElement {
    public static int kthSmallestElement(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : arr) {
            pq.add(ele);
            if(pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }
    public static void main(String args[]) {
        int arr[] = {5,1,5,6,8,1,3,9,3,0}; 
        int k = 7;
        System.out.print(k + " smallest element is = " + kthSmallestElement(arr, k));
    }
}