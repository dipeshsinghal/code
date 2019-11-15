package com.study.code;

public class BinarySearch {

    //sort in ascending order using bubble sort
    protected static int search(int[] array, int start, int end, int number){

        if ( start > end )
            return -1;

        int mid = (start + end);

        if( number == array[mid]) {
            return mid;
        } else if ( number < array[mid] ) {
            return search(array, start, mid-1, number);
        } else {
            return search(array, mid+1, end, number);
        }


    }

    public static void main(String args[]) {

        int[] array = {0, 1, 2, 4, 5, 8, 12, 15, 20};

        System.out.println(" 5 found at: " + search(array, 0, array.length-1, 5));

        System.out.println(" 6 found at: " + search(array, 0, array.length-1, 6));

    }
}
