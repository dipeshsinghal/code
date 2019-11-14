package com.study.code;

public class InsertionSort {

    //sort in ascending order using insertion sort
    protected static void sort(int[] array){

        for(int i = 1 ; i < array.length ; i++) {

            int key = array[i];
            int j = i;
            while(j > 0 && key < array[j-1]) {
                //Not swapping, putting key at final position in end of iteration.
                array[j] = array[j-1];
                j--;
            }

            array[j] = key;
        }
    }

    public static void main(String args[]) {

        int[] array = {7, 4, 2, 0, 1, 5, 3, 8, 9};

        System.out.println(" Array length : "+array.length);
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
