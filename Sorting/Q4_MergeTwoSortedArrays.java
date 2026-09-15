class Q4_MergeTwoSortedArrays {
    public static void main(String args[]) {
        int arr1[] = {1, 2, 3, 5, 7, 8, 9, 11, 14, 16, 34};
        int arr2[] = {2, 4, 6, 7, 8, 9, 12, 34, 37, 55, 76};
        int arrM[] = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        // merging 
        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] >= arr2[j]) {
                arrM[k++] = arr2[j++];
            } else {
                arrM[k++] = arr1[i++];
            }
        }
        // remaining left array element
        while(i < arr1.length) {
            arrM[k++] = arr1[i++];
        } 
        // remaining right array element
        while(j < arr2.length) {
            arrM[k++] = arr2[j++];
        }
        for(int ar : arrM) {
            System.out.print(ar + " ");
        }
    }
}