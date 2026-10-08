// Search for a given number in a sorted array.
class BinarySearch {
    public static void main(String args[]) {
        int arr[] = {9,8,7,6,5,4,3,2,1,0};
        int target  = 7;
        int s = 0;
        int e = arr.length;
        while(s <= e) {
            int mid = s + (e - s) / 2;
            if(arr[mid] == target) {
                System.out.println("The index is = " + mid);
                return;
            } else if(arr[mid] > target) {
                s = mid + 1; 
            } else {
                e = mid - 1;
            }
        }       
        System.out.println("-1");
    }
}