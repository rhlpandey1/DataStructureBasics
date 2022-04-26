package org.gfg.sorting;

import java.util.Arrays;

/**
 * Time Complexity: O(n^2)
 * Stable:Yes
 * No swapping required
 * Insert the lowest element at the beginning
 */
public class InsertionSort {
    public static void main(String[] args) {

        int arr[]={20,35,-17,5,55,1,-22};
        for(int i=1;i<arr.length;i++){
            int newElement=arr[i];
            int j;
            for(j=i;j>0 && arr[j-1]>newElement;j--){
                arr[j]=arr[j-1];
            }
            arr[j]=newElement;
        }

        System.out.println(Arrays.toString(arr));

    }
}
