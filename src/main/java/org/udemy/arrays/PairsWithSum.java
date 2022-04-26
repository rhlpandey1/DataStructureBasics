package org.udemy.arrays;

import java.util.HashSet;
import java.util.Set;

public class PairsWithSum {
    //O(n^2)
    public static boolean hasPairs(int arr[],int sum){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum)
                    return true;
            }
        }
        return false;
    }
    //O(n)
    public static boolean hasPairs1(int arr[],int sum){
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i]))
             return true;
            set.add(sum-arr[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int sum=8;
        System.out.println(hasPairs(arr,sum));
        System.out.println(hasPairs1(arr,sum));

    }
}
