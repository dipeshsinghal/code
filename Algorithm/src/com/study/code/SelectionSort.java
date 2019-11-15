package com.study.code;

public class SelectionSort {

    //sort in ascending order using selection sort
    protected static void sort(int[] array){
        int swapCount = 0;
        for(int i = 0 ; i < array.length ; i++) {

            //to make only one swap per iteration
            int min = i;

            for(int j = 1 ; j < array.length ; j++ ) {
                if( array[min] > array[j]){
                    min = j;
                }
            }
            //if min element is not at current i position swap it.
            if(min != i) {
                swapCount++;
                Common.swap(array, i, min);
            }

        }
        System.out.println("\nTotal Swap Count : "+swapCount);
    }

    public static void main(String args[]) {

        int[] array = {7, 4, 2, 0, 1, 5, 3, 8, 9};

        System.out.println("    Array length : "+array.length);
        System.out.print("  Original Array : ");

        for(int i = 0 ; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }

        sort(array);

        System.out.print("    Sorted Array : ");

        for(int i = 0 ; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
