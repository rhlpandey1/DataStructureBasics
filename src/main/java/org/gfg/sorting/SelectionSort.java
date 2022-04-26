package org.gfg.sorting;

import java.util.Arrays;

/*
The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order)
 from unsorted part and putting it at the beginning
 Complexity : O(n^2)
 */
public class SelectionSort {
    public static void main(String[] args) {
        int arr[] ={64,25,12,22,11};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min])
                    min=j;
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}
