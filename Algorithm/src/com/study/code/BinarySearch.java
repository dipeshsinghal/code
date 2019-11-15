package com.study.code;

public class BinarySearch {

    //recursive approach
    protected static int search(int[] array, int start, int end, int number){

        if ( start > end )
            return -1;

        int mid = (start + end) / 2;

        if( number == array[mid]) {
            return mid;
        } else if ( number < array[mid] ) {
            return search(array, start, mid-1, number);
        } else {
            return search(array, mid+1, end, number);
        }


    }

    //Non-recursive approach
    protected static int searchNonRecursive(int[] array, int number){

        int start = 0;
        int end = array.length - 1;

        while( start <= end ) {
            int mid = (start + end) / 2;
            if (number == array[mid]) {
                return mid;
            } else if (number < array[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;


    }

    public static void main(String args[]) {

        int[] array = {0, 1, 2, 4, 5, 8, 12, 15, 20};

        System.out.println(" 5 found at: " + search(array, 0, array.length-1, 5));

        System.out.println(" 6 found at: " + search(array, 0, array.length-1, 6));

        System.out.println("using searchNonRecursive");

        System.out.println(" 5 found at (): " + searchNonRecursive(array, 5));

        System.out.println(" 6 found at: " + searchNonRecursive(array, 6));

    }
}
