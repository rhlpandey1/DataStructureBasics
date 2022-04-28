package org.udemy.arrays.sorting;

import java.util.Arrays;

public class SelectionSorting {
    public static void swap(int i,int j,int[] arr){
        if(i==j)
            return;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr={2,4,1,6,7,9,12,34};
        //move minimum element to the first i.e. 0th position
        int n=arr.length;
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min])
                    min=j;
            }
            swap(i,min,arr);
        }
        System.out.println(Arrays.toString(arr));
    }
}
