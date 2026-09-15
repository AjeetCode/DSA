class Sort_0_and_1 {
    public static void main(String args[]) {
        int arr[] = {1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1};
        int i = 0;
        int j = arr.length - 1;
        while(i < j) {
            if(arr[i] == 0 && arr[j] == 1) {
                i++;
                j--;
            } else if(arr[i] == 1 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else if(arr[i] == 0 && arr[j] == 0) {
                i++;
            } else if(arr[i] ==1 && arr[j] == 1) {
                j--;
            }
        }
        for(int ar : arr) {
            System.out.print(ar + " ");
        }
    }
}