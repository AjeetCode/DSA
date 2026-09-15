class Q2_bubbleSort {
    public static void main(String args[]) {
        int arr[] = {12, 4, 7, 3, 15, 1, 9};
        int l = arr.length;
        for(int i = 0; i < l-1; i++) {
            for(int j = 0; j < l - i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
        for(int ar : arr)
        System.out.print(ar + " ");
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}