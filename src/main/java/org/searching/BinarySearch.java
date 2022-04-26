package org.searching;

import java.util.Arrays;

/**
 * time complexity of linear search algorithm is O(n)
 * time complexity : O(log n). Best case O(1)
 *
 */
public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={12,31,5,34,56,32,45,90};
        int ele=12;
        int index = 0;
        arr=Arrays.stream(arr).sorted().toArray();
        System.out.println(Arrays.toString(arr));
        //way 1: using in build method
        System.out.println("Element found at "+Arrays.binarySearch(arr,ele));
        //way 2: using logic
        int lower=0;
        int higher=arr.length-1;
        boolean flag=false;
        while(lower<=higher){
            int mid=(lower+higher)/2;
            if(arr[mid]==ele){
                index=mid;
                flag=true;
                break;
            }
            else if(arr[mid]<ele){
                lower=mid+1;
            }
            else if(arr[mid]>ele){
                higher=mid-1;
            }
        }

        if(flag==true)
             System.out.println(" Element "+ele+" found at index "+index);
        else
            System.out.println("Element is not found");

    }
}
