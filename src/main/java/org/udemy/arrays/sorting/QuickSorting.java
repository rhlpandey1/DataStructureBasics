package org.udemy.arrays.sorting;

import java.util.Arrays;

public class QuickSorting {
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }
    public static  void quickSort(int arr[],int low,int high){
        if(low<high){
            int pi=partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }

    }
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        System.out.println("Before Sort "+ Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println("After sorting "+Arrays.toString(arr));
    }
}
