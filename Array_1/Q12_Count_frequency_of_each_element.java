import java.util.HashMap;
class Q12_Count_frequency_of_each_element {
    public static void main(String args[]) {
        // int arr[] = {2, 4, 1, 6, 7, 9, 10, 11, 41, 1, 0, -1, 6, 9, 11, 40, 41};
        int arr[] = {1, 1, 2, 3, 2, 4, 3, 5, 4, 6, 7, 7, 7, 6, 8, 9, 8, 7, 6, 5, 4, 3, 9, 0, 9, 8, 7, 6, 5, 4, 3, 2, 4};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(hm);
        System.out.println("key\tValue");
        for(Integer key : hm.keySet()) {
            System.out.println(key + "\t" + hm.get(key));
        }
    }
}
// find the timme and space commplexity.