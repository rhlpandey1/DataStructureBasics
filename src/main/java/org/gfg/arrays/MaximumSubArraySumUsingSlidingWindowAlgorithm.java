package org.gfg.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumSubArraySumUsingSlidingWindowAlgorithm {
    public static int maxSumUsingBruteForce(int[] arr,int k){
        int n=arr.length;
        if(n<k)
            return -1;
        int maxSum=0;
        for(int i=0;i<n-k;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum=sum+arr[j];
            }
            maxSum=Math.max(sum,maxSum);

        }
        return maxSum;
    }
    public static int maxSumUsingSlidingWindow(int[] arr,int k){
        int n=arr.length;
        if(n<k)
            return -1;
        int maxSum=0;
        int sum=0;
        int start=0;
        for(int end=0;end<n;end++){
            sum+=arr[end];
            if(end>=k-1){
                maxSum=Math.max(sum,maxSum);
                sum=sum-arr[start];
                start++;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr={2, 1, 5, 1, 3, 2};
        int k=3;
        System.out.println(maxSumUsingBruteForce(arr,k));
        System.out.println(maxSumUsingSlidingWindow(arr,k));
    }
}
