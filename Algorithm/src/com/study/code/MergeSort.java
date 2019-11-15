package com.study.code;

public class MergeSort {

    protected static int[] extraArray;

    protected static void merge(int[] array, int left, int mid, int right){
        int i = left;
        int ll = left;
        int rr = mid+1;

        while( ll <= mid && rr <= right ) {
            if(array[ll] <= array[rr]) {
                extraArray[i++] = array[ll++];
            } else {
                extraArray[i++] = array[rr++];
            }
        }
        while( ll <= mid ) {
            extraArray[i++] = array[ll++];
        }
        while (rr <= right ) {
            extraArray[i++] = array[rr++];
        }

        i = left;
        while( i <= right ) {
            array[i] = extraArray[i++];
        }

    }

    //sort in ascending order using merge sort
    protected static void mergeSort(int[] array, int left, int right){

        if(left < right){

            int mid = (left + right)/2;

            mergeSort(array, left, mid);

            mergeSort(array, mid+1, right);

            merge(array, left, mid, right);
        }

    }

    //wrapper to create extra space
    protected static void sort(int[] array){

        //Allocating memory only once which is used across all the iteration.
        extraArray = new int[array.length];
        mergeSort(array, 0, array.length-1);

    }

    public static void main(String args[]) {

        //int[] array = {7, 4, 2, 0, 1, 5, 3, 8, 9};

        //int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("  Array length: "+array.length);
        System.out.print("Original Array: ");

        for(int i = 0 ; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }

        sort(array);

        System.out.print("\n  Sorted Array: ");
        for(int i = 0 ; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
