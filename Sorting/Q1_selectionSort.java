class Q1_selectionSort {
    public static void main(String args[]) {
        int arr[] = {12, 4, 7, 3, 15, 1, 9};
        int l = arr.length;
        for(int i = 0; i < l; i++) {
            int small = i;
            for(int j = i+1; j < l; j++) {
                if(arr[j] < arr[small]) {
                    small = j;
                }
            }
            swap(arr, small, i);
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