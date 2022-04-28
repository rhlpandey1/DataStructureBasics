package org.udemy.arrays.sorting;

import java.util.Arrays;

public class BubbleSorting {
    public static void swap(int i,int j,int[] arr){
        if(i==j)
            return;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr={2,4,1,6,7,9,12,34};
        //2 loops -> 0 to n-1 , 0 to n-i-1
        //i=0, j=0 to 7 -> if j>j+1 swap
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1])
                    swap(j,j+1,arr);
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
