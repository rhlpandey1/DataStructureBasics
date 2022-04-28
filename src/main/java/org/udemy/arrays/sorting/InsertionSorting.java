package org.udemy.arrays.sorting;

import java.util.Arrays;

public class InsertionSorting {
    public static void main(String[] args) {
        int[] arr={4,2,1,6,7,9,34,12};
        //insert the smaller number at specific position
        int n=arr.length;
        for(int i=1;i<n;i++){
          int key=arr[i];
          int j=i-1;
          while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
            j=j-1;
          }
        arr[j+1]=key;

        }
        System.out.println(Arrays.toString(arr));
    }
}
