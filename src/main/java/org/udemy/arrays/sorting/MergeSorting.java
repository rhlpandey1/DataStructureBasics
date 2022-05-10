package org.udemy.arrays.sorting;

import java.util.Arrays;

public class MergeSorting {

    public static void merge(int[] arr,int l,int m,int r){

        //create 2 temporary arrays
        int n1=m-l+1;
        int n2=r-m;
        int[] left=new int[n1];
        int[] right=new int[n2];
        //first half to left array and second half to right array
        for(int i=0;i<n1;i++)
            left[i]=arr[l+i];
        for(int j=0;j<n2;j++)
            right[j]=arr[m+1+j];

        //Merge the 2 temporary arrays
        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2 ){
            if(left[i]<=right[j])
                arr[k++]=left[i++];
            else
                arr[k++]=right[j++];
        }
        //copy the remaining elements
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }
    }

    //recursive sort method
    public static void sort(int[] arr,int l,int r){

        if(l<r){
            int m=l+(r-l)/2;
            //l to mid
            sort(arr,l,m);
            //mid+1 to right
            sort(arr,m+1,r);
            merge(arr,l,m,r);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        System.out.println("Before Sort "+ Arrays.toString(arr));
        sort(arr,0,arr.length-1);
        System.out.println("After sorting "+Arrays.toString(arr));
    }
}
