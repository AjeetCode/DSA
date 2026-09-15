// class Q10_Find_the_second_smallest_element {
//     public static void main(String args[]) {
//         int arr[] = {2, 4, 1, 6, 7, 9, 10, 11, 41, 1, 0, -1, 6, 9, 11, 40, 41};
//         int smallest = Integer.MAX_VALUE;
//         int secSmlVal = Integer.MAX_VALUE;
//         for(int el : arr) {
//             if(el < smallest) {
//                 secSmlVal = smallest;
//                 smallest = el;
//             }
//             if(el < secSmlVal && el > smallest) {
//                 secSmlVal = el;
//             }
//         }
//             System.out.print("the second smallest element is = " + secSmlVal);
//     }
// }


// method 2
import java.util.*;
class Q10_Find_the_second_smallest_element {
    public static void main(String args[]) {
        int arr[] = {2, 4, 1, 6, 7, 9, 10, 11, 41, 1, 0, -1, 6, 9, 11, 40, -2, 41};
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            if(pq.size() > 2) {
                pq.remove();
            }
        }
        System.out.print("the second smallest element is = " + pq.remove());
    }
}