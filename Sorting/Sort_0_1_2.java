class Sort_0_1_2 {
    public static void main(String args[]) {
        int arr[] = {0, 2, 1, 2, 0, 1, 1, 0, 2, 1, 0};
        int start = 0;
        int mid = 0;
        int end = arr.length - 1; 
        while(mid <= end) {
            if(arr[mid] == 0){
                swap(arr, start, mid);
                start ++;
                mid ++;
            } else if(arr[mid] == 1) {
                mid ++;
            } else if(arr[mid] == 2) {
                swap(arr, mid, end);
                end --;
            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}