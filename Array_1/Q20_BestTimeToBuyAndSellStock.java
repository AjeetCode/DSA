// Q20. Best Time to Buy and Sell Stock

// Input:

// [7,1,5,3,6,4]

// Output:

// 5

import java.util.Stack;
class Q20_BestTimeToBuyAndSellStock {
    public static void main(String args[]) {
        int arr[] = {7,1,5,3,6,4};
        Stack<Integer> stack = new Stack<>();
        // find previous smallest element
        int pse[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            if(stack.isEmpty()) {
                pse[i] = arr[i];
            } else {
                while(stack.peek() > arr[i]) {
                    stack.pop();
                }
                if(stack.isEmpty()) {
                    pse[i] = arr[i];
                } else {
                    pse[i] = stack.peek();
                }
            }
            stack.push(arr[i]);
        }
        int max = 0;
        int maxi = -1;
        for(int i = 0; i < arr.length; i++) {
            int maxp = arr[i] - pse[i];
            if(max < maxp) {
                max = maxp;
                maxi = i;
            }
        }
        System.out.print("At i = "+maxi+"of"+max);
    }
}


