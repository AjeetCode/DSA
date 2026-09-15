class Q3_insertionSort {
    public static void main(String args[]) {
        int arr[] = {12, 4, 7, 3, 15, 1, 9};
        int l = arr.length;
        for(int i = 1; i < l; i++) {
            int j = i;
            while(j > 0 && arr[j-1] > arr[j] ) {
                swap(arr, j-1, j);
                j--;
            }
        }
        for(int ar : arr) {
            System.out.print(ar + " ");
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}