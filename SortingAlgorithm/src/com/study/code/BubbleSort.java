package com.study.code;

public class BubbleSort {

    protected static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }
    //sort in ascending order using bubble sort
    protected static void sort(int[] array){
        for(int i = 0 ; i < array.length ; i++) {

            //optimization of sorting early
            boolean swapedInIteration = false;

            for(int j = 1 ; j < array.length ; j++ ) {
                if(array[j] < array[j-1]){
                    swap(array, j, j-1);
                    swapedInIteration = true;
                }
            }

            if(!swapedInIteration){
                //Current iteration no swap mean array is already sorted
                System.out.println("Sorted in "+(i+1)+" iteration array length: "+array.length);
                break;
            }
        }
    }

    public static void main(String args[]) {
        int[] array = {7, 4, 2, 0, 1, 5, 3, 8, 9};
        sort(array);
        System.out.print("Sorted Array: ");
        for(int i = 0 ; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
