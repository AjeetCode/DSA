// class Q9_Find_the_second_largest_element {
//     public static void main(String args[]) {
//         int arr[] = {2, 4, 1, 6, 7, 9, 10, 11, 41, 1, 0, 6, 9, 11, 40, 41};
//         int largest = Integer.MIN_VALUE;
//         int secLarEl = Integer.MIN_VALUE;
//         for(int el : arr) {
//             if(el > largest) {
//                 secLarEl = largest;
//                 largest = el;
//             }
//             if(el < largest && el > secLarEl){
//                 secLarEl = el;
//             }
//         }
//         System.out.print("Second laregst element = " + secLarEl);
//     }
// }


// method 2
import java.util.*;
class Q9_Find_the_second_largest_element {
    public static void main(String args[]) {
        // int arr[] = {2, 4, 1, 6, 7, 9, 10, 11, 41, 1, 0, 6, 9, 11, 40, 41};
        int arr[] = {100, 50, 40, 30};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < arr.length; i++) {
            if(!pq.contains(arr[i])){
                pq.add(arr[i]);
            }
            if(pq.size() > 2) {
                pq.remove();
            }
        }
        System.out.print("second largest element = " + pq.remove());
    }
}