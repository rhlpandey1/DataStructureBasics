package org.sorting;

import java.util.Arrays;

public class SelectionSortDemo {
    public static void swap(int[] array,int i,int j){
        if(i==j)
            return;
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;

    }
    public static void main(String[] args) {
        int[] array={20,35,-15,7,55,1,-22};
        for(int lastUnsortedIndex=array.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
            int largest=0;
            for(int i=1;i<=lastUnsortedIndex;i++){
                if(array[i]>array[largest])
                    largest=i;
            }
            swap(array,largest,lastUnsortedIndex);
        }
        System.out.println(Arrays.toString(array));
    }
}
