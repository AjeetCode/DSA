class CountOfAnElement {
    public static int LastOccurence(int arr[], int ele) {
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        while(s <= e) {
            int mid = s+(e-s)/2;
            if(arr[mid] == ele) {
                ans = mid;
                s = mid + 1;
            } else if(arr[mid] > ele) {
                e = mid - 1;
            } else {
                s = mid + 1; 
            }
        }
        return ans;
    }
    public static int FirstOccurence(int arr[], int ele) {
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        while(s <= e) {
            int mid = s+(e-s)/2;
            if(arr[mid] == ele) {
                ans = mid;
                e = mid - 1;
            } else if(arr[mid] > ele) {
                e = mid - 1;
            } else {
                s = mid + 1; 
            }
        }
        return ans;
    }
    public static void main(String args[]) {
        int[] arr = {1,1,2,2,3,3,3,3,4,4,4,4,4,4,5,5,5,5,5,5,5,5,6,6,6,6,6,6,7,7,7,7,7,7,8,8,8,8,8,9,9,9,9,9,10,10,10,11,12};
        int ele = 7;
        int l = arr.length;
        int lo = LastOccurence(arr, ele);
        int fo = FirstOccurence(arr, ele);
        int ans = lo - fo + 1;
        System.out.print("length = " + l + " Count = " + ans);
    }
}