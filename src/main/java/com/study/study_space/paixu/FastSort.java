package com.study.study_space.paixu;

import java.util.Arrays;

public class FastSort {

    public static void main(String[] args) {

        int[] arr = {9, 4, 5, 62, 34, 2, 3, 42};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }


    public static void quickSort(int[] arr,int low,int high) {

        if(low >= high) {
            return ;
        }
        int i = low;
        int j = high;
        int flag = arr[low];
        while (i < j) {
            while (i < j && arr[j] > flag) {
                j--;
            }
            while (i < j && arr[i] <= flag) {
                i++;
            }
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        arr[low]=arr[i];
        arr[i]=flag;

        quickSort(arr,low,j-1);
        quickSort(arr,j,high);
    }


}
