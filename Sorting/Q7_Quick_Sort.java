class Q7_Quick_Sort {
    public static void quickSort(int[] arr, int si, int ei) {
         if(si >= ei) return;
         int pivotIdx = pivotIndex(arr, si, ei);
         quickSort(arr, si, pivotIdx - 1);
         quickSort(arr, pivotIdx + 1, ei);
    }
    public static int pivotIndex(int[] arr, int s, int e) {
        int k = s - 1;
        int pe = arr[e];
        for(int i = s; i < e; i++) {
            if(arr[i] < pe) {
                k++;
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }
        k++;
        int temp = arr[e];
        arr[e] = arr[k];
        arr[k] = temp;
        return k;
    }
    public static void main(String args[]) {
        int arr[] = {12, 4, 7, 3, 15, 1, 9};
        int end = arr.length - 1;
        quickSort(arr, 0, end);
        for(int ar : arr) {
            System.out.print(ar + " ");
        }
    }
}