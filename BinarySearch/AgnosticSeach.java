class AgnosticSeach {
    public static int BSinc(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        while(s <= e) {
            int mid = s + (e - s)/2;
            if(arr[mid] == target) {
                return mid;
            }
            else if(target < arr[mid]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }
    public static int BSdec(int[] arr, int target) {
        int s = 0;
        int e = arr.length;
        while(s <= e) {
            int mid = s + (e - s)/2;
            if(arr[mid] == target) {
                return mid;
            }
            else if(target > arr[mid]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1; 
    }
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5,6,6,8,9,10};
        int target = 5;
        int l = arr.length;
        if(l == 0) {
            System.out.println("-1");
        }
        else if(l == 1) {
            if(arr[0] == target) System.out.println("0");
            else System.out.println("-1");
        }
        else if(l > 1) {
            if(arr[0] > arr[l-1]) {
                int ans = BSdec(arr, target);
                System.out.println(ans);
            } else {
                int ans = BSinc(arr, target);
                System.out.println(ans);
            }
        }
    }
}