package com.study.study_space.shujujiegou.paixu;

public class Erfenchazhao {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 15, 34, 45, 89};
        System.out.println(getNum(arr, 3));
    }

    public static int getNum(int[] arr, int key) {

        int middle;
        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {
            middle = (end - start) / 2 + start;
            if (key < arr[middle]) {
                end = middle - 1;
            } else if (key > arr[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
