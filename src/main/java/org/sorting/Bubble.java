package org.sorting;

import java.util.Arrays;

public class Bubble {
    public static void sort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
    public static void main(String[] args) {
        int[] array={20,35,-15,7,55,1,-22};
        Bubble.sort(array);
        System.out.println(Arrays.toString(array));

    }
}