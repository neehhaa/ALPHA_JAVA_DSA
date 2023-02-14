package com.sortingtechniques.countingsort;

public class CountingSort {

    public static void countingSort(int arr[]) {

        //Find the largest value, so you can set number of counter variable accordingly.
        int largest = Integer.MIN_VALUE; //minimum value so we can compare with large values.

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>largest){
                largest = arr[i];
            }
        }
        //For counter array
        //we will create space for each and every variable till largest

        int counter[] = new int[largest+1];

        for (int i = 0; i < counter.length; i++) {
            counter[arr[i]]++;
        }

        // for sorting
        int j =0;
        for (int i = 0; i < counter.length; i++) {
            while (counter[i]>0){
                arr[j] = i;
                j++;
                counter[i]--;
            }
        }
    }
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,4,1,3,2,4,3,7};
        countingSort(arr);
        printArray(arr);
    }
}
