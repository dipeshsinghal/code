package com.study.code;

public class BubbleSort {

    //sort in ascending order using bubble sort
    protected static void sort(int[] array){
        for(int i = 0 ; i < array.length ; i++) {

            //optimization of sorting early
            boolean swapedInIteration = false;

            for(int j = 1 ; j < array.length ; j++ ) {
                if(array[j] < array[j-1]){
                    Common.swap(array, j, j-1);
                    swapedInIteration = true;
                }
            }

            if(!swapedInIteration){
                //Current iteration no swap mean array is already sorted
                System.out.println("\n    Iteration : "+(i+1));
                break;
            }
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

        System.out.print("  Sorted Array: ");
        for(int i = 0 ; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
