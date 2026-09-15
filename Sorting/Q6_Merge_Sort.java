class Q6_Merge_Sort {
    public static void mergSort(int[] arr, int start, int end) {
        if(start >= end) return;
        int mid = start + (end - start) / 2;
        mergSort(arr, start, mid);
        mergSort(arr, mid + 1, end);
        merg(arr, start, mid, end);
    }
    public static void merg(int arr[], int si, int mid, int ei) {
        int mArr[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j <= ei) {
            if(arr[i] < arr[j]) {
                mArr[k++] = arr[i++];
            } else {
                mArr[k++] = arr[j++];
            }
        }
        while(i <= mid) {
            mArr[k++] = arr[i++];
        }
        while(j <= ei) {
            mArr[k++] = arr[j++];
        }
        for(int a = 0, b = si; b <= ei; a++, b++) {
            arr[b] = mArr[a];
        }
    }
    public static void main(String args[]) {
        int arr[] = {12, 4, 7, 3, 15, 1, 9};
        int end = arr.length - 1;
        mergSort(arr, 0, end);
        for(int ar : arr) {
            System.out.print(ar + " ");
        }

    }
}