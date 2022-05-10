package org.udemy.basics;

import java.util.Arrays;

public class DsDemo {
    public static void merge(int[] arr,int l,int m,int r){
        //we need to take 2 temp arrays
        int n1=m-l+1;
        int n2=r-m;
        int[] L=new int[n1];
        int[] R=new int[n2];

        for(int i=0;i<n1;i++)
            L[i]=arr[l+i];
        for(int j=0;j<n2;j++)
            R[j]=arr[m+1+j];

        int i=0;
        int j=0;
        int k=l;

        while(i<n1 && j<n2){
            if(L[i]<R[j]){
                arr[k++]=L[i++];
            }
            else
                arr[k++]=R[j++];
        }
        while(i<n1)
            arr[k++]=L[i++];
        while(j<n2)
            arr[k++]=R[j++];

    }

    public static void sort(int[] arr,int l,int r){
        if(l<r){
            int m=l+(r-l)/2;
            sort(arr,l,m);
            sort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }

    public static void main(String[] args) {
        System.out.println(Math.pow(5,1000));
        //Merge sort  O(nlogn)
        int[] arr={2,4,1,6,7,9,12,34};
        int l=0;
        int r=arr.length-1;
        sort(arr,l,r);
        System.out.println(Arrays.toString(arr));
    }
}
