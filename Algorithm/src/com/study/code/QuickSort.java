package com.study.code;

public class QuickSort {

    protected static int partition(int[] array, int left, int right){

        //Choose right most element as pivot
        int pivot = array[right];

        int ll = left-1;
        int rr = right;

        do{

            while( ll < right && array[++ll] < pivot);

            while ( rr > left && array[--rr] > pivot );

            if( ll >= rr ) break;

            Common.swap(array, ll, rr);

        } while ( true );
        Common.swap(array, ll, right);
        return ll;

    }

    //sort in ascending order using merge sort
    protected static void sort(int[] array, int left, int right){

        if(left < right){

            int pivotLoc = partition(array, left, right);

            sort(array, left, pivotLoc-1);

            sort(array, pivotLoc+1, right);

        }

    }

    public static void main(String args[]) {

        //randomly sorted array
        int[] array = {7, 4, 2, 0, 1, 5, 3, 8, 9};

        //sorted in reverse direction
        //int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        //already sorted array
        //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("  Array length: "+array.length);
        System.out.print("Original Array: ");

        for(int i = 0 ; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }

        sort(array, 0, array.length-1);

        System.out.print("\n  Sorted Array: ");
        for(int i = 0 ; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
