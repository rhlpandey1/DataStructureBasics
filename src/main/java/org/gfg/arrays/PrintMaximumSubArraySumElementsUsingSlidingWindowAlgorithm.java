package org.gfg.arrays;

import java.util.Arrays;

public class PrintMaximumSubArraySumElementsUsingSlidingWindowAlgorithm {
    public static void maxSumUsingSlidingWindow ( int[] arr, int k){
        int n = arr.length;
        if (n < k)
            return;
        int maxSum = 0;
        int sum = 0;
        int start = 0;
        int[] arr1 = new int[k];
        for (int end = 0; end < n; end++) {
            sum += arr[end];
            if (end >= k - 1) {
                if (sum > maxSum) {
                    maxSum = sum;
                    int i = 0;
                    while (i < k) {
                        arr1[i++] = arr[end - i + 1];
                    }
                }
                sum = sum - arr[start];
                start++;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        maxSumUsingSlidingWindow(arr, k);
    }

}